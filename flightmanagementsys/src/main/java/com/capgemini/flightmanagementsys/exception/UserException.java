package com.capgemini.flightmanagementsys.exception;

@SuppressWarnings("serial")
public class UserException extends RuntimeException {

	private String message;

	public UserException(String message) {
		super(message);
	}

	@Override
	public String toString() {
		return message;
	}
}
