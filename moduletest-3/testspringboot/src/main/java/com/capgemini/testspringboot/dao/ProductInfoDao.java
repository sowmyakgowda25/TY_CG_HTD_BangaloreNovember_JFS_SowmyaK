package com.capgemini.testspringboot.dao;


import com.capgemini.testspringboot.dto.ProductInfo;

public interface ProductInfoDao {
	
	public boolean addProduct(ProductInfo product);
	
	public ProductInfo searchProduct(int id);
		
}
