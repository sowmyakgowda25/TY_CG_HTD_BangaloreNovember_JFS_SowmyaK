package com.capgemini.fms_jdbc.factory;

import com.capgemini.fms_jdbc.dao.HaulierDao;
import com.capgemini.fms_jdbc.dao.HaulierDaoImpl;
import com.capgemini.fms_jdbc.services.HaulierServices;
import com.capgemini.fms_jdbc.services.HaulierServicesImpl;

public class HaulierFactory {
	
	public static HaulierServices instanceOfHaulierServices() {
		HaulierServices services = new HaulierServicesImpl();
		return services;
	}
	public static HaulierDao instanceOfHaulierDAOImpl() {
		HaulierDao dao = new HaulierDaoImpl();
		return dao;
	}
	public static HaulierDao getHaulierDAO() {
		return null;
	}
}
