package com.capgemini.testspringboot.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.capgemini.testspringboot.dao.ProductInfoDao;
import com.capgemini.testspringboot.dto.ProductInfo;

@Service
public class ProductInfoServicesImpl implements ProductInfoServices {
	
	@Autowired
	private ProductInfoDao dao;
	
	@Override
	public boolean addProduct(ProductInfo product) {
		return dao.addProduct(product);
	}

	@Override
	public ProductInfo searchProduct(int id) {
		return dao.searchProduct(id);
	}


}
