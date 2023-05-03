package com.keubiko.service;

import java.util.List;

import com.keubiko.dto.SignupDTO;

public interface CustomerService {
	
	void delete(String username);

	List<SignupDTO> findAll();

	SignupDTO findById(int cid);

	void saveOrUpdate(SignupDTO signupDTO);

	boolean auth(String username, String password);

}
