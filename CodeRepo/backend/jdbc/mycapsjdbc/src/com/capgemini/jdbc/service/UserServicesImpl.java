package com.capgemini.jdbc.service;

import java.util.List;

import com.capgemini.jdbc.bean.UserBean;
import com.capgemini.jdbc.dao.UserDAO;
import com.capgemini.jdbc.factory.UserFactory;

public class UserServicesImpl implements UserServices{
	
	UserDAO dao = UserFactory.instanceOfUserDAOImpl();

	@Override
	public UserBean userLogin(String username, String password) {
		return dao.userLogin(username,password);
	}

	@Override
	public List<UserBean> getAllUsers() {
		return dao.getAllUsers();
	}

	@Override
	public boolean updateUser(int userid, String password, String email) {
		return dao.updateUser(userid,password,email);
	}

	@Override
	public boolean insertUser(UserBean user) {
		return dao.insertUser(user);
	}

	@Override
	public boolean deleteUser(int userid, String password) {
		return dao.deleteUser(userid,password);
	}

	@Override
	public boolean updateUser(UserBean user) {
		// TODO Auto-generated method stub
		return false;
	}

	
}
