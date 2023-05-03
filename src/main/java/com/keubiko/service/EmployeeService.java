package com.keubiko.service;

import java.util.List;

import com.keubiko.dto.EmployeeDTO;

public interface EmployeeService {

	List<EmployeeDTO> findAll();

	EmployeeDTO findById(int sno);

	void save(EmployeeDTO employeeDTO);
	
	void deleteById(int sno);

}
