package com.keubiko.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.transaction.annotation.Transactional;

import com.keubiko.dao.entity.SignupEntity;

public interface CustomerRepository extends JpaRepository<SignupEntity, Integer> {
	@Modifying
	@Transactional
	public Optional<SignupEntity>  deleteByUsername(String username);
	public Optional<SignupEntity>  findByUsernameAndPassword(String username,String password);

}
