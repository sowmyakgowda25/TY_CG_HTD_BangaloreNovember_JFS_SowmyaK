package com.capgemini.fms_jdbc.dao;

import java.util.List;

import com.capgemini.fms_jdbc.bean.ContractBean;
import com.capgemini.fms_jdbc.exception.FmsException;

public interface ContractDao {
	
	boolean addContractor(ContractBean bean) throws FmsException;
	boolean deleteContractor(int contractNo) throws FmsException;
	public List<ContractBean> getAllContractor();
}
