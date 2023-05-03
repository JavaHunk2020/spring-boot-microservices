package com.keubiko.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.keubiko.dao.entity.EmployeeEntity;

public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Integer>{
	
	public Optional<EmployeeEntity> findByEmail(String email);
	public Optional<EmployeeEntity> findByName(String name);
	public Optional<EmployeeEntity> findByAge(int age);

}
