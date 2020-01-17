package com.capgemini.fms_collection.dao;

import java.util.List;

import com.capgemini.fms_collection.bean.ProductBean;
import com.capgemini.fms_collection.exception.FmsException;

public interface ProductDao {
	public boolean addProduct(ProductBean bean) throws FmsException;
	public boolean modifyProduct(int pId ,String pName) throws FmsException;
	public boolean deleteProduct(int pId) throws FmsException;
	public List<ProductBean> getAllProduct(ProductBean bean);
}
