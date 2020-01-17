package com.capgemini.fms_springboot.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.fms_springboot.dao.ContractDao;
import com.capgemini.fms_springboot.dto.ContractBean;

@Service
public class ContractServicesImpl implements ContractServices {
	
	@Autowired
	private ContractDao dao;
	
	public boolean addContractor(ContractBean bean) {
		return dao.addContractor(bean);
	}

	public boolean deleteContractor(int contractNo) {
		return dao.deleteContractor(contractNo);
	}

	public List<ContractBean> getAllContractor() {
		return dao.getAllContractor();
	}
}
