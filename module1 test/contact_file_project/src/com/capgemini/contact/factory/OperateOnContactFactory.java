package com.capgemini.contact.factory;

import com.capgemini.contactfile.dao.OperateOnContactDAO;
import com.capgemini.contactfile.dao.OperateOnContactDAOImpl;
import com.capgemini.contactfile.dao.OperateOnContactServices;
import com.capgemini.contactfile.dao.OperateOncontactServicesImpl;

public class OperateOnContactFactory {
	
	public static  OperateOnContactServices instanceOfOperateOnContactServices() {
		 OperateOnContactServices services = new OperateOncontactServicesImpl();
		return services;
	}
	
	public static  OperateOnContactDAO instanceOfOperateOnContactDAOImpl() {
		 OperateOnContactDAO dao = new  OperateOnContactDAOImpl();
		return dao;
	}
}
