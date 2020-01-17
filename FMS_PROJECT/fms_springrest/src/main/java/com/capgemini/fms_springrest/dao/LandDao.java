package com.capgemini.fms_springrest.dao;

import java.util.List;

import com.capgemini.fms_springrest.dto.LandBean;

public interface LandDao {
	
	public boolean addLand(LandBean bean);
	public boolean modifyLandLoc(int landId , String landLocation);
	public boolean modifyLandAcre(int landId , double landAcre);
	public boolean deleteLand(int landId);
	public List<LandBean> getAllLand(LandBean bean);
}
