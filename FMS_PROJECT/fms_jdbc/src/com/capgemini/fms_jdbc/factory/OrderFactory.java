package com.capgemini.fms_jdbc.factory;

import com.capgemini.fms_jdbc.dao.OrderDao;
import com.capgemini.fms_jdbc.dao.OrderDaoImpl;
import com.capgemini.fms_jdbc.services.OrderServices;
import com.capgemini.fms_jdbc.services.OrderServicesImpl;

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