package com.capgemini.shopping.services;

import java.util.List;

import com.capgemini.shopping.dao.ShoppingDAO;
import com.capgemini.shopping.factory.ShoppingAppFactory;
import com.capgemini.shopping.productbean.ShoppingApp;

public class ShoppingServicesImpl implements ShoppingServices{
	ShoppingDAO dao1 = ShoppingAppFactory.instanceOfShoppingDAOImpl() ;
	@Override
	public boolean buyTheProduct(int cardNumber, int cvv) {
		
		return dao1.buyTheProduct(cardNumber, cvv);
	}


	@Override
	public List<ShoppingApp> searchAngain(String productName) {
		return dao1.searchAngain(productName);
	}

}
