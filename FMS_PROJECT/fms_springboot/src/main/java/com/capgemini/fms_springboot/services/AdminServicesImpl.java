package com.capgemini.fms_springboot.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.capgemini.fms_springboot.dao.AdminDao;
import com.capgemini.fms_springboot.dto.LoginBean;

@Service
public class AdminServicesImpl implements AdminService{
	
	@Autowired
	private AdminDao dao;
	
	
	public boolean adminLogin(String name, String password) {
		return dao.adminLogin(name, password);
	}

	public boolean clientSignUp(LoginBean client) {
		return dao.clientSignUp(client);
	}

	public boolean schedularSignUp(LoginBean schedular) {
		return dao.schedularSignUp(schedular);
	}

	@Override
	public boolean adminRegister(LoginBean admin) {
		return dao.adminRegister(admin);
	}

	@Override
	public boolean clientLogin(String name, String password) {
		return dao.clientLogin(name, password);
	}
}