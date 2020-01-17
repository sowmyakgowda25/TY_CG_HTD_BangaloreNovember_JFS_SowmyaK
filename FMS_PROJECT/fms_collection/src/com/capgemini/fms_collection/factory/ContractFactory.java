package com.capgemini.fms_collection.factory;

import com.capgemini.fms_collection.dao.ContractDao;
import com.capgemini.fms_collection.dao.ContractDaoImpl;
import com.capgemini.fms_collection.service.ContractServices;
import com.capgemini.fms_collection.service.ContractServicesImpl;

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
