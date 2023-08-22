package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.StudentEntity;
import com.example.demo.Service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	StudentService sser;
	
	@PostMapping("/addstudent")
	public StudentEntity add(@RequestBody StudentEntity ss) { //Request Body is used for getting the input properly which helps in serialization
		return sser.saveInfo(ss);
	}
	
	@PostMapping("/addstudents")
	public List<StudentEntity> adds(@RequestBody List<StudentEntity> ss){
		return sser.savedetails(ss);
	}
	
	@GetMapping("/showdetails")
	public List<StudentEntity> show() { 
		return sser.showInfo();
	}
	
	@GetMapping("/showdetail/{ID}")
	public StudentEntity display(@PathVariable int ID) {		//The path variable annotation is used to extract value from uri which is in browser
		return sser.showone(ID);
	}
	
	@PutMapping("update")
	public StudentEntity update(@RequestBody StudentEntity ss) {	//The requestbody is used entirely get a value as in format input should be changed in browser
		return sser.updateone(ss);
	}
	
	@DeleteMapping("delete")
	public String delete(@RequestParam int Id) {				//Request Param is used for getting by parameter passed in ? appears in the browser for parameters
		return sser.deleteone(Id);
	}
}
