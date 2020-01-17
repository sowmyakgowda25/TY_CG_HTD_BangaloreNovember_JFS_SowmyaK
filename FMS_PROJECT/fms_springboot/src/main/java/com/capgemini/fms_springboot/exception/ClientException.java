package com.capgemini.fms_springboot.exception;

@SuppressWarnings("serial")
public class ClientException extends RuntimeException{
	
	private String message;

	public ClientException(String message) {
		super(message);
	}

	@Override
	public String toString() {
		return message;
	}
	
	
}
