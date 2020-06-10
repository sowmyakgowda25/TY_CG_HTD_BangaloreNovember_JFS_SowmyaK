package com.capgemini.flightmanagementsys.exception;

@SuppressWarnings("serial")
public class FlightException extends RuntimeException {

	private String message;

	public FlightException(String message) {
		super(message);

	}

	@Override
	public String toString() {
		return message;
	}
}
