package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Car;
import com.example.demo.Service.CarService;

@RestController
public class CarController {
	
	@Autowired
	CarService cs;
	
	@PostMapping("/add")
	public Car newCar(@RequestBody Car c) {
		return cs.addCar(c);
	}
	
	@GetMapping("/showall")
	public List<Car> showall(){
		return cs.showdata();
	}
	
	@GetMapping("/owners/{owner}")
	public List<Car> getByOwner(@PathVariable int owner){
		return cs.byOwner(owner);
	}
	
	@GetMapping("/address")
	public List<Car> getByAddress(@RequestParam String address){
		return cs.byAddress(address);
	}
	
	@GetMapping("/carname/{name}")
	public List<Car> getByCar(@PathVariable("name") String name){
		return cs.byCar(name);
	}
	
	@GetMapping("owners/{owner}/cartype/{cartype}")
	public List<Car> getByIdType(@PathVariable int owner,@PathVariable String cartype){
		return cs.byIdType(owner, cartype);
	}
}
