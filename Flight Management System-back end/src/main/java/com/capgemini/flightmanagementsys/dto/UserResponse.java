package com.capgemini.flightmanagementsys.dto;

import java.util.List;

public class UserResponse {

	private int statusCode;
	private String message;
	private String description;
	private List<User> bean;
	private String userType;

	public int getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<User> getBean() {
		return bean;
	}

	public void setBean(List<User> bean) {
		this.bean = bean;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	
}
