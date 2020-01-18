package com.capgemini.shopping.services;

import java.util.List;

import com.capgemini.shopping.dao.ShoppingAppDAO;
import com.capgemini.shopping.dao.ShoppingAppDAOImpl;
import com.capgemini.shopping.factory.ShoppingAppFactory;
import com.capgemini.shopping.productbean.ShoppingApp;

public class ShoppingAppServicesImpl implements ShoppingAppServices{
	ShoppingAppDAO dao = ShoppingAppFactory.instanceOfShoppingAppDAOImpl() ;
		
	@Override
	public List<ShoppingApp> showAllItems() {
		return dao.showAllItems();
	}

	@Override
	public List<ShoppingApp> searchAnItem(String productName) {
		return dao.searchAnItem(productName);
	}

}
