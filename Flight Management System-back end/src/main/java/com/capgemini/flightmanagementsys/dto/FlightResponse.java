package com.capgemini.flightmanagementsys.dto;

import java.util.List;

public class FlightResponse {
	
	private int statusCode;
	private String message;
	private String description;
	private List<Flight> bean;
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
	public List<Flight> getBean() {
		return bean;
	}
	public void setBean(List<Flight> bean) {
		this.bean = bean;
	}
	@Override
	public String toString() {
		return "FlightResponse [statusCode=" + statusCode + ", message=" + message + ", description=" + description
				+ ", bean=" + bean + "]";
	}
	
}
