package com.capgemini.fms_jdbc.services;

import java.util.List;

import com.capgemini.fms_jdbc.bean.LandBean;
import com.capgemini.fms_jdbc.dao.LandDao;
import com.capgemini.fms_jdbc.exception.FmsException;
import com.capgemini.fms_jdbc.factory.LandFactory;

public class LandServicesImpl implements LandServices{
	LandDao dao = LandFactory.instanceOfLandDAOImpl();

	@Override
	public boolean addLand(LandBean bean) throws FmsException{
		return dao.addLand(bean);
	}

	@Override
	public boolean deleteLand(int landId) throws FmsException{
		return dao.deleteLand(landId);
	}

	@Override
	public List<LandBean> getAllLand(LandBean bean) {
		return dao. getAllLand(bean);
	}

	@Override
	public boolean modifyLandLoc(int landId, String landLocation) throws FmsException{
		return dao.modifyLandLoc(landId,landLocation);
	}

	@Override
	public boolean modifyLandAcre(int landId, double landAcre) throws FmsException{
		return dao.modifyLandAcre(landId, landAcre);
	}

}
