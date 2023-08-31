package com.example.demo.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "studentmark")
public class StudentMark {
	
	@Id
	private int id;
	private String name;
	private int mark1;
	private int mark2;
	private int mark3;
	private int mark4;
	private int total;
	
	public StudentMark() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public StudentMark(int id, String name, int mark1, int mark2, int mark3, int mark4, int total) {
		super();
		this.id = id;
		this.name = name;
		this.mark1 = mark1;
		this.mark2 = mark2;
		this.mark3 = mark3;
		this.mark4 = mark4;
		this.total = total;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMark1() {
		return mark1;
	}
	public void setMark1(int mark1) {
		this.mark1 = mark1;
	}
	public int getMark2() {
		return mark2;
	}
	public void setMark2(int mark2) {
		this.mark2 = mark2;
	}
	public int getMark3() {
		return mark3;
	}
	public void setMark3(int mark3) {
		this.mark3 = mark3;
	}
	public int getMark4() {
		return mark4;
	}
	public void setMark4(int mark4) {
		this.mark4 = mark4;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	
	
}
