package com.capgemini.fms_collection.factory;

import com.capgemini.fms_collection.dao.OrderDao;
import com.capgemini.fms_collection.dao.OrderDaoImpl;
import com.capgemini.fms_collection.service.OrderServices;
import com.capgemini.fms_collection.service.OrderServicesImpl;

public class OrderFactory {
	public static OrderServices instanceOfOrderServices() {
		OrderServices services = new OrderServicesImpl();
		return services;
	}
	public static OrderDao instanceOfOrderDAOImpl() {
		OrderDao dao = new OrderDaoImpl();
		return dao;
	}
	public static OrderDao getOrderDAO() {
		return null;
	}
}
