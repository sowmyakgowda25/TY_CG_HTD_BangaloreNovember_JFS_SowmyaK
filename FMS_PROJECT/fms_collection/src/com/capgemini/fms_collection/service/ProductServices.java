package com.capgemini.fms_collection.service;

import java.util.List;

import com.capgemini.fms_collection.bean.ProductBean;
import com.capgemini.fms_collection.exception.FmsException;

public interface ProductServices {
	public boolean addProduct(ProductBean bean) throws FmsException;
	public boolean modifyProduct(int productId, String productName ) throws FmsException;
	public boolean deleteProduct(int productId) throws FmsException;
	public List<ProductBean> getAllProduct(ProductBean bean);
}
