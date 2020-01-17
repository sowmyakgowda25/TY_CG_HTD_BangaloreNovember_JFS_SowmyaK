package com.capgemini.fms_jpahibernate.service;

import java.util.List;

import com.capgemini.fms_jpahibernate.dao.ContractDao;
import com.capgemini.fms_jpahibernate.dto.ContractBean;
import com.capgemini.fms_jpahibernate.exception.FmsException;
import com.capgemini.fms_jpahibernate.factory.ContractFactory;

public class ContractServicesImpl implements ContractServices {
	ProductServices services = new ProductServicesImpl();
	
	ContractDao dao = ContractFactory.instanceOfContractorDAOImpl();
	
	public boolean addContractor(ContractBean bean) throws FmsException {
//		if(ProductServices.searchProduct(bean.getProductId()).getProductId() != 0) {
//			
//		}
		return dao.addContractor(bean);
	}

	public boolean deleteContractor(int contractNo) throws FmsException {
		return dao.deleteContractor(contractNo);
	}

	public List<ContractBean> getAllContractor(ContractBean bean) {
		return dao.getAllContractor(bean);
	}
	
	
}
