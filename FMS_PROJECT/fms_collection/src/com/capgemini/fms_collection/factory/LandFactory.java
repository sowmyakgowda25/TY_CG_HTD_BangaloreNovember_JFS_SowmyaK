package com.capgemini.fms_collection.factory;

import com.capgemini.fms_collection.dao.LandDao;
import com.capgemini.fms_collection.dao.LandDaoImpl;
import com.capgemini.fms_collection.service.LandServices;
import com.capgemini.fms_collection.service.LandServicesImpl;

public class LandFactory {
	
	public static LandServices instanceOfLandServices() {
		LandServices services = new LandServicesImpl();
		return services;
	}
	public static LandDao instanceOfLandDAOImpl() {
		LandDao dao = new LandDaoImpl();
		return dao;
	}
	public static LandDao getLandDAO() {
		return null;
	}
}
