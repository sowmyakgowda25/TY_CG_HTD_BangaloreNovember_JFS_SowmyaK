package com.capgemini.fms_jdbc.services;

import java.util.List;

import com.capgemini.fms_jdbc.bean.LoginBean;
import com.capgemini.fms_jdbc.exception.FmsException;

public interface AdminService {
	
	boolean loginAdmin(String name, String password) throws FmsException;

	boolean clientLogin(String name, String password) throws FmsException;

	boolean addClient(LoginBean bean) throws FmsException;

	boolean deleteClient(int id) throws FmsException;

	public List<LoginBean> getAllClient();
}