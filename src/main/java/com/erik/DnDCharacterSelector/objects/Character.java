package com.erik.DnDCharacterSelector.objects;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "characters")
public class Character { //abstract
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	Long id;
	//player inputs
	private String name; //these will be set by the user
	private String playerName;
	private Integer level; //methods for leveling will be in further classes
	private String alignment; //this will have its own page
	private Integer experience; //not sure how to implement
	public Character() {}
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	public Integer getLevel() {
		return level;
	}
	public void setLevel(Integer level) {
		this.level = level;
	}
	public String getAlignment() {
		return alignment;
	}
	public void setAlignment(String alignment) {
		this.alignment = alignment;
	}
	public Integer getExperience() {
		return experience;
	}
	public void setExperience(Integer experience) {
		this.experience = experience;
	}
	//descriptors
	private String race; //these are descriptors that inheritance will change // for listing purposes
	private String dndClass; 
	private String background;
	
	public String getRace() {
		return race;
	}
	public void setRace(String race) {
		this.race = race;
	}
	public String getDndClass() {
		return dndClass;
	}
	public void setDndClass(String dndClass) {
		this.dndClass = dndClass;
	}
	public String getBackground() {
		return background;
	}
	public void setBackground(String background) {
		this.background = background;
	}
	//attributes
	private Integer Str;
	private Integer Dex;
	private Integer Con;
	private Integer Int;
	private Integer Wis;
	private Integer Cha;
	private Integer Per;
	
	public Integer getStr() {
		return Str;
	}
	public void setStr(Integer str) {
		Str = str;
	}
	public Integer getDex() {
		return Dex;
	}
	public void setDex(Integer dex) {
		Dex = dex;
	}
	public Integer getCon() {
		return Con;
	}
	public void setCon(Integer con) {
		Con = con;
	}
	public Integer getInt() {
		return Int;
	}
	public void setInt(Integer i) {
		Int = i;
	}
	public Integer getWis() {
		return Wis;
	}
	public void setWis(Integer wis) {
		Wis = wis;
	}
	public Integer getCha() {
		return Cha;
	}
	public void setCha(Integer cha) {
		Cha = cha;
	}
	public Integer getPer() {
		return Per;
	}
	public void setPer(Integer per) {
		Per = per;
	}
	//proficiencies
	private Integer proficiencyBonus;
	private Integer strSave; //null = not proficient
	private Integer dexSave;
	private Integer conSave;
	private Integer intSave;
	private Integer wisSave;
	private Integer chaSave;
	
	public Integer getStrSave() {
		return strSave;
	}
	public void setStrSave(Integer strSave) {
		this.strSave = strSave;
	}
	public Integer getDexSave() {
		return dexSave;
	}
	public void setDexSave(Integer dexSave) {
		this.dexSave = dexSave;
	}
	public Integer getConSave() {
		return conSave;
	}
	public void setConSave(Integer conSave) {
		this.conSave = conSave;
	}
	public Integer getIntSave() {
		return intSave;
	}
	public void setIntSave(Integer intSave) {
		this.intSave = intSave;
	}
	public Integer getWisSave() {
		return wisSave;
	}
	public void setWisSave(Integer wisSave) {
		this.wisSave = wisSave;
	}
	public Integer getChaSave() {
		return chaSave;
	}
	public void setChaSave(Integer chaSave) {
		this.chaSave = chaSave;
	}
	//skills
	private Integer acrobatics; //null = not proficient
	private Integer animalHandling;
	private Integer arcana;
	private Integer athletics;
	private Integer deception;
	private Integer history;
	private Integer insight;
	private Integer intimidation;
	private Integer investigation;
	private Integer medicine;
	private Integer nature;
	private Integer perception;
	private Integer performance;
	private Integer religion;
	private Integer sleightOfHand;
	private Integer stealth;
	private Integer survival;
	
