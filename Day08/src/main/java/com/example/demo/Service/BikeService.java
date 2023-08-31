package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Bike;
import com.example.demo.Repository.BikeRepo;

@Service
public class BikeService {
	
	@Autowired
	BikeRepo br;
	
	public Bike add(Bike b) {
		return br.save(b);
	}
	
	public List<Bike> showall(){
		return br.findAll();
	}
	
	public List<Bike> showByYear(int year){
		return br.byYear(year);
	}
	
	public List<Bike> showByName(String name){
		return br.byName(name);
	}
	public List<Bike> showByYearName(int year,String name){
		return br.byYearName(year, name);
	}
}
