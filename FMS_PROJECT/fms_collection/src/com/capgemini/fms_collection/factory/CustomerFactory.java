package com.capgemini.fms_collection.factory;

import com.capgemini.fms_collection.dao.CustomerDao;
import com.capgemini.fms_collection.dao.CustomerDaoImpl;
import com.capgemini.fms_collection.service.CustomerServices;
import com.capgemini.fms_collection.service.CustomerServicesImpl;

public class CustomerFactory {
	
	public static CustomerServices instanceOfCustomerServices() {
		CustomerServices services = new CustomerServicesImpl();
		return services;
	}
	public static CustomerDao instanceOfCustomerDAOImpl() {
		CustomerDao dao = new CustomerDaoImpl();
		return dao;
	}
	public static CustomerDao getCustomerDAO() {
		return null;
	}

}
