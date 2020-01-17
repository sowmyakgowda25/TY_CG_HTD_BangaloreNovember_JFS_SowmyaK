package com.capgemini.fms_jpahibernate.factory;

import com.capgemini.fms_jpahibernate.dao.LandDao;
import com.capgemini.fms_jpahibernate.dao.LandDaoImpl;
import com.capgemini.fms_jpahibernate.service.LandServices;
import com.capgemini.fms_jpahibernate.service.LandServicesImpl;

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
