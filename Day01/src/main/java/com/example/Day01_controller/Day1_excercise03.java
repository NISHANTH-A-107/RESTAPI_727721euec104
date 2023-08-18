package com.example.Day01_controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Day1_excercise03 {
	
	@Value("${favcolor}")
	private String favcolor;
	
	@GetMapping("/exc3")
	public String getMyFav() {
		return "My favourtie color is " + favcolor + " .";
	}
}
