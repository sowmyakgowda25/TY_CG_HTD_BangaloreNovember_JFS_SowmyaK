package com.capgemini.fms_springboot.exception;

@SuppressWarnings("serial")
public class LoginException extends RuntimeException{
	
	private String message;

	public LoginException(String message) {
		super(message);
	}

	@Override
	public String toString() {
		return message;
	}
	
}
