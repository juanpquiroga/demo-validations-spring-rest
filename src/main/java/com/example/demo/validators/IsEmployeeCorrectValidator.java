package com.example.demo.validators;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import com.example.demo.model.Employee;

public class IsEmployeeCorrectValidator implements ConstraintValidator<IsEmployeeCorrect, Employee> {

	@Override
	public boolean isValid(Employee value, ConstraintValidatorContext context) {
		return (value.getName().length() + value.getLastname().length() + 1)<=20;
	}
}
