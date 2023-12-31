package com.example.demo.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Employee;
import com.example.demo.Service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeService es;
	
	@PostMapping("/addUser")
	public Employee add(@RequestBody Employee e) {
		return es.saveInfo(e);
	}
	
	@GetMapping("/showlist")
	public List<Employee> show() {
		return es.showInfo();
	}
	
//	@GetMapping("showlist/{ID}")
//	public Employee getOne(@PathVariable int ID) {
//		return es.showone(ID);
//	}
	
	@GetMapping("showlist/{ID}")
	public Optional<Employee> getOne(@PathVariable int ID){
		return es.showone(ID);
	}
}
