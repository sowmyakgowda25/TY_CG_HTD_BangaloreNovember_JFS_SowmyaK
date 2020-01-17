package com.capgemini.fms_jpahibernate.factory;

import com.capgemini.fms_jpahibernate.dao.AdminDao;
import com.capgemini.fms_jpahibernate.dao.AdminDaoImpl;
import com.capgemini.fms_jpahibernate.service.AdminService;
import com.capgemini.fms_jpahibernate.service.AdminServicesImpl;

public class AdminFactory {

	public static AdminService instanceOfAdminServices() {
		AdminService services = new AdminServicesImpl();
		return services;
	}
	public static AdminDao instanceOfAdminDAOImpl() {
		AdminDao dao = new AdminDaoImpl();
		return dao;
	}
	public static AdminDao getAdminDAO() {
		return null;
	}
}
