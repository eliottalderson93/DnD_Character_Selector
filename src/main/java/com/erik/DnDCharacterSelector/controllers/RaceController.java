package com.erik.DnDCharacterSelector.controllers;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.erik.DnDCharacterSelector.models.Choices;
import com.erik.DnDCharacterSelector.models.Roll;
import com.erik.DnDCharacterSelector.objects.Character;
import com.erik.DnDCharacterSelector.services.RollService;

@Controller
public class RaceController {
	private final RollService service;
	public RaceController(RollService r) {
		this.service = r;
	}
	Map<Integer,String> raceMap = new HashMap<Integer,String>(); //all race and class info
	Map<Integer,String> classMap = new HashMap<Integer,String>();
	Map<Integer,String> subRaces = new HashMap<Integer,String>(); //pointers to determined subraces/classes
	Map<Integer,String> subClasses = new HashMap<Integer,String>();
	@RequestMapping("/")
	public String intro(HttpSession session, @ModelAttribute("choices") Choices choices) {
		if((session.getAttribute("isInit") != null)) { //needs to be first page
			return "redirect:/logout";
		}
		initialize(session);
		return "/Character/intro.jsp";
	}
	@PostMapping("/attributes")
	public String attributes(@Valid @ModelAttribute("choices") Choices choices,HttpSession session) {
		if(!(session.getAttribute("isInit").equals(true))) { //needs to be second page
			return "redirect:/logout";
		}
		System.out.println("-------POST-------");
		System.out.println(choices.getRaceChosen());
		System.out.println(choices.getClassChosen());
		session.setAttribute("race",choices.getRaceChosen());
		session.setAttribute("role",choices.getClassChosen());
		raceChooser(session,choices);
		classChooser(session,choices);
		return "redirect:/attributes";
	}
	@GetMapping("/attributes")
	public String attributesGet(HttpSession session, Model model, @ModelAttribute("roll") Roll myRoll) {
		initialize(session);
		if(!(session.getAttribute("isInit").equals(false))) { //needs to be third page
			return "redirect:/logout";
		}
		System.out.println("-----ATTRIBUTES ROUTE-----");
		String mySubRace = session.getAttribute("subRace").toString();
		String mySubClass = session.getAttribute("subClass").toString();
		String myRole = session.getAttribute("role").toString();
		String myRace = session.getAttribute("race").toString();
//		System.out.println(mySubRace);
//		System.out.println(myRace);
//		System.out.println(mySubClass);
//		System.out.println(myRole);
		model.addAttribute("chosenRace",myRace);
		model.addAttribute("chosenSubRace",mySubRace);
		model.addAttribute("chosenClass",myRole);
		model.addAttribute("chosenSubClass",mySubClass);
		return "/Character/attributes.jsp";
	}
	@PostMapping("/roll")
	public String postRoll(HttpSession session, @Valid @ModelAttribute("roll") Roll postRoll, BindingResult result) {
		Character myChar;
		if(result.hasErrors()) {
			return "/Character/finalSheet.jsp";
		}
		if(postRoll.getRollMethod() == true) {
			myChar = service.rollChar(postRoll);
		}
		else {
			myChar = service.defaultChar(postRoll);
		}
		myChar.setRace((session.getAttribute("subRace").toString() + " " + session.getAttribute("race").toString()));
		myChar.setDndClass((session.getAttribute("subClass").toString()+" "+session.getAttribute("role").toString()));
		Character saveChar = service.saveChar(myChar);
		session.setAttribute("charID",saveChar.getId());
		return "redirect:/roll";
	}
	@GetMapping("/roll")
	public String getRoll(HttpSession session, Model model) {
		Long id = Long.valueOf(session.getAttribute("charID").toString());
		Character renderChar = service.findChar(id);
		if (renderChar == null) {
			return "redirect:/logout";
		}
		model.addAttribute("character",renderChar);
		return "/Character/finalSheet.jsp";
	}
	@RequestMapping("/logout")
	public String logOut(HttpSession sesh) {
		sesh.invalidate();
		return "redirect:/";
	}
	public void initialize(HttpSession session) {
		if(session.getAttribute("isInit") == null) { //first time called
			session.setAttribute("isInit",true);
			raceMap.put(1,"Human");
			raceMap.put(2,"Dwarf");
			raceMap.put(3,"Elf");
			classMap.put(1,"Fighter");
			classMap.put(2,"Wizard");
			classMap.put(3,"Barbarian");
//			System.out.println("--------INITIALIZING------");
//			System.out.println(raceMap);
//			System.out.println(classMap);
//			System.out.println(subRaces);
//			System.out.println(subClasses);
//			System.out.println("----GLOBAL VARS-------");
		}
		else if(session.getAttribute("isInit").equals(true)) { //happens on second call of initialize
			session.setAttribute("isInit",false);
//			System.out.println("--------INITIALIZING------");
//			System.out.println(raceMap);
//			System.out.println(classMap);
//			System.out.println(subRaces);
//			System.out.println(subClasses);
//			System.out.println("----GLOBAL VARS-------");
		}
		else{ //happens on third+ call of initialize
//			System.out.println("--------INITIALIZING------");
//			System.out.println(raceMap);
//			System.out.println(classMap);
//			System.out.println(subRaces);
//			System.out.println(subClasses);
//			System.out.println("----GLOBAL VARS-------");
		}

	}
	public void classChooser(HttpSession sesh, Choices choices) {
		String subClass;
		if (choices.getClassChosen().equals("Wizard")) {
			sesh.setAttribute("subClass",choices.getSubClassWizard());
			subClass = choices.getSubClassWizard();
		}
		else if(choices.getClassChosen().equals("Barbarian")) {
			sesh.setAttribute("subClass",choices.getSubClassBarbarian());
			subClass = choices.getSubClassBarbarian();
		}
		else { //fighter
			sesh.setAttribute("role","Fighter");
			sesh.setAttribute("subClass",choices.getSubClassFighter());
			subClass = choices.getSubClassFighter();
		}
		System.out.println("----ClassChooser------");
		System.out.println("--CHOICES--");
		System.out.println(choices.getClassChosen());
		System.out.println(subClass);
		System.out.println("--SESSION--");
		System.out.println(sesh.getAttribute("role"));
		System.out.println(sesh.getAttribute("subClass"));
	}
	public void raceChooser(HttpSession sesh, Choices choices) {
		String subRace;
		if(choices.getRaceChosen().equals("Dwarf")) {
			subRace = choices.getSubRaceDwarf();
			sesh.setAttribute("subRace",choices.getSubRaceDwarf());
		}
		else if(choices.getRaceChosen().equals("Elf")) {
			subRace = choices.getSubRaceElf();
			sesh.setAttribute("subRace",choices.getSubRaceElf());
		}
		else {//human
			subRace = choices.getSubRaceHuman();
			sesh.setAttribute("race","Human");
			sesh.setAttribute("subRace",choices.getSubRaceHuman());
		}
		System.out.println("----RaceChooser------");
		System.out.println("--CHOICES--");
		System.out.println(choices.getRaceChosen());
		System.out.println(subRace);
		System.out.println("--SESSION--");
		System.out.println(sesh.getAttribute("race"));
		System.out.println(sesh.getAttribute("subRace"));
	}
		//return sesh;
	public Map<Integer,String> subRaces(String race){
		Map<Integer,String> subraces = new HashMap<Integer,String>();
		if(race.equals("Dwarf")) { //null pointer here
			subraces.put(1,"Mountain Dwarf");
			subraces.put(2,"Hill Dwarf");
		}
		else if(race.equals("Elf")) {
			subraces.put(1,"High Elf");
			subraces.put(2,"Wood Elf");
			subraces.put(3,"Drow");
		}
		else { //human
			subraces.put(1,"Normal");
			subraces.put(1,"Variant");
		}
		return subraces;
	}
	public Map<Integer,String> subClasses(String role){
		Map<Integer,String> subclasses = new HashMap<Integer,String>();
		if(role.equals("Wizard")) {
			subclasses.put(1,"Evocator");
			subclasses.put(2,"Divinator");
			subclasses.put(3,"Conjuror");
		}
		else if (role.equals("Barbarian")) {
			subclasses.put(1,"Berserker");
			subclasses.put(2,"Totem Warrior");
		}
		else { //fighter
			subclasses.put(1,"Champion");
			subclasses.put(2,"Battle Master");
			subclasses.put(3,"Eldritch Knight");
		}
		return subclasses;
	}
}
