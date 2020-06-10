package com.capgemini.flightmanagementsys.service;

import java.util.List;

import com.capgemini.flightmanagementsys.dto.User;

public interface UserService {
	
	public boolean addUser(User user);
	public User adminLogin(User credentials);
	boolean modifyUser(int userId,String userName,String userPassword,long userPhone,String userEmail);
	public User searchUser(int userId);
	public boolean deleteUser(int userId);
	public List<User> getAllUser();
}
