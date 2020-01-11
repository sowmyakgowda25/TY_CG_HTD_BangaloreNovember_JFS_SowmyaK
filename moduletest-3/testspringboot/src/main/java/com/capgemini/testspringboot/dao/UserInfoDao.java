package com.capgemini.testspringboot.dao;

import com.capgemini.testspringboot.dto.UserInfo;

public interface UserInfoDao {

	public boolean addUser(UserInfo user);

	public UserInfo login(UserInfo credentials);

	public boolean updatePassword(int id, String password);

}
