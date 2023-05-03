package com.keubiko.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.keubiko.dto.EmployeeDTO;
import com.keubiko.dto.SignupDTO;
import com.keubiko.service.CustomerService;
import com.keubiko.service.EmployeeService;

@Controller
public class LoginController {
	
	@Autowired
	private CustomerService customerService;
	
	@Autowired
	private EmployeeService employeeService;
	
	
	@GetMapping("/dsignup")
	public String deleteData(@RequestParam String username,Model model) {
		customerService.delete(username);
		return "redirect:/signups";  // because of redirect keywords - > it goes to new action   
	}
	
	@GetMapping("/signups")
	public String showAllData(Model model) {
		model.addAttribute("sajana", customerService.findAll());
		List<EmployeeDTO> employeeDTOs=employeeService.findAll();
		model.addAttribute("employeeDTOs", employeeDTOs);
		return "data";  // -??/    /data.jsp 
	}
	
	
	@GetMapping("/auth")
	public String loginPage() {
		return "login";  // -??/    /login.jsp 
	}
	
	
	@GetMapping("/esignup")
	public String esignupPage(@RequestParam int cid ,Model model) {
		model.addAttribute("signupDTO", customerService.findById(cid));
		return "signup";  // -??/    /signup.jsp 
	}
	
	
	@GetMapping("/csignup")
	public String signupPage() {
		return "signup";  // -??/    /signup.jsp 
	}
	
	//@ModelAttribute  - reading all the form parameter from incoming request
	//and populated into instance of SignupDTO type 
	@PostMapping("/csignup")
	public String postSignupPage(@ModelAttribute SignupDTO signupDTO,Model model) {
		customerService.saveOrUpdate(signupDTO);
		if(signupDTO.getCid()==0) {
			model.addAttribute("message", "Ahahah you have registered successfully!!!!");
				
		}else {
			model.addAttribute("message", "Ahahah record is updated successfully!!!!");
		}
		return "login";  // -??/    /signup.jsp 
	}
	
	
	@PostMapping("/auth")
	public String postLogin(@RequestParam String username,@RequestParam String password, Model model) {
		if(customerService.auth(username, password)) {
			return "home";
		}else {
			model.addAttribute("message", "Hmmmmmm sorry , your username and password are not correct!");
			return "login";  // -??/    /login.jsp	
		}
	}
	
	
	@GetMapping("/addEmployee")
	public String addEmployeePage() {
		return "addEmployee";  // -??/    /addEmployee.jsp 
	}
	
	@PostMapping("/addEmployee")
	public String addEmployeePost(@RequestParam String name,@RequestParam String email,@RequestParam int age) {
		EmployeeDTO dto=new EmployeeDTO();
		dto.setAge(age);
		dto.setEmail(email);
		dto.setName(name);
		employeeService.save(dto);
		return "redirect:/signups";
	}

}
