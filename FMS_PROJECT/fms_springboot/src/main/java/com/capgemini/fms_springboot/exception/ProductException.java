package com.capgemini.fms_springboot.exception;

@SuppressWarnings("serial")
public class ProductException extends RuntimeException{
	
	private String message;

	public ProductException(String message) {
		super(message);
	}

	@Override
	public String toString() {
		return message;
	}
	
}
