package com.capgemini.fms_springboot.dto;

import java.util.List;

public class LoginResponse {
	
	private int statusCode;
	private String message;
	private String discription;
	private List<LoginBean> bean;
	
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
	public String getDiscription() {
		return discription;
	}
	public void setDiscription(String discription) {
		this.discription = discription;
	}
	public List<LoginBean> getBean() {
		return bean;
	}
	public void setBean(List<LoginBean> bean) {
		this.bean = bean;
	}
}
