package com.capgemini.fms_springboot.dao;

import java.util.List;

import com.capgemini.fms_springboot.dto.HaulierBean;

public interface HaulierDao {
	
	public boolean addHaulier(HaulierBean bean);
	boolean modifyHaulierName(int haulierId,String haulierName);
	boolean modifyHaulierAddress(int haulierId,String streetAddress);
	boolean modifyHaulierPostalCode(int haulierId,int postalCode);
	boolean modifyHaulierTown(int haulierId,String town);
	boolean modifyHaulierEmail(int haulierId,String email);
	boolean modifyHaulierTelePhoneNum(int haulierId,long number) ;
	public boolean deleteHaulier(int haulierId);
	public List<HaulierBean> getAllHaulier();
}
