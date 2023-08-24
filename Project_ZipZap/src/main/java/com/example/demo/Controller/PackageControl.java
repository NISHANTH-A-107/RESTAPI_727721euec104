package com.example.demo.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Pack;
import com.example.demo.Service.PackageService;

@RestController
public class PackageControl {
	
	@Autowired
	PackageService ps;
	
	@PostMapping("newpack")
	public Pack newPack(@RequestBody Pack p) {
		return ps.addpack(p);
	}
	
	@GetMapping("showpacks")
	public List<Pack> show(){
		return ps.getpacks();
	}
	
	@GetMapping("showpack")
	public Optional<Pack> showone(@RequestParam int id){
		return ps.getonepack(id);
	}
	
	@PutMapping("updatepack")
	public String update(@RequestParam int id, @RequestBody Pack p) {
		return ps.updatepack(id,p);
	}
	
	@DeleteMapping("droppack")
	public String remove(@RequestParam int id) {
		return ps.delete(id);
	}
}
