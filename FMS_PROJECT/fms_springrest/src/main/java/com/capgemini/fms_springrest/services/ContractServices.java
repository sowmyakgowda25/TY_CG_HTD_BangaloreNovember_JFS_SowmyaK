package com.capgemini.fms_springrest.services;


import java.util.List;

import com.capgemini.fms_springrest.dto.ContractBean;

public interface ContractServices {
	
	boolean addContractor(ContractBean bean);
	boolean deleteContractor(int contractNo);
	public List<ContractBean> getAllContractor();
}
