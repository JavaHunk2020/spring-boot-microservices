package com.keubiko.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.keubiko.dao.CustomerRepository;
import com.keubiko.dao.entity.SignupEntity;
import com.keubiko.dto.SignupDTO;

@Service
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	private CustomerRepository customerDao;

	@Override
	public void delete(String username) {
		customerDao.deleteByUsername(username);
	}

	@Override
	public List<SignupDTO> findAll() {
		List<SignupEntity> signupEntities=customerDao.findAll();
		return signupEntities.stream().map(s-> {
			SignupDTO signupDTO=new  SignupDTO();
			BeanUtils.copyProperties(s, signupDTO);
			return signupDTO;
		}).collect(Collectors.toList());
	}

	@Override
	public SignupDTO findById(int cid) {
		SignupEntity entity=customerDao.findById(cid).get();
		SignupDTO signupDTO=new  SignupDTO();
		BeanUtils.copyProperties(entity, signupDTO);
		return signupDTO;
	}

	@Override
	public void saveOrUpdate(SignupDTO signupDTO) {
		SignupEntity entity=new  SignupEntity();
		BeanUtils.copyProperties(signupDTO, entity);
		customerDao.save(entity);
	}

	@Override
	public boolean auth(String username, String password) {
		return customerDao.findByUsernameAndPassword(username, password).isPresent();
	}
	
	

}
