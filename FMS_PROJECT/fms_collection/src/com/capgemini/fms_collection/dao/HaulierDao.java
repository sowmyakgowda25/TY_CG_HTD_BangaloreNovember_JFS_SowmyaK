package com.capgemini.fms_collection.dao;

import java.util.List;

import com.capgemini.fms_collection.bean.HaulierBean;
import com.capgemini.fms_collection.exception.FmsException;

public interface HaulierDao {
	public boolean addHaulier(HaulierBean bean) throws FmsException;

	boolean modifyHaulierName(int haulierId, String haulierName) throws FmsException;

	boolean modifyHaulierAddress(int haulierId, String streetAddress) throws FmsException;

	boolean modifyHaulierPostalCode(int haulierId, int postalCode) throws FmsException;

	boolean modifyHaulierTown(int haulierId, String town) throws FmsException;

	boolean modifyHaulierEmail(int haulierId, String email) throws FmsException;

	boolean modifyHaulierTelePhoneNum(int haulierId, long number) throws FmsException;

	public boolean deleteHaulier(int haulierId) throws FmsException;

	public List<HaulierBean> getAllHaulier();
}
