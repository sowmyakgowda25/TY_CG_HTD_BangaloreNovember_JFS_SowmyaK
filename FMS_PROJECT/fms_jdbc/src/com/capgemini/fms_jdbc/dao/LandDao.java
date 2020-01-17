package com.capgemini.fms_jdbc.dao;

import java.util.List;

import com.capgemini.fms_jdbc.bean.LandBean;
import com.capgemini.fms_jdbc.exception.FmsException;

public interface LandDao {
	
	public boolean addLand(LandBean bean) throws FmsException;
	public boolean modifyLandLoc(int landId , String landLocation) throws FmsException;
	public boolean modifyLandAcre(int landId , double landAcre) throws FmsException;
	public boolean deleteLand(int landId) throws FmsException;
	public List<LandBean> getAllLand(LandBean bean);
}
