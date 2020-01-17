package com.capgemini.fms_collection.factory;

import com.capgemini.fms_collection.dao.AdminDao;
import com.capgemini.fms_collection.dao.AdminDaoImpl;
import com.capgemini.fms_collection.service.AdminService;
import com.capgemini.fms_collection.service.AdminServicesImpl;

public class AdminFactory {
	public static AdminDao getAdminDAO() {
		return new AdminDaoImpl();
	}
	public static AdminService instanceOfAdminServices() {
		AdminService services = new AdminServicesImpl();
		return services;
	}
	public static AdminDao instanceOfAdminDAOImpl() {
		AdminDao dao = new AdminDaoImpl();
		return dao;
	}
}
