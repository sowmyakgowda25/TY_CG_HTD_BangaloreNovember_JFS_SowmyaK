package com.capgemini.testspringboot.services;

import com.capgemini.testspringboot.dto.ProductInfo;

public interface ProductInfoServices {

	public boolean addProduct(ProductInfo product);

	public ProductInfo searchProduct(int id);
}