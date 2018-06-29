package com.erik.DnDCharacterSelector.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.erik.DnDCharacterSelector.objects.Character;

public interface CharacterRepo extends CrudRepository<Character, Long> {
	public Optional<Character> findById(Long id);
}
