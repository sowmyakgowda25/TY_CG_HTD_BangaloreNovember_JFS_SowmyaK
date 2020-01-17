package com.capgemini.fms_jdbc.services;

import java.util.List;

import com.capgemini.fms_jdbc.bean.ProductBean;
import com.capgemini.fms_jdbc.exception.FmsException;

public interface ProductServices {
	public boolean addProduct(ProductBean bean) throws FmsException;
	public boolean modifyProduct(ProductBean bean);
	public boolean deleteProduct(int productId) throws FmsException;
	public List<ProductBean> getAllProduct();
}
