package com.capgemini.fms_collection.service;

import java.util.List;

import com.capgemini.fms_collection.bean.ClientBean;
import com.capgemini.fms_collection.dao.ClientDao;
import com.capgemini.fms_collection.exception.FmsException;
import com.capgemini.fms_collection.factory.ClientFactory;

public class ClientServicesImpl implements ClientServices{
	ClientDao dao = ClientFactory.instanceOfClientDAOImpl();
	@Override
	public boolean clientLogin(String name, String password) throws FmsException {
		return dao.clientLogin(name, password);
	}

	@Override
	public boolean addClient(ClientBean bean) throws FmsException {
		return dao.addClient(bean);
	}

	@Override
	public boolean deleteClient(int id) throws FmsException {
		return dao.deleteClient(id);
	}

	@Override
	public List<ClientBean> getAllClient(ClientBean bean) {
		return dao.getAllClient(bean);
	}

}