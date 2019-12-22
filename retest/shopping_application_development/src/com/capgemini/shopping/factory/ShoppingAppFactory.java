package com.capgemini.shopping.factory;

import com.capgemini.shopping.dao.ShoppingAppDAO;
import com.capgemini.shopping.dao.ShoppingAppDAOImpl;
import com.capgemini.shopping.dao.ShoppingDAO;
import com.capgemini.shopping.dao.ShoppingDAOImpl;
import com.capgemini.shopping.services.ShoppingAppServices;
import com.capgemini.shopping.services.ShoppingAppServicesImpl;
import com.capgemini.shopping.services.ShoppingServices;
import com.capgemini.shopping.services.ShoppingServicesImpl;

public class ShoppingAppFactory {
	public static ShoppingAppDAO instanceOfShoppingAppDAOImpl() {
		ShoppingAppDAO dao =new ShoppingAppDAOImpl();
		return dao;
	}
	public static ShoppingDAO instanceOfShoppingDAOImpl() {
		ShoppingDAO dao1 = new ShoppingDAOImpl();
		return dao1;
	}
	public static ShoppingAppServices instanceOfShoppingAppServices() {
		ShoppingAppServices services = new ShoppingAppServicesImpl();
		return services;
	}
	public static ShoppingServices instanceOfShoppingServices() {
		ShoppingServices service1= new ShoppingServicesImpl();
		return service1;
	}

}
