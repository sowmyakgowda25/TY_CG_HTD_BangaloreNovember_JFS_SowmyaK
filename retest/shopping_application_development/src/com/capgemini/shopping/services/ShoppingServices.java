package com.capgemini.shopping.services;

import java.util.List;

import com.capgemini.shopping.productbean.ShoppingApp;

public interface ShoppingServices {
	public boolean buyTheProduct(int cardNumber,int cvv);
	public List<ShoppingApp> searchAngain(String productName);
}
