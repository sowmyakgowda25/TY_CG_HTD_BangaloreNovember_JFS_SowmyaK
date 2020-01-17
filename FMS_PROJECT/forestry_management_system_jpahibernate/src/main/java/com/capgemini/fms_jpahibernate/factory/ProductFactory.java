package com.capgemini.fms_jpahibernate.factory;

import com.capgemini.fms_jpahibernate.dao.ProductDao;
import com.capgemini.fms_jpahibernate.dao.ProductDaoImpl;
import com.capgemini.fms_jpahibernate.service.ProductServices;
import com.capgemini.fms_jpahibernate.service.ProductServicesImpl;

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
