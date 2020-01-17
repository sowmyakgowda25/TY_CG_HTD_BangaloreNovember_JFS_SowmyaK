package com.capgemini.fms_springboot.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.fms_springboot.dao.HaulierDao;
import com.capgemini.fms_springboot.dto.HaulierBean;

@Service
public class HaulierServicesImpl implements HaulierServices{
	
	@Autowired
	private HaulierDao dao;

	public boolean addHaulier(HaulierBean bean) {
		return dao.addHaulier(bean);
	}

	public boolean deleteHaulier(int haulierId) {
		return dao.deleteHaulier(haulierId);
	}

	public List<HaulierBean> getAllHaulier()  {
		return dao.getAllHaulier();
	}

	public boolean modifyHaulierName(int haulierId, String haulierName){
		return dao.modifyHaulierName(haulierId, haulierName);
	}

	public boolean modifyHaulierAddress(int haulierId, String streetAddress) {
		return dao.modifyHaulierAddress(haulierId, streetAddress);
	}

	public boolean modifyHaulierPostalCode(int haulierId, int postalCode) {
		return dao.modifyHaulierPostalCode(haulierId, postalCode);
	}

	public boolean modifyHaulierTown(int haulierId, String town){
		return dao.modifyHaulierTown(haulierId, town);
	}

	public boolean modifyHaulierEmail(int haulierId, String email){
		return dao.modifyHaulierEmail(haulierId, email);
	}

	public boolean modifyHaulierTelePhoneNum(int haulierId, long number){
		return dao.modifyHaulierTelePhoneNum(haulierId, number);
	}

}
