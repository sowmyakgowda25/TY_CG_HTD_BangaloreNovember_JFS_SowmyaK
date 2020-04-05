package com.capgemini.testspringboot.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.capgemini.testspringboot.dao.UserInfoDao;
import com.capgemini.testspringboot.dto.UserInfo;

@Service
public class UserInfoServicesImpl implements UserInfoServices{

	@Autowired
	private UserInfoDao dao;

	@Override
	public boolean addUser(UserInfo user) {
		return dao.addUser(user);
	}

	@Override
	public UserInfo login(UserInfo credentials) {
		return dao.login(credentials);
	}

	@Override
	public boolean updatePassword(int id, String password) {
		return dao.updatePassword(id, password);
	}

}