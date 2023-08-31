package com.example.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.Model.Bike;

@Repository
public interface BikeRepo extends JpaRepository<Bike, Integer>{
	
	@Query(value = "select * from bike where year = :bikeyear",nativeQuery = true)
	List<Bike> byYear(int bikeyear);
	
	@Query(value = "select * from bike where year = :bikeyear and bike_name like %:name%",nativeQuery = true)
	List<Bike> byYearName(int bikeyear,String name);
	
	@Query(value = "select * from bike where bike_name like %:name%",nativeQuery = true)
	List<Bike> byName(String name);
}
