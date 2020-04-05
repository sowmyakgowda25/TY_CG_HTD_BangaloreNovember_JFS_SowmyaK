package com.capgemini.fms_jdbc.factory;

import com.capgemini.fms_jdbc.dao.LandDao;
import com.capgemini.fms_jdbc.dao.LandDaoImpl;
import com.capgemini.fms_jdbc.services.LandServices;
import com.capgemini.fms_jdbc.services.LandServicesImpl;

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