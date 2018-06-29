//var dwarfSubRace = ["Mountain","Hill"];
//var humanSubRace = ["Normal","Variant"];
//var elfSubRace = ["High","Wood","Dark"];
//var fighterSubClass = ["Champion","BattleMaster","EldritchKnight"];
//var barbSubClass = ["Berserker","Totem"];
//var wizSubClass = ["Divination","Evocation","Conjuror"];
var desc = [["Mountain","Mountain Dwarf Desc"],["Hill","Hill Dwarf Desc"],["Normal","Normal Human Desc"],["Variant","Variant Human Desc"],["High","High Elf Desc"],["Wood","Wood Elf Desc"],["Dark","Dark Elf Desc"],["champion","Champion fighter subclass Desc"],["battleMaster","BattleMaster fighter subclass desc"],["eldritchKnight","Eldritch Knight fighter subclass desc"],["berserker","Berserker barbarian subclass desc"],["totemWarrior","Totem Warrior barbarian subclass desc"],["divination","Divination wizard subclass desc"],["evocation","Evocation wizard subclass desc"],["conjuror","Conjuror wizard subclass desc"],["Human","Human race desc"],["Dwarf","Dwarf race desc"],["Elf","Elf race Desc"],["Wizard","Wizard class desc"],["Fighter","fighter class desc"],["Barbarian","Barbarian class desc"]];
descMap = new Map(desc); //map from option to option description
$(document).ready(function() {
	//console.log("doc ready");
	var race;
	var subrace;
	var role;
	var subclass;
	var imgUrl = "/";
	var imgId = "#raceImg";
	var descId = "#raceDesc";
	var fileType = ".jpg";
	$('#race').change(function (){
		imgUrl = "/";
		race = jQuery("#race option:selected").val();
		imgId = "#raceImg";
		descId = "#raceDesc";
		if(race === "Dwarf"){
			showSelect("subRaceCol","subRaceDwarf");
			hideSelect("subRaceElf");
			hideSelect("subRaceHuman");
		}
		else if(race === "Elf"){
			showSelect("subRaceCol","subRaceElf");
			hideSelect("subRaceHuman");
			hideSelect("subRaceDwarf");
		}
		else{
			showSelect("subRaceCol","subRaceHuman");
			hideSelect("subRaceElf");
			hideSelect("subRaceDwarf");
		}
		imgUrl += "img/Races/";
		imgUrl += race;
		imgUrl += fileType;
		changeImgDesc(race,imgUrl,imgId,descId);
	})
	$('#subRaceHuman').change(function (){
		imgUrl = "/";
		subrace = jQuery("#subRaceHuman option:selected").val();
		imgId = "#subRaceImg";
		descId = "#subRaceDesc";
		imgUrl += "img/subRaces/";
		imgUrl += subrace;
		imgUrl += fileType;
		changeImgDesc(subrace,imgUrl,imgId,descId);
	})
	$('#subRaceDwarf').change(function (){
		imgUrl = "/";
		subrace = jQuery("#subRaceDwarf option:selected").val();
		imgId = "#subRaceImg";
		descId = "#subRaceDesc";
		imgUrl += "img/subRaces/";
		imgUrl += subrace;
		imgUrl += fileType;
		changeImgDesc(subrace,imgUrl,imgId,descId);
	})
	$('#subRaceElf').change(function (){
		imgUrl = "/";
		subrace = jQuery("#subRaceElf option:selected").val();
		imgId = "#subRaceImg";
		descId = "#subRaceDesc";
		imgUrl += "img/subRaces/";
		imgUrl += subrace;
		imgUrl += fileType;
		changeImgDesc(subrace,imgUrl,imgId,descId);
	})
	$('#class').change(function (){
		imgUrl = "/";
		role = jQuery("#class option:selected").val();
		imgId = "#classImg";
		descId = "#classDesc";
		if(role === "Wizard"){
			showSelect("subClassCol","subWizard");
			hideSelect("subFighter");
			hideSelect("subBarbarian");
			fileType = ".png";
		}
		else if(role === "Barbarian"){
			showSelect("subClassCol","subBarbarian");
			hideSelect("subFighter");
			hideSelect("subWizard");
			fileType = ".png";
		}
		else{
			showSelect("subClassCol","subFighter");
			hideSelect("subBarbarian");
			hideSelect("subWizard");
		}
		imgUrl += "img/Classes/";
		imgUrl += role;
		imgUrl += fileType;
		changeImgDesc(role,imgUrl,imgId,descId);
		fileType = ".jpg";
	})
	$('#subFighter').change(function (){
		imgUrl = "/";
		subclass = jQuery("#subFighter option:selected").val();
		imgId = "#subClassImg";
		descId = "#subClassDesc";
		imgUrl += "img/subClasses/";
		imgUrl += subclass;
		imgUrl += fileType;
		changeImgDesc(subclass,imgUrl,imgId,descId);
	})
	$('#subWizard').change(function (){
		imgUrl = "/";
		subclass = jQuery("#subWizard option:selected").val();
		imgId = "#subClassImg";
		descId = "#subClassDesc";
		imgUrl += "img/subClasses/";
		imgUrl += subclass;
		imgUrl += fileType;
		changeImgDesc(subclass,imgUrl,imgId,descId);
	})
	$('#subBarbarian').change(function (){
		imgUrl = "/";
		subclass = jQuery("#subBarbarian option:selected").val();
		imgId = "#subClassImg";
		descId = "#subClassDesc";
		imgUrl += "img/subClasses/";
		imgUrl += subclass;
		imgUrl += fileType;
		changeImgDesc(subclass,imgUrl,imgId,descId);
	})
	//functions
	function showSelect(colId,selId){
		console.log("---Show Select---");
		console.log(colId);
		console.log(selId);
		document.getElementById(colId).style.cssText = "display:block;"; //replace the column style to show div
		document.getElementById(selId).style.cssText = "display:inline-block;"; //replace the select style to show the right select
	}
	function hideSelect(selId){
		document.getElementById(selId).style.cssText = "display:none;";
	}
	function changeImgDesc(option,imgUrl,imgId,descId){
		console.log("---- Image src for "+option+" ----");
		console.log(imgUrl);
//		console.log("----Map-------");
//		console.log(descMap);
		var changeDesc = descMap.get(option); //string of description
		if (changeDesc === null){
			changeDesc = "null field from Map";
		}
		$(imgId).attr("src",imgUrl);
		$(descId).text(changeDesc);
		return;
	}
})