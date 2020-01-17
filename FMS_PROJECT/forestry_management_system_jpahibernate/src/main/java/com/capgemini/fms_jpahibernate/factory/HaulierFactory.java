package com.capgemini.fms_jpahibernate.factory;

import com.capgemini.fms_jpahibernate.dao.HaulierDao;
import com.capgemini.fms_jpahibernate.dao.HaulierDaoImpl;
import com.capgemini.fms_jpahibernate.service.HaulierServices;
import com.capgemini.fms_jpahibernate.service.HaulierServicesImpl;

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
