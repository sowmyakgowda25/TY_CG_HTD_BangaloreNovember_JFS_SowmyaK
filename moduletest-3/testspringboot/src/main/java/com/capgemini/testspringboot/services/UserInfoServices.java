package com.capgemini.testspringboot.services;

import com.capgemini.testspringboot.dto.UserInfo;

public interface UserInfoServices {
	
	public boolean addUser(UserInfo user);
	
	public UserInfo login(UserInfo credentials);
	
	public boolean updatePassword(int id, String password);

}
