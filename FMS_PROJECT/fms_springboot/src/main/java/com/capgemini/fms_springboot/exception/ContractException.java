package com.capgemini.fms_springboot.exception;

@SuppressWarnings("serial")
public class ContractException extends RuntimeException{
	
	private String message;

	public ContractException(String message) {
		super(message);
	}

	@Override
	public String toString() {
		return message;
	}
	
}
