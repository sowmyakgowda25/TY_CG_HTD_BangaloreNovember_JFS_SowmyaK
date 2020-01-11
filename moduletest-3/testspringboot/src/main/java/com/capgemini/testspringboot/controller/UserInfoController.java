package com.capgemini.testspringboot.controller;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.capgemini.testspringboot.dto.UserInfo;
import com.capgemini.testspringboot.dto.UserInfoResponse;
import com.capgemini.testspringboot.services.UserInfoServices;

@RestController
public class UserInfoController {

	@Autowired
	UserInfoServices service;

	@PostMapping(path = "/add-user", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public UserInfoResponse addUser(@RequestBody UserInfo user) {
		UserInfoResponse response = new UserInfoResponse();
		if (service.addUser(user)) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Product added");
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Product with same name already exists");
		}
		return response;
	}

	@PostMapping(path = "/user-login", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public UserInfoResponse login(@RequestBody UserInfo credentials) {
		UserInfoResponse response = new UserInfoResponse();
		UserInfo info = service.login(credentials);
		if (info != null) {
			response.setStatusCode(201);
			response.setDescription("Success");
			response.setMessage("Logged in");
			response.setUser(Arrays.asList(info));
		} else {
			response.setStatusCode(405);
			response.setDescription("Failure");
			response.setMessage("Provide valid credentials");
		}
		return response;
	}
}
