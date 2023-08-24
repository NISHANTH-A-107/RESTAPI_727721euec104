package com.example.demo.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "users")
public class Users {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int userId;
	private String name;
	private String password;
	private String phone;
	private String email;
	private String address;
	private char type = 'U';
	
	public Users() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Users(int userId, String name, String password, String phone, String email, String address, char type) {
		super();
		this.userId = userId;
		this.name = name;
		this.password = password;
		this.phone = phone;
		this.email = email;
		this.address = address;
		this.type = type;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public char getType() {
		return type;
	}

	public void setType(char type) {
		this.type = type;
	}
	
	public void compare(Users u) {
		if(u.getName() != null)
		{
			this.setName(u.getName());
		}
		if(u.getPassword() != null)
		{
			this.setPassword(u.getPassword());
		}
		if(u.getPhone() != null)
		{
			this.setPhone(u.getPhone());
		}
		if(u.getEmail() != null)
		{
			this.setEmail(u.getEmail());
		}
		if(u.getAddress() != null)
		{
			this.setAddress(u.getAddress());
		}
	}
}
