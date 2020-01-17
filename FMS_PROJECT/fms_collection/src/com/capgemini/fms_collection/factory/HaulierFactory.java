package com.capgemini.fms_collection.factory;

import com.capgemini.fms_collection.dao.HaulierDao;
import com.capgemini.fms_collection.dao.HaulierDaoImpl;
import com.capgemini.fms_collection.service.HaulierServices;
import com.capgemini.fms_collection.service.HaulierServicesImpl;

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
