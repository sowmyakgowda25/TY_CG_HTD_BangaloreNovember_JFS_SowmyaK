package com.capgemini.flightmanagementsys.service;

import java.util.List;

import com.capgemini.flightmanagementsys.dto.Flight;

public interface FlightService {
	
	public boolean addFlight(Flight flight);
	boolean modifyFlight(int flightNumber,String flightModel,String carrierName,int seatCapacity);
	public Flight searchFlight(int flightNumber);
	public boolean deleteFlight(int flightNumber);
	public List<Flight> getAllFlight();
}
