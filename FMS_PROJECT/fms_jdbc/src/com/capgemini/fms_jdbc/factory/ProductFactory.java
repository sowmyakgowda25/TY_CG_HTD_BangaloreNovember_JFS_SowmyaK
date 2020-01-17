package com.capgemini.fms_jdbc.factory;

import com.capgemini.fms_jdbc.dao.ProductDao;
import com.capgemini.fms_jdbc.dao.ProductDaoImpl;
import com.capgemini.fms_jdbc.services.ProductServices;
import com.capgemini.fms_jdbc.services.ProductServicesImpl;

public class ProductFactory {
	
	public static ProductServices instanceOfProductServices() {
		ProductServices services = new ProductServicesImpl();
		return services;
	}
	public static ProductDao instanceOfProductDAOImpl() {
		ProductDao dao = new ProductDaoImpl();
		return dao;
	}
	public static ProductDao getProductDAO() {
		return null;
	}
}
