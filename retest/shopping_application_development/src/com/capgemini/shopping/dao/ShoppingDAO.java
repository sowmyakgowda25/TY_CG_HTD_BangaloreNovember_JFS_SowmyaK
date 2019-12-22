package com.capgemini.shopping.dao;

import java.util.List;

import com.capgemini.shopping.productbean.ShoppingApp;


public interface ShoppingDAO {
	public boolean buyTheProduct(int cardnumber,int cvv);
	public List<ShoppingApp> searchAngain(String productName);
}
