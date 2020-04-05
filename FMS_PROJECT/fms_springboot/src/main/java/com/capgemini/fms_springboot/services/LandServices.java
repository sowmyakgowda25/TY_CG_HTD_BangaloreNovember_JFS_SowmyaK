package com.capgemini.fms_springboot.services;

import java.util.List;

import com.capgemini.fms_springboot.dto.LandBean;

public interface LandServices {
	public boolean addLand(LandBean bean) ;
	public boolean modifyLandLoc(int landId , String landLocation) ;
	public boolean modifyLandAcre(int landId , double landAcre);
	public boolean deleteLand(int landId);
	public List<LandBean> getAllLand();
}