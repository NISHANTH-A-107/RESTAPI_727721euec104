package com.example.Day01_controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Day1_excercise01 {
	
	@GetMapping("/exc1")
	public String Welcome() {
		return "Welcome to Spring Boot!!..";
	}
}
