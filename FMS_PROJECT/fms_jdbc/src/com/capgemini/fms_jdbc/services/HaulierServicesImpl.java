package com.capgemini.fms_jdbc.services;

import java.util.List;

import com.capgemini.fms_jdbc.bean.HaulierBean;
import com.capgemini.fms_jdbc.dao.HaulierDao;
import com.capgemini.fms_jdbc.exception.FmsException;
import com.capgemini.fms_jdbc.factory.HaulierFactory;

public class HaulierServicesImpl implements HaulierServices{
	HaulierDao dao = HaulierFactory.instanceOfHaulierDAOImpl();

	@Override
	public boolean addHaulier(HaulierBean bean) throws FmsException {
		return dao.addHaulier(bean);
	}


	@Override
	public boolean deleteHaulier(int haulierId) throws FmsException{
		return dao.deleteHaulier(haulierId);
	}

	@Override
	public List<HaulierBean> getAllHaulier() {
		return dao.getAllHaulier();
	}


	@Override
	public boolean modifyHaulierName(int haulierId, String haulierName) throws FmsException{
		return dao.modifyHaulierName(haulierId, haulierName);
	}


	@Override
	public boolean modifyHaulierAddress(int haulierId, String streetAddress) throws FmsException{
		return dao.modifyHaulierAddress(haulierId, streetAddress);
	}


	@Override
	public boolean modifyHaulierPostalCode(int haulierId, int postalCode) throws FmsException{
		return dao.modifyHaulierPostalCode(haulierId, postalCode);
	}


	@Override
	public boolean modifyHaulierTown(int haulierId, String town) throws FmsException{
		return dao.modifyHaulierTown(haulierId, town);
	}


	@Override
	public boolean modifyHaulierEmail(int haulierId, String email) throws FmsException{
		return dao.modifyHaulierEmail(haulierId, email);
	}


	@Override
	public boolean modifyHaulierTelePhoneNum(int haulierId, long number) throws FmsException{
		return dao.modifyHaulierTelePhoneNum(haulierId, number);
	}

}
