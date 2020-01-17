package com.capgemini.fms_springboot.services;


import java.util.List;

import com.capgemini.fms_springboot.dto.ContractBean;

public interface ContractServices {
	
	boolean addContractor(ContractBean bean);
	boolean deleteContractor(int contractNo);
	public List<ContractBean> getAllContractor();
}
