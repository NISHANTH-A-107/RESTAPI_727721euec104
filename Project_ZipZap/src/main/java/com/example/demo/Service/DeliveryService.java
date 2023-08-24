package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Delivery;
import com.example.demo.Repository.DeliveryRepo;

@Service
public class DeliveryService {
	
	@Autowired
	DeliveryRepo dr;
	
	public Delivery newjob(Delivery d) {
		return dr.save(d);
	}
	
	public List<Delivery> getjobs(){
		return dr.findAll();
	}
	
	public List<Delivery> getjobbysid(int id) {
		return dr.getbysid(id);
	}
	
	public List<Delivery> getjobbyrid(int id) {
		return dr.getbyrid(id);
	}
	
	public Page<Delivery> pagejobs(){
		Pageable pageable = PageRequest.of(0, 4, Sort.by("senderId"));
		return dr.findAll(pageable);
	}
}

