package com.keubiko.dto;

//POJO - Plain Old Java Object
public class SignupDTO {

	private int cid;
	private String username;
	private String password;
	private String email;
	private String mobile;
	private String address;
	private String doe;
	private String salutation;
	
	public SignupDTO() {
		
	}

	public SignupDTO(String username, String password, String email, String mobile, String salutation) {
		super();
		this.username = username;
		this.password = password;
		this.email = email;
		this.mobile = mobile;
		this.salutation = salutation;
	}
	
	
	
	

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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

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
		return "SignupDTO [username=" + username + ", password=" + password + ", email=" + email + ", mobile=" + mobile
				+ ", salutation=" + salutation + "]";
	}

}
