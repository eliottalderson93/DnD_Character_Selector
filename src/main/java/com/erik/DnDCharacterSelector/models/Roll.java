package com.erik.DnDCharacterSelector.models;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

@Entity
@Table(name = "rolls")
public class Roll {
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	//rank the attributes
//	String firstAttribute;
//	String secondAttribute;
//	String thirdAttribute;
//	String fourthAttribute;
//	String fifthAttribute;
//	String sixthAttribute;
	@Min(1)
	@Max(6)
	Integer strPriority;
	@Min(1)
	@Max(6)
	Integer conPriority;
	@Min(1)
	@Max(6)
	Integer dexPriority;
	@Min(1)
	@Max(6)
	Integer intPriority;
	@Min(1)
	@Max(6)
	Integer wisPriority;
	@Min(1)
	@Max(6)
	Integer chaPriority;
	Boolean rollMethod;
	HashMap<String,Integer>orderedAttributes;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Integer getStrPriority() {
		return strPriority;
	}
	public void setStrPriority(Integer strPriority) {
		this.strPriority = strPriority;
	}
	public Integer getConPriority() {
		return conPriority;
	}
	public void setConPriority(Integer conPriority) {
		this.conPriority = conPriority;
	}
	public Integer getDexPriority() {
		return dexPriority;
	}
	public void setDexPriority(Integer dexPriority) {
		this.dexPriority = dexPriority;
	}
	public Integer getIntPriority() {
		return intPriority;
	}
	public void setIntPriority(Integer intPriority) {
		this.intPriority = intPriority;
	}
	public Integer getWisPriority() {
		return wisPriority;
	}
	public void setWisPriority(Integer wisPriority) {
		this.wisPriority = wisPriority;
	}
	public Integer getChaPriority() {
		return chaPriority;
	}
	public void setChaPriority(Integer chaPriority) {
		this.chaPriority = chaPriority;
	}
	public Boolean getRollMethod() {
		return rollMethod;
	}
	public void setRollMethod(Boolean rollMethod) {
		this.rollMethod = rollMethod;
	}
	
	public HashMap<String, Integer> getOrderedAttributes() {
		return orderedAttributes;
	}
	public void setOrderedAttributes(HashMap<String, Integer> orderedAttributes) {
		this.orderedAttributes = orderedAttributes;
	}
	public Integer roll(){ //returns an ability score
		Integer die;
		Integer sum=0;
		Integer min = 8;
		for(int i = 0; i <4; i++) {
			die = ThreadLocalRandom.current().nextInt(1,7);
			if(min > die) {
				min = die;
			}
			sum = sum + die;
		}
		sum = sum - min;
		return sum;
	}
	public List<Integer> randomIntegers(){ //returns 6 sorted ability scores
		Integer roll;
		List<Integer> scores = new ArrayList<Integer>();
		for(int i = 0; i < 6; i++) {
			roll = this.roll();
			scores.add(roll);
		}
		Collections.sort(scores);
		return scores;
	}
	public List<Integer> defaultIntegers(){
		List<Integer> scores = new ArrayList<Integer>();
		scores.add(15);
		scores.add(14);
		scores.add(13);
		scores.add(12);
		scores.add(10);
		scores.add(8);
		return scores;
	}
	public Map<Integer,String> priorityList(){
		Map<Integer,String> priorityList = new HashMap<Integer,String>();
		priorityList.put(this.getChaPriority(),"STR");
		priorityList.put(this.getDexPriority(),"DEX");
		priorityList.put(this.getConPriority(),"CON");
		priorityList.put(this.getIntPriority(),"INT");
		priorityList.put(this.getWisPriority(),"WIS");
		priorityList.put(this.getChaPriority(),"CHA");
		return priorityList;
	}
	public Map<String,Integer> attributeList(Map<Integer,String> priMap,List<Integer> randomInt) {
		Map<String,Integer> atrList = new HashMap<String,Integer>();
		for(Integer i = 1; i < 7; i++) {
			Integer k = i-1;
			atrList.put(priMap.get(i),randomInt.get(k));
		}
		return atrList; //eg "STR" : 15
	}
}
