package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.StudentEntity;
import com.example.demo.Repository.StudentRepo;

@Service
public class StudentService {
	
	@Autowired
	StudentRepo sr;
	
	public StudentEntity saveInfo(StudentEntity ss) {
		return sr.save(ss);
	}
	
	public List<StudentEntity> savedetails(List<StudentEntity> ss){
		return (List<StudentEntity>) sr.saveAll(ss);
	}
	
	public List<StudentEntity> showInfo() {
		return sr.findAll();
	}
	
	public StudentEntity showone(int ID) {
		return sr.getStudent(ID);
	}
	
	public StudentEntity updateone(StudentEntity ss) {
		return sr.saveAndFlush(ss);
	}
	
	public String deleteone(int Id) {
		sr.deleteById(Id);
		return "Deleted Succesfully Id no :" + Id;
	}
}

