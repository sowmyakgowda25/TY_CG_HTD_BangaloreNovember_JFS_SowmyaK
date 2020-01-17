package com.capgemini.fms_springboot.exception;

@SuppressWarnings("serial")
public class CustomerException extends RuntimeException{
	
	private String message;

	public CustomerException(String message) {
		super(message);
	}

	@Override
	public String toString() {
		return message;
	}
	
	
}
