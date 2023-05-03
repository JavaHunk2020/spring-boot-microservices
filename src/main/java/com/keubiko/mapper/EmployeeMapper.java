package com.keubiko.mapper;

import com.keubiko.dao.entity.EmployeeEntity;
import com.keubiko.dto.EmployeeDTO;

public class EmployeeMapper {
	
	public static EmployeeDTO toDTO(EmployeeEntity entity) {
		EmployeeDTO employeeDTO=new EmployeeDTO();
		employeeDTO.setAge(entity.getAge());
		employeeDTO.setEmail(entity.getEmail());
		employeeDTO.setName(entity.getName());
		employeeDTO.setSno(entity.getSno());
		return employeeDTO;
	}
	
	public static EmployeeEntity toEntity(EmployeeDTO employeeDTO) {
		EmployeeEntity entity=new EmployeeEntity();
		entity.setAge(employeeDTO.getAge());
		entity.setEmail(employeeDTO.getEmail());
		entity.setName(employeeDTO.getName());
		entity.setSno(employeeDTO.getSno());
		return entity;
	}


}
