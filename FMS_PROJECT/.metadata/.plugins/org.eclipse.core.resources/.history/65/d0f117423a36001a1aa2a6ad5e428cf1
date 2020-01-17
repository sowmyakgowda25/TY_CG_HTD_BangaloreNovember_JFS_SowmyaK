package com.capgemini.fms_springrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.fms_springrest.dto.CustomerBean;
import com.capgemini.fms_springrest.dto.CustomerResponse;
import com.capgemini.fms_springrest.services.CustomerServices;

@RestController
public class Customer {
	
	@Autowired
	private CustomerServices service;
	
	@PostMapping(path = "/add-customer",produces = MediaType.APPLICATION_JSON_VALUE,
			consumes = MediaType.APPLICATION_JSON_VALUE)
	public CustomerResponse addCustomer(@RequestBody CustomerBean bean)  {
		CustomerResponse response = new CustomerResponse();
		
		if(service.addCustomer(bean)) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Customer Registered");
		}
		else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Customer already exists");
		}
		return response;
	}
	
	@PutMapping(path = "/modify-customername", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public CustomerResponse modifyCustomerName(@RequestBody CustomerBean customer) {
		CustomerResponse response = new CustomerResponse();
		if (service.modifyCustomerName(customer.getCustId(), customer.getCustName())) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Customer name updated");
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Customer name not found");
		}
		return response;
	}	
	
	@PutMapping(path = "/modify-customeraddress1", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public CustomerResponse modifyCustomerAddress1(@RequestBody CustomerBean customer) {
		CustomerResponse response = new CustomerResponse();
		if (service.modifyCustomerAddress1(customer.getCustId(), customer.getStreetAddress1())) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Customer address1 updated");
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Customer address1 not found");
		}
		return response;
	}	
	
	@PutMapping(path = "/modify-customeraddress2", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public CustomerResponse modifyCustomerAddress2(@RequestBody CustomerBean customer) {
		CustomerResponse response = new CustomerResponse();
		if (service.modifyCustomerAddress2(customer.getCustId(), customer.getStreetAddress2())) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Customer address2 updated");
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Customer address2 not found");
		}
		return response;
	}	
	
	@PutMapping(path = "/modify-customertown", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public CustomerResponse modifyCustomerTown(@RequestBody CustomerBean customer) {
		CustomerResponse response = new CustomerResponse();
		if (service.modifyCustomerTown(customer.getCustId(), customer.getTown())) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Customer town updated");
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Customer town not found");
		}
		return response;
	}	
	
	@PutMapping(path = "/modify-customeremail", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public CustomerResponse modifyCustomerEmail(@RequestBody CustomerBean customer) {
		CustomerResponse response = new CustomerResponse();
		if (service.modifyCustomerEmail(customer.getCustId(), customer.getEmail())) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Customer email updated");
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Customer email not found");
		}
		return response;
	}	
	
	@PutMapping(path = "/modify-postalcode", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public CustomerResponse modifyCustomerPostalCode(@RequestBody CustomerBean customer) {
		CustomerResponse response = new CustomerResponse();
		if (service.modifyCustomerPostalCode(customer.getCustId(), customer.getPostalCode())) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Customer postalcode updated");
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Customer postalcode not found");
		}
		return response;
	}	
	
	@PutMapping(path = "/modify-phone-number", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public CustomerResponse modifyCustomerTelePhoneNum(@RequestBody CustomerBean customer) {
		CustomerResponse response = new CustomerResponse();
		if (service.modifyCustomerTelePhoneNum(customer.getCustId(), customer.getTelephoneNumber())) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Customer email updated");
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Customer email not found");
		}
		return response;
	}	
	
	@DeleteMapping(path = "/deleteCustomer/{custId}",produces = MediaType.APPLICATION_JSON_VALUE)
	public CustomerResponse deleteCustomer(@PathVariable("custId")int custId){
		CustomerResponse response=new CustomerResponse();
		if(service.deleteCustomer(custId)) {
		response.setStatusCode(201);
		response.setMessage("Success");
		response.setDescription("Customer Details Deleted");
		}
		return response;
	}
	
	@GetMapping(path = "/view-allcustomer", produces = MediaType.APPLICATION_JSON_VALUE)
	public CustomerResponse viewAllContractor() {
		CustomerResponse response = new CustomerResponse();
		List<CustomerBean> list = service.getAllCustomer();
		if (list.size() != 0) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Customer found");
			response.setBean(list);
		} else {
			response.setStatusCode(401);
			response.setMessage("Exception");
			response.setDescription("No data Found");
		}
		return response;
	}
}
