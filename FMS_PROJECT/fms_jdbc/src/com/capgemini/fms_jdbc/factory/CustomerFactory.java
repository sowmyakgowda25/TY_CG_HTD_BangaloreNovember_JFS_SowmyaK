package com.capgemini.fms_jdbc.factory;

import com.capgemini.fms_jdbc.dao.CustomerDao;
import com.capgemini.fms_jdbc.dao.CustomerDaoImpl;
import com.capgemini.fms_jdbc.services.CustomerServices;
import com.capgemini.fms_jdbc.services.CustomerServicesImpl;

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
