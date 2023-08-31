package com.example.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.Model.Car;

@Repository
public interface CarRepo extends JpaRepository<Car, Integer> {
	@Query(value = "select * from car where owners = :id",nativeQuery = true)
	List<Car> showByOwner(int id);
	
	@Query(value = "select * from car where address like %:address%",nativeQuery = true)
	List<Car> showByAddress(@Param("address") String address);
	
	@Query(value = "select * from car where carname = :name",nativeQuery = true)
	List<Car> showByName(@Param("name") String name);
	
	@Query(value = "select * from car where owners = :id and car_type = :type",nativeQuery = true)
	List<Car> showByIdOwner(int id,String type);
}
