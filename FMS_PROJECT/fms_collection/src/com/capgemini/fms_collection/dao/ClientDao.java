package com.capgemini.fms_collection.dao;

import java.util.List;

import com.capgemini.fms_collection.bean.ClientBean;
import com.capgemini.fms_collection.exception.FmsException;

public interface ClientDao {
	
	boolean clientLogin(String name, String password) throws FmsException;
	boolean addClient(ClientBean bean) throws FmsException;
	boolean deleteClient(int id) throws FmsException;
	public List<ClientBean> getAllClient(ClientBean bean);
}