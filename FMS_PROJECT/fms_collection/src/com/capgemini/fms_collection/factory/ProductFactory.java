package com.capgemini.fms_collection.factory;

import com.capgemini.fms_collection.dao.ProductDao;
import com.capgemini.fms_collection.dao.ProductDaoImpl;
import com.capgemini.fms_collection.service.ProductServices;
import com.capgemini.fms_collection.service.ProductServicesImpl;

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
