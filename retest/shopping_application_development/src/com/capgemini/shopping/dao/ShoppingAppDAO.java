package com.capgemini.shopping.dao;

import java.util.List;

import com.capgemini.shopping.productbean.ShoppingApp;

public interface ShoppingAppDAO {
	public List<ShoppingApp> showAllItems();
	public List<ShoppingApp> searchAnItem(String productName);
}
