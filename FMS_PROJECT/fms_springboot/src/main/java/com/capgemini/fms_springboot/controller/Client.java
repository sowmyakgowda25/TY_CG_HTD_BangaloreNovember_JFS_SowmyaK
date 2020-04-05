package com.capgemini.fms_springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.capgemini.fms_springboot.dto.LoginBean;
import com.capgemini.fms_springboot.dto.LoginResponse;
import com.capgemini.fms_springboot.services.AdminService;

@RestController
public class Client {
	
	@Autowired
	private AdminService service;
	
	@PostMapping(path = "/clientLogin",produces = MediaType.APPLICATION_JSON_VALUE, 
			consumes = MediaType.APPLICATION_JSON_VALUE)
	public  LoginResponse clientLogin(@RequestBody LoginBean bean){
		
		LoginResponse response = new LoginResponse();
		if(service.clientLogin(bean.getUserName(), bean.getPassword())) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDiscription("Client found for Credentilas");
			//response.setBean(Arrays.asList(bean));
		}
		else {
			response.setStatusCode(401);
			response.setMessage("Exception");
			response.setDiscription("Invalid Credentials");
		}
		return response;
	}
}