package com.capgemini.flightmanagementsys.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.capgemini.flightmanagementsys.dto.Flight;
import com.capgemini.flightmanagementsys.dto.FlightResponse;
import com.capgemini.flightmanagementsys.service.FlightService;

@CrossOrigin(origins = "*", allowedHeaders = "*",allowCredentials = "true")
@RestController
public class FlightController {
	
	@Autowired
	private FlightService service;
	
	@PostMapping(path = "/add-flight",produces = MediaType.APPLICATION_JSON_VALUE,
			consumes = MediaType.APPLICATION_JSON_VALUE)
	public FlightResponse addFlight(@RequestBody Flight bean)  {
		FlightResponse response = new FlightResponse();
		
		if(service.addFlight(bean)) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Flight added successfully");
			response.setBean(Arrays.asList(bean));
		}
		else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Flight Number already exists");
			
		}
		return response;
	}
	
	
	@PutMapping(path = "/modify-flight", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public FlightResponse modifyFlight(@RequestBody Flight flight) {
		FlightResponse response = new FlightResponse();
		if (service.modifyFlight(flight.getFlightNumber(), flight.getFlightModel(), flight.getCarrierName(), flight.getSeatCapacity())) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("flight details updated");
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("flight name not found");
		}
		return response;
	}	
	
	@DeleteMapping(path = "/delete-flight/{flightNumber}",produces = MediaType.APPLICATION_JSON_VALUE)
	public FlightResponse deleteFlight(@PathVariable("flightNumber")int flightNumber){
		FlightResponse response=new FlightResponse();
		if(service.deleteFlight(flightNumber)) {
		response.setStatusCode(201);
		response.setMessage("Success");
		response.setDescription("Flight Details Deleted");
		response.setBean(Arrays.asList());
		}
		return response;
	}
	
	@GetMapping(path = "/get-allflight", produces = MediaType.APPLICATION_JSON_VALUE)
	public FlightResponse viewAllFlight() {
		FlightResponse response = new FlightResponse();
		List<Flight> list = service.getAllFlight();
		if (list.size() != 0) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Flight found");
			response.setBean(list);
		} else {
			response.setStatusCode(401);
			response.setMessage("Exception");
			response.setDescription("No data Found");
		}
		return response;
	}
}
