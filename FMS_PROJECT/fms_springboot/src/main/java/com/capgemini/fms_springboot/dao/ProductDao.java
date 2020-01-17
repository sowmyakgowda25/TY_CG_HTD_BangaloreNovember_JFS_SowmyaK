package com.capgemini.fms_springboot.dao;

import java.util.List;

import com.capgemini.fms_springboot.dto.ProductBean;

public interface ProductDao {
	public boolean addProduct(ProductBean bean) ;
	public boolean modifyProduct(int productId , String productName) ;
	public boolean deleteProduct(int productId);
	public List<ProductBean> getAllProduct();
}
