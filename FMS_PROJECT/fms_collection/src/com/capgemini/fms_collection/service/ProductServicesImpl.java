package com.capgemini.fms_collection.service;

import java.util.List;

import com.capgemini.fms_collection.bean.ProductBean;
import com.capgemini.fms_collection.dao.ProductDao;
import com.capgemini.fms_collection.exception.FmsException;
import com.capgemini.fms_collection.factory.ProductFactory;

public class ProductServicesImpl implements ProductServices {
	
	ProductDao dao = ProductFactory.instanceOfProductDAOImpl();

	@Override
	public boolean addProduct(ProductBean bean) throws FmsException {
		return dao.addProduct(bean);
	}

	@Override
	public boolean deleteProduct(int productId) throws FmsException {
		return dao.deleteProduct(productId);
	}

	public List<ProductBean> getAllProduct(ProductBean bean) {
		return dao.getAllProduct(bean);
	}

	public boolean modifyProduct(int pId ,String pName) throws FmsException {
		return dao.modifyProduct(pId,pName);
	}
}
