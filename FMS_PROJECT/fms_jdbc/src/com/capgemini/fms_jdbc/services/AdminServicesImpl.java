package com.capgemini.fms_jdbc.services;

import java.util.List;

import com.capgemini.fms_jdbc.bean.LoginBean;
import com.capgemini.fms_jdbc.dao.AdminDao;
import com.capgemini.fms_jdbc.exception.FmsException;
import com.capgemini.fms_jdbc.factory.AdminFactory;

public class AdminServicesImpl implements AdminService {
	AdminDao dao = AdminFactory.instanceOfAdminDAOImpl();

	@Override
	public boolean loginAdmin(String name, String password) throws FmsException {
		return dao.loginAdmin(name, password);
	}

	@Override
	public boolean clientLogin(String name, String password) throws FmsException {
		return dao.clientLogin(name, password);
	}

	@Override
	public boolean addClient(LoginBean bean) throws FmsException {
		return dao.addClient(bean);
	}

	@Override
	public boolean deleteClient(int id) throws FmsException {
		return dao.deleteClient(id);
	}

	@Override
	public List<LoginBean> getAllClient() {
		return dao.getAllClient();
	}	
}
