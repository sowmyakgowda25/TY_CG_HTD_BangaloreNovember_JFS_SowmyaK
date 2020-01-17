package com.capgemini.fms_jpahibernate.dao;

import java.util.List;

import com.capgemini.fms_jpahibernate.dto.ProductBean;
import com.capgemini.fms_jpahibernate.exception.FmsException;

public interface ProductDao {
	
	public boolean addProduct(ProductBean bean) throws FmsException;
	public boolean modifyProduct(int productId , String productName) throws FmsException;
	public boolean deleteProduct(int productId) throws FmsException;
	public List<ProductBean> getAllProduct(ProductBean bean);
}