	public Integer getProficiencyBonus() {
		return proficiencyBonus;
	}
	public void setProficiencyBonus(Integer proficiencyBonus) {
		this.proficiencyBonus = proficiencyBonus;
	}
	public Integer getAcrobatics() {
		return acrobatics;
	}
	public void setAcrobatics(Integer acrobatics) {
		this.acrobatics = acrobatics;
	}
	public Integer getAnimalHandling() {
		return animalHandling;
	}
	public void setAnimalHandling(Integer animalHandling) {
		this.animalHandling = animalHandling;
	}
	public Integer getArcana() {
		return arcana;
	}
	public void setArcana(Integer arcana) {
		this.arcana = arcana;
	}
	public Integer getAthletics() {
		return athletics;
	}
	public void setAthletics(Integer athletics) {
		this.athletics = athletics;
	}
	public Integer getDeception() {
		return deception;
	}
	public void setDeception(Integer deception) {
		this.deception = deception;
	}
	public Integer getHistory() {
		return history;
	}
	public void setHistory(Integer history) {
		this.history = history;
	}
	public Integer getInsight() {
		return insight;
	}
	public void setInsight(Integer insight) {
		this.insight = insight;
	}
	public Integer getIntimidation() {
		return intimidation;
	}
	public void setIntimidation(Integer intimidation) {
		this.intimidation = intimidation;
	}
	public Integer getInvestigation() {
		return investigation;
	}
	public void setInvestigation(Integer investigation) {
		this.investigation = investigation;
	}
	public Integer getMedicine() {
		return medicine;
	}
	public void setMedicine(Integer medicine) {
		this.medicine = medicine;
	}
	public Integer getNature() {
		return nature;
	}
	public void setNature(Integer nature) {
		this.nature = nature;
	}
	public Integer getPerception() {
		return perception;
	}
	public void setPerception(Integer perception) {
		this.perception = perception;
	}
	public Integer getPerformance() {
		return performance;
	}
	public void setPerformance(Integer performance) {
		this.performance = performance;
	}
	public Integer getReligion() {
		return religion;
	}
	public void setReligion(Integer religion) {
		this.religion = religion;
	}
	public Integer getSleightOfHand() {
		return sleightOfHand;
	}
	public void setSleightOfHand(Integer sleightOfHand) {
		this.sleightOfHand = sleightOfHand;
	}
	public Integer getStealth() {
		return stealth;
	}
	public void setStealth(Integer stealth) {
		this.stealth = stealth;
	}
	public Integer getSurvival() {
		return survival;
	}
	public void setSurvival(Integer survival) {
		this.survival = survival;
	}
	//combat
	private Integer armorClass;
	private Integer initiative;
	private Integer speed;
	private Integer hitPoints;
	private Integer hitDice; //10 for d10, etc
	//private List<Attack> attacks;
	
	public Integer getArmorClass() {
		return armorClass;
	}
	public void setArmorClass(Integer armorClass) {
		this.armorClass = armorClass;
	}
	public Integer getInitiative() {
		return initiative;
	}
	public void setInitiative(Integer initiative) {
		this.initiative = initiative;
	}
	public Integer getSpeed() {
		return speed;
	}
	public void setSpeed(Integer speed) {
		this.speed = speed;
	}
	public Integer getHitPoints() {
		return hitPoints;
	}
	public void setHitPoints(Integer hitPoints) {
		this.hitPoints = hitPoints;
	}
	public Integer getHitDice() {
		return hitDice;
	}
	public void setHitDice(Integer hitDice) {
		this.hitDice = hitDice;
	}
//	public List<Attack> getAttacks() {
//		return attacks;
//	}
//	public void setAttacks(List<Attack> attacks) {
//		this.attacks = attacks;
//	}
	//roleplay
	private String backstory;
	private String personality;
	private String ideals;
	private String bonds;
	private String flaws;
	private Integer age;
	private String height;
	private String weight;
	private String eyes;
	private String skin;
	private String hair;
	//private List<String> organizations; //allies and organizations
	
	public String getBackstory() {
		return backstory;
	}
	public void setBackstory(String backstory) {
		this.backstory = backstory;
	}
	public String getPersonality() {
		return personality;
	}
	public void setPersonality(String personality) {
		this.personality = personality;
	}
	public String getIdeals() {
		return ideals;
	}
	public void setIdeals(String ideals) {
		this.ideals = ideals;
	}
	public String getBonds() {
		return bonds;
	}
	public void setBonds(String bonds) {
		this.bonds = bonds;
	}
	public String getFlaws() {
		return flaws;
	}
	public void setFlaws(String flaws) {
		this.flaws = flaws;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getHeight() {
		return height;
	}
	public void setHeight(String height) {
		this.height = height;
	}
	public String getWeight() {
		return weight;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}
	public String getEyes() {
		return eyes;
	}
	public void setEyes(String eyes) {
		this.eyes = eyes;
	}
	public String getSkin() {
		return skin;
	}
	public void setSkin(String skin) {
		this.skin = skin;
	}
	public String getHair() {
		return hair;
	}
	public void setHair(String hair) {
		this.hair = hair;
	}
//	public List<String> getOrganizations() {
//		return organizations;
//	}
//	public void setOrganizations(List<String> organizations) {
//		this.organizations = organizations;
//	}
//	//misc
//	private List<String> equipment;
//
//	public List<String> getEquipment() {
//		return equipment;
//	}
//	public void setEquipment(List<String> equipment) {
//		this.equipment = equipment;
//	}
	//methods
}
