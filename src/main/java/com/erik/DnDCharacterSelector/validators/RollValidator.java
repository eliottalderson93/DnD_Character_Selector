package com.erik.DnDCharacterSelector.validators;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.erik.DnDCharacterSelector.models.Roll;

@Component
public class RollValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		return Roll.class.equals(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		Roll roll = (Roll) target;
//		if()
//			errors.rejectValue("","");
		// TODO Auto-generated method stub

	}

}
