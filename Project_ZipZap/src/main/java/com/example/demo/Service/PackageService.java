package com.example.demo.Service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Pack;
import com.example.demo.Repository.PackageRepo;

@Service
public class PackageService {
	
	@Autowired
	PackageRepo pr;
	
	public Pack addpack(Pack p) {
		return pr.save(p);
	}
	
	public List<Pack> getpacks(){
		return pr.findAll();
	}
	
	public Optional<Pack> getonepack(int id){
		return pr.findById(id);
	}
	
	public Pack getpack(int id) {
		return pr.getReferenceById(id);
	}
	
	public String updatepack(int id,Pack p) {
		if(pr.existsById(id))
		{
			getpack(id).compare(p);
			pr.save(getpack(id));
			return "Updated succesfully";
		}
		return "Package not found";
	}
	
	public String delete(int id) {
		if(pr.existsById(id))
		{
			pr.deleteById(id);
			return "deleted succesfully";
		}
		return "No id found";
	}
}
