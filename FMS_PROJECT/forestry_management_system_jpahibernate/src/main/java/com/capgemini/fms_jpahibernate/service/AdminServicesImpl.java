package com.capgemini.fms_jpahibernate.service;

import com.capgemini.fms_jpahibernate.dao.AdminDao;
import com.capgemini.fms_jpahibernate.dto.LoginBean;
import com.capgemini.fms_jpahibernate.exception.FmsException;
import com.capgemini.fms_jpahibernate.factory.AdminFactory;

public class AdminServicesImpl implements AdminService{
	AdminDao dao = AdminFactory.instanceOfAdminDAOImpl();

	public boolean loginAdmin(String name, String password,String type) throws FmsException {
		return dao.loginAdmin(name, password , type);
	}

	public boolean clientSignUp(LoginBean admin) throws FmsException {
		return dao.clientSignUp(admin);
	}

	public boolean schedularSignUp(LoginBean admin) throws FmsException {
		return dao.schedularSignUp(admin);
	}

	
}
