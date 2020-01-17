package com.capgemini.fms_jpahibernate.service;

import java.util.List;

import com.capgemini.fms_jpahibernate.dao.LandDao;
import com.capgemini.fms_jpahibernate.dto.LandBean;
import com.capgemini.fms_jpahibernate.exception.FmsException;
import com.capgemini.fms_jpahibernate.factory.LandFactory;

public class LandServicesImpl implements LandServices{
	LandDao dao = LandFactory.instanceOfLandDAOImpl();
	
	public boolean addLand(LandBean bean) throws FmsException {
		return dao.addLand(bean);
	}

	public boolean deleteLand(int landId) throws FmsException{
		return dao.deleteLand(landId);
	}

	public List<LandBean> getAllLand(LandBean bean) {
		return dao.getAllLand(bean);
	}

	public boolean modifyLandLoc(int landId, String landLocation) throws FmsException {
		return dao.modifyLandLoc(landId, landLocation);
	}

	public boolean modifyLandAcre(int landId, double landAcre) throws FmsException {
		return dao.modifyLandAcre(landId, landAcre);
	}
}
