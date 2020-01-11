package com.capgemini.testspringboot.controller;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.capgemini.testspringboot.dto.ProductInfo;
import com.capgemini.testspringboot.dto.ProductInfoResponse;
import com.capgemini.testspringboot.services.ProductInfoServices;

@RestController
public class ProductInfoController {

	@Autowired
	ProductInfoServices service;

	@PostMapping(path = "/add-productinfo", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ProductInfoResponse addProduct(@RequestBody ProductInfo product) {
		ProductInfoResponse response = new ProductInfoResponse();
		if (service.addProduct(product)) {
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

	@GetMapping(path = "/search-product", produces = MediaType.APPLICATION_JSON_VALUE)
	public ProductInfoResponse searchProduct(@RequestParam("id") int id) {
		ProductInfoResponse response = new ProductInfoResponse();
		ProductInfo product = service.searchProduct(id);
		if (product != null) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Product found");
			response.setProduct(Arrays.asList(product));
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Product id does not exist");
		}
		return response;
	}
}
