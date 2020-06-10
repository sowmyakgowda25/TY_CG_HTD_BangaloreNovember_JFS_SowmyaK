package com.capgemini.flightmanagementsys.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.flightmanagementsys.dao.UserDAO;
import com.capgemini.flightmanagementsys.dto.User;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDAO dao;

	@Override
	public boolean addUser(User user) {
		return dao.addUser(user);
	}

	@Override
	public boolean modifyUser(int userId, String userName, String userPassword, long userPhone, String userEmail) {
		return dao.modifyUser(userId, userName, userPassword, userPhone, userEmail);
	}

	@Override
	public User searchUser(int userId) {
		return dao.searchUser(userId);
	}

	@Override
	public boolean deleteUser(int userId) {
		return dao.deleteUser(userId);
	}

	@Override
	public List<User> getAllUser() {
		return dao.getAllUser();
	}

	@Override
	public User adminLogin(User credentials) {
		return dao.adminLogin(credentials);
	}

}
