package com.example.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.Model.Delivery;

@Repository
public interface DeliveryRepo extends JpaRepository<Delivery, Integer>{
	
	@Query(value = "select * from delivery where sender_Id = :id", nativeQuery = true)
	List<Delivery> getbysid(int id);
	
	@Query(value = "select * from delivery where receiver_Id = :id",nativeQuery = true)
	List<Delivery> getbyrid(int id);
}
