package com.capgemini.flightmanagementsys.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.flightmanagementsys.dto.User;
import com.capgemini.flightmanagementsys.dto.UserResponse;
import com.capgemini.flightmanagementsys.service.UserService;

@CrossOrigin(origins = "*", allowedHeaders = "*",allowCredentials = "true")
@RestController
public class UserController {
	
	@Autowired
	private UserService service;
	
	@PostMapping(path = "/add-user",produces = MediaType.APPLICATION_JSON_VALUE,
			consumes = MediaType.APPLICATION_JSON_VALUE)
	public UserResponse addUser(@RequestBody User bean)  {
		UserResponse response = new UserResponse();
		
		if(service.addUser(bean)) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("User added successfully");
			response.setBean(Arrays.asList(bean));
			response.setUserType(bean.getUserType());
		}
		else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("User already exists");
			
		}
		return response;
	}
	
	@PostMapping(path = "/adminLogin", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public UserResponse adminLogin(@RequestBody User credentials) {
		UserResponse response = new UserResponse();
		User account = service.adminLogin(credentials);
		if (account != null) {
			response.setStatusCode(201);
			response.setDescription("Credentials found");
			response.setMessage("Successfully Logged In");
			response.setBean(Arrays.asList(account));
			response.setUserType(account.getUserType());
		} else {
			response.setStatusCode(405);
			response.setDescription("Failure");
			response.setMessage("Provide valid credentials");
		}
		return response;
	}

	
	@PutMapping(path = "/modify-user", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public UserResponse modifyUser(@RequestBody User user) {
		UserResponse response = new UserResponse();
		if (service.modifyUser(user.getUserId(), user.getUserName(), user.getUserPassword(), user.getUserPhone(), user.getUserEmail())) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("User details updated");
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("USer name not found");
		}
		return response;
	}	
	
	@DeleteMapping(path = "/delete-user/{userId}",produces = MediaType.APPLICATION_JSON_VALUE)
	public UserResponse deleteUser(@PathVariable("userId")int userId){
		UserResponse response=new UserResponse();
		if(service.deleteUser(userId)) {
		response.setStatusCode(201);
		response.setMessage("Success");
		response.setDescription("User Details Deleted");
		response.setBean(Arrays.asList());
		}
		return response;
	}
	
	@GetMapping(path = "/get-alluser", produces = MediaType.APPLICATION_JSON_VALUE)
	public UserResponse viewAllUser() {
		UserResponse response = new UserResponse();
		List<User> list = service.getAllUser();
		if (list.size() != 0) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("User found");
			response.setBean(list);
		} else {
			response.setStatusCode(401);
			response.setMessage("Exception");
			response.setDescription("No data Found");
		}
		return response;
	}
}
