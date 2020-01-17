package com.capgemini.fms_springboot.exception;

@SuppressWarnings("serial")
public class HaulierException extends RuntimeException{
	
	private String message;

	public HaulierException(String message) {
		super(message);
	}

	@Override
	public String toString() {
		return message;
	}
	
}
