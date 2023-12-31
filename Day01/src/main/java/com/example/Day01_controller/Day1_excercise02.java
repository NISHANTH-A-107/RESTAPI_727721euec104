package com.example.Day01_controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Day1_excercise02 {
	
	@Value("${name}")
	private String name;
	
	@GetMapping("/exc2")
	public String getName() {
		return "Hello " + name + "!..";
	}
}
