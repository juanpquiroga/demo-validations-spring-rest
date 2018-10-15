package com.example.demo.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.example.demo.validators.Existing;
import com.example.demo.validators.IsEmployeeCorrect;
import com.example.demo.validators.NameValid;
import com.example.demo.validators.New;

@IsEmployeeCorrect(groups = {Existing.class, New.class})
public class Employee {
	@NotNull(groups=Existing.class)
	private Integer id;
	
	@NotNull(groups = {Existing.class, New.class})
	@Size(min=2, message="El nombre debe tener al menos 2 caracteres",groups = {Existing.class, New.class})
	@NameValid
	private String name;
	
	@NotNull(groups = {Existing.class, New.class})
	@Size(min=2, max=20, message="El nombre debe tener al menos 2 y máximo 20 caracteres",groups = {Existing.class, New.class})
	@NameValid(groups = {Existing.class, New.class})
	private String lastname;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
}
