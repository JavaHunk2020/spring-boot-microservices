package com.keubiko.dto;

public class AppResponse {

	private int id;
	private String code;
	private String message;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "AppResponse [id=" + id + ", code=" + code + ", message=" + message + "]";
	}

}
