package com.capgemini.fms_collection.service;

import com.capgemini.fms_collection.bean.LoginBean;
import com.capgemini.fms_collection.dao.AdminDao;
import com.capgemini.fms_collection.exception.FmsException;
import com.capgemini.fms_collection.factory.AdminFactory;

public class AdminServicesImpl implements AdminService {
	AdminDao dao = AdminFactory.instanceOfAdminDAOImpl();

	@Override
	public boolean loginAdmin(String adminName, String password) throws FmsException {
		return dao.loginAdmin(adminName,password);
	}

	@Override
	public boolean clientSignUp(LoginBean bean) throws FmsException {
		return dao.clientSignUp( bean);
	}

	@Override
	public boolean schedularSignUp(LoginBean bean) throws FmsException {
		return dao.schedularSignUp( bean);
	}
}
