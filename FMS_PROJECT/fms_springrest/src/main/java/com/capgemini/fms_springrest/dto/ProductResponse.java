package com.capgemini.fms_springrest.dto;

import java.util.List;

public class ProductResponse {
	
	private int statusCode;
	private String message;
	private String discription;
	private List<ProductBean> bean;
	
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
	public List<ProductBean> getBean() {
		return bean;
	}
	public void setBean(List<ProductBean> bean) {
		this.bean = bean;
	}
}
