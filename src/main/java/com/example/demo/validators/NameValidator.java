package com.example.demo.validators;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class NameValidator implements ConstraintValidator<NameValid, String> {

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		return value.matches("[A-Z].*");
	}

}
