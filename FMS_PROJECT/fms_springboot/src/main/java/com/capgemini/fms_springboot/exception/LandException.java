package com.capgemini.fms_springboot.exception;

@SuppressWarnings("serial")
public class LandException extends RuntimeException{
	private String message;

	public LandException(String message) {
		super(message);
	}

	@Override
	public String toString() {
		return message;
	}
}
