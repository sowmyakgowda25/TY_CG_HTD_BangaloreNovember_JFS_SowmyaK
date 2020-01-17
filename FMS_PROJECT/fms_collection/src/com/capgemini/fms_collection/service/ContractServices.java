package com.capgemini.fms_collection.service;

import java.util.List;

import com.capgemini.fms_collection.bean.ContractorBean;
import com.capgemini.fms_collection.exception.FmsException;

public interface ContractServices {
	
	boolean addContractor(ContractorBean bean) throws FmsException;
	boolean deleteContractor(int contractNo) throws FmsException;
	public List<ContractorBean> getAllContractor(ContractorBean bean);
}
