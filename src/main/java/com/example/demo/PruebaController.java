package com.example.demo;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;
import com.example.demo.validators.Existing;
import com.example.demo.validators.New;

@RestController()
public class PruebaController {

	@GetMapping("/hola")
	public String hello() {
		return "Hola";
	}
	
	@PostMapping("/employees")
	Employee newEmployee(@RequestBody @Validated(New.class) Employee newEmployee) {
		return new Employee();
	}
	
	@PutMapping("/employees")
	Employee modifyEmployee(@RequestBody @Validated(Existing.class) Employee employee) {
		System.out.println("Put mapping");
		return employee;
	}
}
