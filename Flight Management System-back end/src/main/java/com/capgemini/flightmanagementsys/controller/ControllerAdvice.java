package com.capgemini.flightmanagementsys.controller;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.capgemini.flightmanagementsys.dto.FlightResponse;
import com.capgemini.flightmanagementsys.dto.UserResponse;
import com.capgemini.flightmanagementsys.exception.FlightException;
import com.capgemini.flightmanagementsys.exception.UserException;

@RestControllerAdvice
public class ControllerAdvice {
	
	@ExceptionHandler(UserException.class)
	public UserResponse handleUserException(UserException e) {
		UserResponse response = new UserResponse();
		response.setStatusCode(501);
		response.setMessage("Exception");
		response.setDescription(e.getMessage());
		return response;
	}
	
	@ExceptionHandler(FlightException.class)
	public FlightResponse handleFlightException(FlightException e) {
		FlightResponse response = new FlightResponse();
		response.setStatusCode(501);
		response.setMessage("Exception");
		response.setDescription(e.getMessage());
		return response;
	}
}
