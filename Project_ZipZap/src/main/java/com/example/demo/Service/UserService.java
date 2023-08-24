package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Users;
import com.example.demo.Repository.UserRepo;

@Service
public class UserService {
	
	@Autowired
	UserRepo ur;
	
	public Users adduser(Users u) {
		return ur.save(u);
	}
	
	public List<Users> getusers(){
		return ur.findAll();
	}
	
	public Optional<Users> getoneuser(int id){
		return ur.findById(id);
	}
	
	public Users getuser(int id) {
		return ur.getReferenceById(id);
	}
	
//	public Users modify(int id,Users u) {
//		if(ur.existsById(id))
//		{
//			return ur.saveAndFlush(u);
//		}
//		else	
//			return null;
//	}
	
	public String updateuser(int id,Users u) {
		if(ur.existsById(id))
		{
			getuser(id).compare(u);
			ur.save(getuser(id));
			return "Updated succesfully";
		}
		return "No Id found";
	}
	
	public String removeuser(int id) {
		if(ur.existsById(id))
		{
			ur.deleteById(id);
			return "User " + id + " removed succesfully";
		}
		return "User not found";
	}
}
