package com.capgemini.shopping.services;

import java.util.List;

import com.capgemini.shopping.productbean.ShoppingApp;

public interface ShoppingAppServices {
	
	public List<ShoppingApp> showAllItems();
	public List<ShoppingApp> searchAnItem(String productName);
}
