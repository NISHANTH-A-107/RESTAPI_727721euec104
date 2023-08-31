package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Car;
import com.example.demo.Repository.CarRepo;

@Service
public class CarService {
	
	@Autowired
	CarRepo cr;
	
	public Car addCar(Car c) {
		return cr.save(c);
	}
	
	public List<Car> byOwner(int id){
		return cr.showByOwner(id);
	}
	
	public List<Car> byAddress(String address){
		return cr.showByAddress(address);
	}
	
	public List<Car> showdata(){
		return cr.findAll();
	}
	
	public List<Car> byCar(String name){
		return cr.showByName(name);
	}
	
	public List<Car> byIdType(int id,String type){
		return cr.showByIdOwner(id, type);
	}
}
