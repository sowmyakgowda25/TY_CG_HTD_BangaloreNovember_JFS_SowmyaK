package com.capgemini.fms_springboot.controller;

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

import com.capgemini.fms_springboot.dto.LandBean;
import com.capgemini.fms_springboot.dto.LandResponse;
import com.capgemini.fms_springboot.services.LandServices;

@RestController
public class Land {

	@Autowired
	private LandServices service;
	
	@PostMapping(path = "/add-land",produces = MediaType.APPLICATION_JSON_VALUE,
			consumes = MediaType.APPLICATION_JSON_VALUE)
	public LandResponse addLand(@RequestBody LandBean bean)  {
		LandResponse response = new LandResponse();
		
		if(service.addLand(bean)) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDiscription("Land added successfully");
		}
		else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDiscription("Land already exists");
		}
		return response;
	}
	
	@PutMapping(path = "/modify-landloc", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public LandResponse modifyLandLoc(@RequestBody LandBean land) {
		LandResponse response = new LandResponse();
		if (service.modifyLandLoc(land.getLandId(), land.getLandLocation())) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDiscription("Land location updated");
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDiscription("Land location not found");
		}
		return response;
	}	
	

	@PutMapping(path = "/modify-landAcre", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public LandResponse modifyLandAcre(@RequestBody LandBean land) {
		LandResponse response = new LandResponse();
		if (service.modifyLandAcre(land.getLandId(), land.getLandAcre())) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDiscription("Land acre updated");
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDiscription("Land acre not found");
		}
		return response;
	}
	
	@DeleteMapping(path = "/deleteLand/{LandId}",produces = MediaType.APPLICATION_JSON_VALUE)
	public LandResponse deleteLand(@PathVariable("landId")int landId){
		LandResponse response=new LandResponse();
		if(service.deleteLand(landId)) {
		response.setStatusCode(201);
		response.setMessage("Success");
		response.setDiscription("land Details Deleted");
		}
		return response;
	}
	
	@GetMapping(path = "/view-allland", produces = MediaType.APPLICATION_JSON_VALUE)
	public LandResponse getAllLand() {
		LandResponse response = new LandResponse();
		List<LandBean> list = service.getAllLand();
		if (list.size() != 0) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDiscription("land found");
			response.setBean(list);
		} else {
			response.setStatusCode(401);
			response.setMessage("Exception");
			response.setDiscription("No data Found");
		}
		return response;
	}
}
