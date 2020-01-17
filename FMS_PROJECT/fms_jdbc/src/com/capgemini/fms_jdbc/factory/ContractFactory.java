package com.capgemini.fms_jdbc.factory;

import com.capgemini.fms_jdbc.dao.ContractDao;
import com.capgemini.fms_jdbc.dao.ContractDaoImpl;
import com.capgemini.fms_jdbc.services.ContractServices;
import com.capgemini.fms_jdbc.services.ContractServicesImpl;

public class ContractFactory {	
	public static ContractServices instanceOfContractorServices() {
		ContractServices services = new ContractServicesImpl();
		return services;
	}
	public static ContractDao instanceOfContractorDAOImpl() {
		ContractDao dao = new ContractDaoImpl();
		return dao;
	}
	public static ContractDao getContractorDAO() {
		return null;
	}

}
