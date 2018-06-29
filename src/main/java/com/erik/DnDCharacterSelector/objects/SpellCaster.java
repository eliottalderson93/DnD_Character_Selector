package com.erik.DnDCharacterSelector.objects;

import java.util.List;

public abstract class SpellCaster {
	private String spellClass;
	private String spellStat;
	private Integer spellStatScore;
	private Integer spellSaveDC;
	private Integer spellAttackBonus;
	private List<String> cantrips;
	private List<String> spellsLevelOne;
	private List<String> spellsLevelTwo;
	private List<String> spellsLevelThree;

	public String getSpellClass() {
		return spellClass;
	}

	public void setSpellClass(String spellClass) {
		this.spellClass = spellClass;
	}

	public String getSpellStat() {
		return spellStat;
	}

	public void setSpellStat(String spellStat) {
		this.spellStat = spellStat;
	}

	public Integer getSpellStatScore() {
		return spellStatScore;
	}

	public void setSpellStatScore(Integer spellStatScore) {
		this.spellStatScore = spellStatScore;
	}

	public Integer getSpellSaveDC() {
		return spellSaveDC;
	}

	public void setSpellSaveDC(Integer spellSaveDC) {
		this.spellSaveDC = spellSaveDC;
	}

	public Integer getSpellAttackBonus() {
		return spellAttackBonus;
	}

	public void setSpellAttackBonus(Integer spellAttackBonus) {
		this.spellAttackBonus = spellAttackBonus;
	}

	public List<String> getCantrips() {
		return cantrips;
	}

	public void setCantrips(List<String> cantrips) {
		this.cantrips = cantrips;
	}

	public List<String> getSpellsLevelOne() {
		return spellsLevelOne;
	}

	public void setSpellsLevelOne(List<String> spellsLevelOne) {
		this.spellsLevelOne = spellsLevelOne;
	}

	public List<String> getSpellsLevelTwo() {
		return spellsLevelTwo;
	}

	public void setSpellsLevelTwo(List<String> spellsLevelTwo) {
		this.spellsLevelTwo = spellsLevelTwo;
	}

	public List<String> getSpellsLevelThree() {
		return spellsLevelThree;
	}

	public void setSpellsLevelThree(List<String> spellsLevelThree) {
		this.spellsLevelThree = spellsLevelThree;
	}
	
}
