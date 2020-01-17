package com.capgemini.fms_jpahibernate.factory;

import com.capgemini.fms_jpahibernate.dao.CustomerDao;
import com.capgemini.fms_jpahibernate.dao.CustomerDaoImpl;
import com.capgemini.fms_jpahibernate.service.CustomerServices;
import com.capgemini.fms_jpahibernate.service.CustomerServicesImpl;

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
