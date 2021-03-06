package com.capgemini.testspringboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.capgemini.testspringboot.dto.OrderInfo;
import com.capgemini.testspringboot.dto.OrderInfoResponse;
import com.capgemini.testspringboot.services.OrderInfoServices;

@RestController
public class OrderInfoController {

	@Autowired
	OrderInfoServices service;
	
	@PostMapping(path = "/add-tocart", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public OrderInfoResponse addOrderToCart(@RequestBody OrderInfo order) {
		OrderInfoResponse response = new OrderInfoResponse();
		if (service.addOrderToCart(order)) {
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
	
	@GetMapping(path = "/view-order", produces = MediaType.APPLICATION_JSON_VALUE)
	public OrderInfoResponse viewAllOrders() {
		OrderInfoResponse response = new OrderInfoResponse();
		List<OrderInfo> list = service.getAllOrders();
		if (list.size() != 0) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Orders found");
			response.setOrder(list);
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("No data");
		}
		return response;

	}
}
