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

import com.capgemini.fms_springrest.dto.HaulierBean;
import com.capgemini.fms_springrest.dto.HaulierResponse;
import com.capgemini.fms_springrest.services.HaulierServices;

@RestController
public class Haulier {
	
	@Autowired
	private HaulierServices service;
	
	@PostMapping(path = "/add-haulier",produces = MediaType.APPLICATION_JSON_VALUE,
			consumes = MediaType.APPLICATION_JSON_VALUE)
	public HaulierResponse addHaulier(@RequestBody HaulierBean bean)  {
		HaulierResponse response = new HaulierResponse();
		
		if(service.addHaulier(bean)) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Haulier added successfully");
		}
		else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Haulier already exists");
		}
		return response;
	}
	
	@PutMapping(path = "/modify-hauliername", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public HaulierResponse modifyHaulierName(@RequestBody HaulierBean haulier) {
		HaulierResponse response = new HaulierResponse();
		if (service.modifyHaulierName(haulier.getHaulierId(), haulier.getHaulierName())) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Haulier name updated");
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Haulier name not found");
		}
		return response;
	}	
	
	@PutMapping(path = "/modify-haulieraddress", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public HaulierResponse modifyHaulierAddress(@RequestBody HaulierBean haulier) {
		HaulierResponse response = new HaulierResponse();
		if (service.modifyHaulierAddress(haulier.getHaulierId(), haulier.getStreetAddress())) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Haulier address updated");
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Haulier address not found");
		}
		return response;
	}	

	@PutMapping(path = "/modify-haulier-postalcode", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public HaulierResponse modifyHaulierPostalCode(@RequestBody HaulierBean haulier) {
		HaulierResponse response = new HaulierResponse();
		if (service.modifyHaulierPostalCode(haulier.getHaulierId(), haulier.getPostalCode())) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Haulier postalcode updated");
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Haulier postalcode not found");
		}
		return response;
	}	
	
	@PutMapping(path = "/modify-town", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public HaulierResponse modifyHaulierTown(@RequestBody HaulierBean haulier) {
		HaulierResponse response = new HaulierResponse();
		if (service.modifyHaulierTown(haulier.getHaulierId(), haulier.getTown())) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Haulier town updated");
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Haulier town not found");
		}
		return response;
	}	
	
	@PutMapping(path = "/modify-hr-email", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public HaulierResponse modifyHaulierEmail(@RequestBody HaulierBean haulier) {
		HaulierResponse response = new HaulierResponse();
		if (service.modifyHaulierEmail(haulier.getHaulierId(), haulier.getEmail())) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Haulier email updated");
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Haulier email not found");
		}
		return response;
	}	
	
	@PutMapping(path = "/modify-hr-phone", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public HaulierResponse modifyHaulierTelePhoneNum(@RequestBody HaulierBean haulier) {
		HaulierResponse response = new HaulierResponse();
		if (service.modifyHaulierTelePhoneNum(haulier.getHaulierId(), haulier.getTelephoneNumber())) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Haulier Phone Number updated");
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Haulier Phone Number not found");
		}
		return response;
	}	
	
	@DeleteMapping(path = "/deleteHaulier/{haulierId}",produces = MediaType.APPLICATION_JSON_VALUE)
	public HaulierResponse deleteHaulier(@PathVariable("haulierId")int haulierId){
		HaulierResponse response=new HaulierResponse();
		if(service.deleteHaulier(haulierId)) {
		response.setStatusCode(201);
		response.setMessage("Success");
		response.setDescription("Haulier Details Deleted");
		}
		return response;
	}
	
	@GetMapping(path = "/view-allhaulier", produces = MediaType.APPLICATION_JSON_VALUE)
	public HaulierResponse getAllHaulier() {
		HaulierResponse response = new HaulierResponse();
		List<HaulierBean> list = service.getAllHaulier();
		if (list.size() != 0) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Haulier found");
			response.setBean(list);
		} else {
			response.setStatusCode(401);
			response.setMessage("Exception");
			response.setDescription("No data Found");
		}
		return response;
	}
}
