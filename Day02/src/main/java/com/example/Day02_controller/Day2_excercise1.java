package com.example.Day02_controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Day2_excercise1 {
	
	@Value("${name}")
	private String name;
	
	@GetMapping("/")
	public String getName() {
		return "My name is " + name;
	}
}
