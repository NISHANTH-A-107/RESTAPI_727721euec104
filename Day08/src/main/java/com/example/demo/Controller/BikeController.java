package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Bike;
import com.example.demo.Service.BikeService;

@RestController
public class BikeController {
	
	@Autowired
	BikeService bs;
	
	@PostMapping("addnew")
	public Bike addnew(@RequestBody Bike b){
		return bs.add(b);
	}
	
	@GetMapping("showall")
	public List<Bike> show(){
		return bs.showall();
	}
	
	@GetMapping("year/{year}")
	public List<Bike> getByYear(@PathVariable int year){
		return bs.showByYear(year);
	}
	
	@GetMapping("name/{name}")
	public List<Bike> getByName(@PathVariable String name){
		return bs.showByName(name);
	}
	
	@GetMapping("year/{year}/name/{name}")
	public List<Bike> getByYearName(@PathVariable int year,@PathVariable String name){
		return bs.showByYearName(year, name);
	}
}
