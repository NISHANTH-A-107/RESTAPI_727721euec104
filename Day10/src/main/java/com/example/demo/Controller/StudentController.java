package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.StudentMark;
import com.example.demo.Service.StudentService;

@RestController
public class StudentController {

	@Autowired
	StudentService ss;
	
	@PostMapping("addstudent")
	public StudentMark newstudent(@RequestBody StudentMark s) {
		return ss.add(s);
	}
	
	@GetMapping("show/{id}")
	public StudentMark getById(@PathVariable int id) {
		return ss.showById(id);
	}
	
	@GetMapping("updatemark/{id}")
	public String updateMark(@PathVariable int id,@RequestParam int value) {
		return ss.updateMarkById(id, value);
	}
	
	@GetMapping("updatename/{id}")
	public String updateName(@PathVariable int id,@RequestParam String value) {
		return ss.updateNameById(id, value);
	}
	
	@GetMapping("delete")
	public String delete(@RequestParam int id) {
		return ss.deleteStudentById(id);
	}
}
