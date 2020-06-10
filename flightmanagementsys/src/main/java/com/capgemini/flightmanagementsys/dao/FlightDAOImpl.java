package com.capgemini.flightmanagementsys.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.capgemini.flightmanagementsys.dto.Flight;
import com.capgemini.flightmanagementsys.exception.FlightException;

@Repository
public class FlightDAOImpl implements FlightDAO {
	
	@PersistenceUnit
	private EntityManagerFactory entityManagerFactory;
	
	@Override
	public boolean addFlight(Flight flight) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		try {
			entityManager.persist(flight);
			transaction.commit();
		} catch (Exception e) {
			transaction.rollback();
			throw new FlightException("Flight already exist");
		}
		entityManager.close();
		return true;
	}

	@Override
	public boolean modifyFlight(int flightNumber, String flightModel, String carrierName, int seatCapacity) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		try {
			Flight details = entityManager.find(Flight.class, flightNumber);
			details.setFlightNumber(flightNumber);
			details.setFlightModel(flightModel);
			details.setCarrierName(carrierName);
			details.setSeatCapacity(seatCapacity);
			transaction.commit();
			return true;
		} catch (Exception e) {
			transaction.rollback();
			throw new FlightException("Flight doesn't exist");
		}
	}

	@Override
	public Flight searchFlight(int flightNumber) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		Flight bean = entityManager.find(Flight.class, flightNumber);
		return bean;
	}

	@Override
	public boolean deleteFlight(int flightNumber) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		try {
			Flight details = entityManager.find(Flight.class, flightNumber);
			entityManager.remove(details);
			transaction.commit();
			return true;
		} catch (Exception e) {
			transaction.rollback();
			throw new FlightException("Flight doesn't exist");
		}
	}

	@Override
	public List<Flight> getAllFlight() {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();
		try {
			String jpql = "from Flight";
			Query query = entityManager.createQuery(jpql);
			@SuppressWarnings("unchecked")
			List<Flight> details = query.getResultList();
			return details;
		} catch (Exception e) {
			transaction.rollback();
			throw new FlightException("No Data Found");
		}
	}

}
