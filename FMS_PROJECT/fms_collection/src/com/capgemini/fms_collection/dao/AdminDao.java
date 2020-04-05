package com.capgemini.fms_collection.dao;

import com.capgemini.fms_collection.bean.LoginBean;
import com.capgemini.fms_collection.exception.FmsException;

public interface AdminDao {
	boolean loginAdmin(String adminName, String password) throws FmsException;

	boolean clientSignUp(LoginBean bean) throws FmsException;

	boolean schedularSignUp(LoginBean bean) throws FmsException;
}