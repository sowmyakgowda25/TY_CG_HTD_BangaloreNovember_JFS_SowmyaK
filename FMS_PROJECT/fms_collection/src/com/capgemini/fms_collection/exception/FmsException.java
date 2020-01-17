package com.capgemini.fms_collection.exception;

@SuppressWarnings("serial")
public class FmsException extends Exception {

	private String message;

	public FmsException(String message) {
		super(message);
	}

	@Override
	public String toString() {
		return message;
	}

}
