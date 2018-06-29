package com.erik.DnDCharacterSelector.objects;

public class Attack { // this object represents an entry on the character sheet of an attack
	private String weapon;
	private String bonus;
	private String dmgType;
	//main methods above
	private Integer numDice;
	private Integer die;
	private Integer dmgMod;
	private String type;
	Attack(String weapon, Integer bonus, Integer numDice, Integer die, Integer dmgMod, String type){
		this.weapon = weapon;
		this.bonus = "+ "+Integer.toString(bonus);
		this.numDice = numDice;
		this.die = die;
		this.dmgMod = dmgMod;
		this.type = type;
		String neg;
		if(this.dmgMod < 0) {
			neg = "-";
		}
		else {
			neg = "+";
		}
		this.dmgType = Integer.toString(this.numDice) + "d" + Integer.toString(this.die) + " " + neg + Integer.toString(this.dmgMod) + " " +this.type;
	} //weapon bonus dmgType
}
