package com.keubiko.dao.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//POJO - Plain Old Java Object

@Entity
@Table(name="customers_tbl")
public class SignupEntity {

	private int cid;
	private String username;
	private String password;
	private String email;
	private String mobile;
	private String address;
	private String doe;
	private String salutation;
	
	public SignupEntity() {
		
	}

	public SignupEntity(String username, String password, String email, String mobile, String salutation) {
		super();
		this.username = username;
		this.password = password;
		this.email = email;
		this.mobile = mobile;
		this.salutation = salutation;
	}
	
	
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getDoe() {
		return doe;
	}

	public void setDoe(String doe) {
		this.doe = doe;
	}

	@Column(length = 400)
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Column(name="name")
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getSalutation() {
		return salutation;
	}

	public void setSalutation(String salutation) {
		this.salutation = salutation;
	}

	@Override
	public String toString() {
		return "SignupEntity [username=" + username + ", password=" + password + ", email=" + email + ", mobile=" + mobile
				+ ", salutation=" + salutation + "]";
	}

}
