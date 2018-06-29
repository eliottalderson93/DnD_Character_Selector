package com.erik.DnDCharacterSelector.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "choices")
public class Choices { //this records the user's choice in the database, and renders the pages based on the user's choices
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
	private String raceChosen;
	private String subRaceHuman;
	private String subRaceElf;
	private String subRaceDwarf;
	private String subClassWizard;
	private String subClassFighter;
	private String subClassBarbarian;
	private String classChosen;
	private String subRaceChosen;
	private String subClassChosen;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getRaceChosen() {
		return raceChosen;
	}
	public void setRaceChosen(String raceChosen) {
		this.raceChosen = raceChosen;
	}
	public String getClassChosen() {
		return classChosen;
	}
	public void setClassChosen(String classChosen) {
		this.classChosen = classChosen;
	}
	public String getSubRaceHuman() {
		return subRaceHuman;
	}
	public void setSubRaceHuman(String subRaceHuman) {
		this.subRaceHuman = subRaceHuman;
		this.subRaceChosen = subRaceHuman;
	}
	public String getSubRaceElf() {
		return subRaceElf;
	}
	public void setSubRaceElf(String subRaceElf) {
		this.subRaceElf = subRaceElf;
		this.subRaceChosen = subRaceElf;
	}
	public String getSubRaceDwarf() {
		return subRaceDwarf;
	}
	public void setSubRaceDwarf(String subRaceDwarf) {
		this.subRaceDwarf = subRaceDwarf;
		this.subRaceChosen = subRaceDwarf;
	}
	public String getSubClassWizard() {
		return subClassWizard;
	}
	public void setSubClassWizard(String subClassWizard) {
		this.subClassWizard = subClassWizard;
		this.subClassChosen = subClassWizard;
	}
	public String getSubClassFighter() {
		return subClassFighter;
	}
	public void setSubClassFighter(String subClassFighter) {
		this.subClassFighter = subClassFighter;
		this.subClassChosen = subClassFighter;
	}
	public String getSubClassBarbarian() {
		return subClassBarbarian;
	}
	public void setSubClassBarbarian(String subClassBarbarian) {
		this.subClassBarbarian = subClassBarbarian;
		this.subClassChosen = subClassBarbarian;
	}
	public String getSubRaceChosen() {
		return subRaceChosen;
	}
	public void setSubRaceChosen(String subRaceChosen) {
		this.subRaceChosen = subRaceChosen;
	}
	public String getSubClassChosen() {
		return subClassChosen;
	}
	public void setSubClassChosen(String subClassChosen) {
		this.subClassChosen = subClassChosen;
	}
	
}