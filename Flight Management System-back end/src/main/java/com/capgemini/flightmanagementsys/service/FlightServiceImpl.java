package com.capgemini.flightmanagementsys.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.flightmanagementsys.dao.FlightDAO;
import com.capgemini.flightmanagementsys.dto.Flight;

@Service
public class FlightServiceImpl implements FlightService {
	
	@Autowired
	private FlightDAO dao;
	
	@Override
	public boolean addFlight(Flight flight) {
		return dao.addFlight(flight);
	}

	@Override
	public boolean modifyFlight(int flightNumber, String flightModel, String carrierName, int seatCapacity) {
		return dao.modifyFlight(flightNumber, flightModel, carrierName, seatCapacity);
	}

	@Override
	public Flight searchFlight(int flightNumber) {
		return dao.searchFlight(flightNumber);
	}

	@Override
	public boolean deleteFlight(int flightNumber) {
		return dao.deleteFlight(flightNumber);
	}

	@Override
	public List<Flight> getAllFlight() {
		return dao.getAllFlight();
	}

}
