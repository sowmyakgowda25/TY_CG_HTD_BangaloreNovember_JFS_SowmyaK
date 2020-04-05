package com.capgemini.fms_jpahibernate.factory;

import com.capgemini.fms_jpahibernate.dao.ContractDao;
import com.capgemini.fms_jpahibernate.dao.ContractDaoImpl;
import com.capgemini.fms_jpahibernate.service.ContractServices;
import com.capgemini.fms_jpahibernate.service.ContractServicesImpl;

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