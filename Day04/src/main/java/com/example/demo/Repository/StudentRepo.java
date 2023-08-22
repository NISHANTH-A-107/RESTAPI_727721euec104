package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.Model.StudentEntity;

@Repository
public interface StudentRepo extends JpaRepository<StudentEntity, Integer>{
	
	@Query(value = "select * from studenttable where id = :value",nativeQuery = true)
	StudentEntity getStudent(int value);
}
