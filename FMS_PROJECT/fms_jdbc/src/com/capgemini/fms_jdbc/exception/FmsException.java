package com.capgemini.fms_jdbc.exception;

@SuppressWarnings("serial")
public class FmsException extends Exception {

	private String message;

	public FmsException(String message) {
		super();
		this.message = message;
	}

	@Override
	public String toString() {
		return message;
	}

}
