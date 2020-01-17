package com.capgemini.fms_collection.factory;

import com.capgemini.fms_collection.dao.ClientDao;
import com.capgemini.fms_collection.dao.ClientDaoImpl;
import com.capgemini.fms_collection.service.ClientServices;
import com.capgemini.fms_collection.service.ClientServicesImpl;

public class ClientFactory {
	public static ClientServices instanceOfClientServices() {
		ClientServices services = new ClientServicesImpl();
		return services;
	}
	public static ClientDao instanceOfClientDAOImpl() {
		ClientDao dao = new ClientDaoImpl();
		return dao;
	}
	public static ClientDao getClientDAO() {
		return null;
	}

}
