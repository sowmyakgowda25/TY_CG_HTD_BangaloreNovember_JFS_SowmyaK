package com.capgemini.fms_springrest.dao;

import java.util.List;

import com.capgemini.fms_springrest.dto.ContractBean;

public interface ContractDao {
	boolean addContractor(ContractBean bean);
	boolean deleteContractor(int contractNo);
	public List<ContractBean> getAllContractor();
}
