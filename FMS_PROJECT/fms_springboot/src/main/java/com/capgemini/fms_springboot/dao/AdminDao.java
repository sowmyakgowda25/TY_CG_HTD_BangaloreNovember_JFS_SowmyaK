package com.capgemini.fms_springboot.dao;

import com.capgemini.fms_springboot.dto.LoginBean;

public interface AdminDao {
	
	boolean adminRegister(LoginBean admin);
	boolean adminLogin(String name ,String password);
	boolean clientSignUp(LoginBean client);
	boolean clientLogin(String name ,String password);
	boolean schedularSignUp(LoginBean schedular);
}
