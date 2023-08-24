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

import com.example.demo.Model.Users;
import com.example.demo.Service.UserService;

@RestController
public class UserControl {
	
	@Autowired
	UserService us;
	
	@PostMapping("/newuser")
	public Users newUser(@RequestBody Users u) {
		return us.adduser(u);
	}
	
	@GetMapping("/showusers")
	public List<Users> show(){
		return us.getusers();
	}
	
	@GetMapping("showuser")
	public Optional<Users> showone(@RequestParam int id) {
		return us.getoneuser(id);
	}
	
	@PutMapping("updateusers")
	public String update(@RequestParam int id,@RequestBody Users u) {
		return us.updateuser(id,u);
	}
	
	@DeleteMapping("removeuser")
	public String remove(@RequestParam int id) {
		return us.removeuser(id);
	}
}
