package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.StudentMark;
import com.example.demo.Repository.StudentRepo;

@Service
public class StudentService {
	
	@Autowired
	StudentRepo sr;
	
	public StudentMark add(StudentMark s) {
		return sr.save(s);
	}
	
	public StudentMark showById(int id) {
		return sr.byId(id);
	}
	
	public String updateMarkById(int id, int value) {
		if(sr.existsById(id))
		{
			sr.updateMark(id, value);
			return "Updated Succesfully";
		}
		return "No id found";
	}
	
	public String updateNameById(int id,String value) {
		if(sr.existsById(id))
		{
			sr.updateName(id, value);
			return "Updated Succesfully";
		}
		return "No id found";
	}
	
	public String deleteStudentById(int id) {
		if(sr.existsById(id))
		{
			sr.deleteById(id);
			return "Deleted Succesfully";
		}
		return "No id found";
	}
}
