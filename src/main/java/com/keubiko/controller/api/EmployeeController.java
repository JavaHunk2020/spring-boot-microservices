package com.keubiko.controller.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.keubiko.dto.AppResponse;
import com.keubiko.dto.EmployeeDTO;
import com.keubiko.dto.EmployeeSalaryDTO;
import com.keubiko.service.EmployeeService;

//@RestController = @Controller + @ResponseBody
@RestController
@RequestMapping("/v7")
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	//Accept ->> application/json,application/xml
	//Base URL /v7/employees
	//Idempotent -noside 
	@GetMapping("/employees")
	public List<EmployeeDTO> findEmployees(){
		 List<EmployeeDTO> employeeDTOs=employeeService.findAll();
		 return employeeDTOs;
	}
	
	@GetMapping("/employees/{eid}/salary")
	public EmployeeSalaryDTO findEmployeeSalary(@PathVariable int eid){
		 return new EmployeeSalaryDTO();
	}
	
	//Idempotent - This is side effect free
	@DeleteMapping("/employees/{sno}")
	public AppResponse deleteEmployee(@PathVariable int sno){
		employeeService.deleteById(sno);
		 AppResponse appResponse=new AppResponse();
		 appResponse.setMessage("Empoyee is deleted successully!!!");
		 appResponse.setCode("1");
		 return appResponse;
	}
	
	//{"name":"Nagendra","email":"maka@gmail.com","age":12}
	//Jackson Mapper
	//Not an Idempotent
	@PostMapping("/employees")
	public AppResponse createEmployee(@RequestBody EmployeeDTO employeeDTO){
		 employeeService.save(employeeDTO);
		 AppResponse appResponse=new AppResponse();
		 appResponse.setMessage("Empoyee is created successully!!!");
		 appResponse.setCode("1");
		 return appResponse;
	}
	
	////{"sno",12,"name":"Nagendra","email":"maka@gmail.com","age":12}
	//This is also Idempotent
	@PutMapping("/employees")
	public AppResponse updateEmployee(@RequestBody EmployeeDTO employeeDTO){
		 employeeService.save(employeeDTO);
		 AppResponse appResponse=new AppResponse();
		 appResponse.setMessage("Empoyee is update successully!!!");
		 appResponse.setCode("1");
		 return appResponse;
	}
	
	///v7/employees/5
	@GetMapping("/employees/{hmamama}")
	public EmployeeDTO findEmployee(@PathVariable("hmamama") int sno){
		 EmployeeDTO employeeDTO=employeeService.findById(sno);
		 return employeeDTO;
	}


}
