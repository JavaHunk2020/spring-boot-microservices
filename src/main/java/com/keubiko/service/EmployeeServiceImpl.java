package com.keubiko.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.keubiko.dao.EmployeeRepository;
import com.keubiko.dao.entity.EmployeeEntity;
import com.keubiko.dto.EmployeeDTO;
import com.keubiko.mapper.EmployeeMapper;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Override
	public List<EmployeeDTO> findAll(){
		List<EmployeeEntity> list=employeeRepository.findAll();
		List<EmployeeDTO> employeeDTOs=new ArrayList<EmployeeDTO>();
		for(EmployeeEntity employeeEntity:list) {
			employeeDTOs.add(EmployeeMapper.toDTO(employeeEntity));
		}
		return employeeDTOs;
	}
	
	@Override
	public void save(EmployeeDTO employeeDTO){
		employeeRepository.save(EmployeeMapper.toEntity(employeeDTO));
	}
	
	@Override
	public EmployeeDTO findById(int sno){
		EmployeeEntity employeeEntity=employeeRepository.findById(sno).get();
		return EmployeeMapper.toDTO(employeeEntity);
	}

	@Override
	public void deleteById(int sno) {
		employeeRepository.deleteById(sno);
	}

}
