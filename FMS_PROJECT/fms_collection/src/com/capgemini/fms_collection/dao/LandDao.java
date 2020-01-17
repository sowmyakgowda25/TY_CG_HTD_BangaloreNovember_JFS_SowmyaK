package com.capgemini.fms_collection.dao;

import java.util.List;

import com.capgemini.fms_collection.bean.LandBean;
import com.capgemini.fms_collection.exception.FmsException;

public interface LandDao {

	public boolean addLand(LandBean bean) throws FmsException;

	public boolean deleteLand(int landId) throws FmsException;

	public List<LandBean> getAllLand(LandBean bean);

	public boolean modifyLandLoc(int landId, String landLocation) throws FmsException;

	public boolean modifyLandAcre(int landId, double landAcre) throws FmsException;
}
