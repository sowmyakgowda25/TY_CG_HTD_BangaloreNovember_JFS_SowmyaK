package com.capgemini.fms_jdbc.services;

import java.util.List;

import com.capgemini.fms_jdbc.bean.ContractBean;
import com.capgemini.fms_jdbc.dao.ContractDao;
import com.capgemini.fms_jdbc.exception.FmsException;
import com.capgemini.fms_jdbc.factory.ContractFactory;

public class ContractServicesImpl implements ContractServices {
	
	ContractDao dao = ContractFactory.instanceOfContractorDAOImpl();

	@Override
	public boolean addContractor(ContractBean bean) throws FmsException {
		return dao.addContractor(bean);
	}

	@Override
	public boolean deleteContractor(int contractNo) throws FmsException {
		return dao.deleteContractor(contractNo);
	}

	@Override
	public List<ContractBean> getAllContractor() {
		return dao.getAllContractor();
	}

}
