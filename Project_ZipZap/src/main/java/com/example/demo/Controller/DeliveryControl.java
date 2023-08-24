package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Delivery;
import com.example.demo.Service.DeliveryService;
@RestController
public class DeliveryControl {

	@Autowired
	DeliveryService ds;
	
	@PostMapping("addjob")
	public Delivery addjob(@RequestBody Delivery d) {
		return ds.newjob(d);
	}
		
	@GetMapping("showjobs")
	public List<Delivery> showjobs(){
		return ds.getjobs();
	}
	
	@GetMapping("pagejobs")
	public Page<Delivery> pages(){
		return ds.pagejobs();
	}
	
	@GetMapping("showreq")
	public List<Delivery> showjobbysid(@RequestParam int sid) {
		return ds.getjobbysid(sid);
	}
	
	@GetMapping("showrec")
	public List<Delivery> showjobbyrid(@RequestParam int rid){
		return ds.getjobbyrid(rid);
	}
}
