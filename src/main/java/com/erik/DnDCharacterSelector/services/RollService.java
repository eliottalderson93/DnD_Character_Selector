package com.erik.DnDCharacterSelector.services;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.erik.DnDCharacterSelector.models.Roll;
import com.erik.DnDCharacterSelector.objects.Character;
import com.erik.DnDCharacterSelector.repositories.CharacterRepo;
import com.erik.DnDCharacterSelector.repositories.RollRepo;

@Service
public class RollService {
	private final RollRepo rRepo;
	private final CharacterRepo cRepo;
	public RollService(RollRepo r,CharacterRepo c) {
		this.rRepo = r;
		this.cRepo = c;
	}
	public Roll instRoll(Roll roll) { //use on the post 1st
		return rRepo.save(roll);
	}
	public Character rollChar(Roll roll) { //use on the post second
		List<Integer> scores = roll.randomIntegers();
		Map<Integer,String> order = roll.priorityList();
		Map<String,Integer> attributeScore = roll.attributeList(order,scores);
		Character output = new Character();
		output.setStr(attributeScore.get("STR"));
		output.setDex(attributeScore.get("DEX"));
		output.setCon(attributeScore.get("CON"));
		output.setWis(attributeScore.get("WIS"));
		output.setInt(attributeScore.get("INT"));
		output.setCha(attributeScore.get("CHA"));
		return output;
	}
	public Character defaultChar(Roll roll) {
		List<Integer> scores = roll.defaultIntegers();
		Map<Integer,String> order = roll.priorityList();
		Map<String,Integer> attributeScore = roll.attributeList(order,scores);
		Character output = new Character();
		output.setStr(attributeScore.get("STR"));
		output.setDex(attributeScore.get("DEX"));
		output.setCon(attributeScore.get("CON"));
		output.setWis(attributeScore.get("WIS"));
		output.setInt(attributeScore.get("INT"));
		output.setCha(attributeScore.get("CHA"));
		return output;
	}
	public Character saveChar(Character c) {
		return cRepo.save(c);
	}
	public Character findChar(Long id) {
		Optional<Character> output = cRepo.findById(id);
		if (output.isPresent()) {
			return output.get();
		}
		else {
			return null;
		}
	}
//	public Dwarf rollDwarf(Roll roll) {
//		
//	}
//	public Elf rollElf
}
