package com.capgemini.fms_jpahibernate.dao;

import java.util.List;

import com.capgemini.fms_jpahibernate.dto.ContractBean;
import com.capgemini.fms_jpahibernate.exception.FmsException;

public interface ContractDao {

	boolean addContractor(ContractBean bean) throws FmsException;

	boolean deleteContractor(int contractNo) throws FmsException;

	public List<ContractBean> getAllContractor(ContractBean bean);
}
