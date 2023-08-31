package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.Model.StudentMark;

import jakarta.transaction.Transactional;

@Repository
public interface StudentRepo extends JpaRepository<StudentMark, Integer>{
	
	@Query(value = "select * from studentmark where id = :id",nativeQuery = true)
	StudentMark byId(int id);
	
	@Modifying
	@Transactional
	@Query(value = "update studentmark set mark1 = :value where id =:id",nativeQuery = true)
	void updateMark(int id,int value);
	
	@Modifying
	@Transactional
	@Query(value = "update studentmark set name = :value where id =:id",nativeQuery = true)
	void updateName(int id,String value);
	
	@Modifying
	@Transactional
	@Query(value = "delete from studentmark where id = :id",nativeQuery = true)
	void deleteById(int id);
}
