package com.capgemini.fms_springboot.dto;

import java.util.List;

public class CustomerResponse {
	
	private int statusCode;
	private String message;
	private String description;
	private List<CustomerBean> bean;
	
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
	public List<CustomerBean> getBean() {
		return bean;
	}
	public void setBean(List<CustomerBean> bean) {
		this.bean = bean;
	}
}
