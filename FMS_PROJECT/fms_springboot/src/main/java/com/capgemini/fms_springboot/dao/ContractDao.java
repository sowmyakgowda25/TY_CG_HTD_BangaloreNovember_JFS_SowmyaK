package com.capgemini.fms_springboot.dao;

import java.util.List;

import com.capgemini.fms_springboot.dto.ContractBean;

public interface ContractDao {
	boolean addContractor(ContractBean bean);
	boolean deleteContractor(int contractNo);
	public List<ContractBean> getAllContractor();
}
