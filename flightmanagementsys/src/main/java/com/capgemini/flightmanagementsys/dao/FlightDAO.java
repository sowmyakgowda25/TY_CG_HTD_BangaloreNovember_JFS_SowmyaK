package com.capgemini.flightmanagementsys.dao;

import java.util.List;

import com.capgemini.flightmanagementsys.dto.Flight;

public interface FlightDAO {
	
	public boolean addFlight(Flight flight);
	boolean modifyFlight(int flightNumber,String flightModel,String carrierName,int seatCapacity);
	public Flight searchFlight(int flightNumber);
	public boolean deleteFlight(int flightNumber);
	public List<Flight> getAllFlight();
}
