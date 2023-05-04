package com.keubiko.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.keubiko.service.CustomerService;

@RestController
@RequestMapping("/v2")
public class SignupRestAPI {
	
	
	@Autowired
	private CustomerService customerService;
	
	
	@DeleteMapping("/dsignup/{username}")
	public RestAPIResponse deleteData(@PathVariable String username) {
		customerService.delete(username);
		RestAPIResponse apiResponse=new RestAPIResponse();
		apiResponse.setCode(200);
		apiResponse.setMessage("Data is deleted successfully");
		return apiResponse;  // because of redirect keywords - > it goes to new action   
	}
	

}
