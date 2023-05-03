/*package com.keubiko.dao;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.keubiko.dao.entity.SignupEntity;

@Repository
public class CustomerDaoImpl implements CustomerDao{
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public boolean auth(String username,String password) {
		String sql="select cid from customers_tbl where name=? and password = ? ";
		List<Integer> list=jdbcTemplate.queryForList(sql, new Object[] {username,password},Integer.class);
		return list.size() > 0;
	}
	
	@Override
	public void delete(String username) {
		String sql="delete from customers_tbl where name=?";
		jdbcTemplate.update(sql, new Object[] {username});
	}
	
	@Override
	public List<SignupEntity> findAll() {
		String sql="select cid,name as username,email,password,address,doe from customers_tbl";
		List<SignupEntity> signupEntities=jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(SignupEntity.class));
		return signupEntities;
	}
	
	
	@Override
	public SignupEntity findById(int cid) {
		String sql="select cid,name as username,email,password,address,doe from customers_tbl where cid=?";
		List<SignupEntity> signupEntities=jdbcTemplate.query(sql,new Object[] {cid}, new BeanPropertyRowMapper<>(SignupEntity.class));
		return signupEntities.get(0);
	}
	
	
	@Override
	public void saveOrUpdate(SignupEntity signupEntity) {
		if(signupEntity.getCid()==0) {
			String sql="insert into customers_tbl(name,email,password,address,doe) values(?,?,?,?,?)";
			jdbcTemplate.update(sql,new Object[] {signupEntity.getUsername(),signupEntity.getEmail(),signupEntity.getPassword(),signupEntity.getAddress(),new Timestamp(new Date().getTime())});
				
		}else {
			String sql="update customers_tbl set name=?,email=? where cid=?";
			jdbcTemplate.update(sql,new Object[] {signupEntity.getUsername(),signupEntity.getEmail(),signupEntity.getCid()});
		}
	}
	

} */
