package com.capgemini.fms_jdbc.factory;

import com.capgemini.fms_jdbc.dao.AdminDao;
import com.capgemini.fms_jdbc.dao.AdminDaoImpl;
import com.capgemini.fms_jdbc.services.AdminService;
import com.capgemini.fms_jdbc.services.AdminServicesImpl;

public class AdminFactory {

	public static AdminService instanceOfAdminServices() {
		AdminService services = new AdminServicesImpl();
		return services;
	}
	public static AdminDao instanceOfAdminDAOImpl() {
		AdminDao dao = new AdminDaoImpl();
		return dao;
	}

}
