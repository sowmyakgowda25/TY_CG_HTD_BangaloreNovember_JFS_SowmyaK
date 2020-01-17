package com.capgemini.fms_springrest.exception;

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
