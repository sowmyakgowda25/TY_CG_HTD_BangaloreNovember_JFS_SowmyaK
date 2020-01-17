package com.capgemini.fms_springrest.services;

import com.capgemini.fms_springrest.dto.LoginBean;

public interface AdminService {
	
	boolean adminRegister(LoginBean admin);
	boolean adminLogin(String name ,String password);
	boolean clientSignUp(LoginBean client);
	boolean clientLogin(String name ,String password);
	boolean schedularSignUp(LoginBean schedular);
}
