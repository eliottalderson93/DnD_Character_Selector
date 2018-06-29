package com.erik.DnDCharacterSelector.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.erik.DnDCharacterSelector.models.Roll;

@Repository
public interface RollRepo extends CrudRepository<Roll, Long> {

}
