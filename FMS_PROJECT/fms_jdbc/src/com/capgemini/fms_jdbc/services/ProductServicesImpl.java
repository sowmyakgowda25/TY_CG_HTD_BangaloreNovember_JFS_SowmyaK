package com.capgemini.fms_jdbc.services;

import java.util.List;

import com.capgemini.fms_jdbc.bean.ProductBean;
import com.capgemini.fms_jdbc.dao.ProductDao;
import com.capgemini.fms_jdbc.exception.FmsException;
import com.capgemini.fms_jdbc.factory.ProductFactory;

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

	@Override
	public List<ProductBean> getAllProduct() {
		return dao.getAllProduct();
	}

	@Override
	public boolean modifyProduct(ProductBean bean) {
		return dao.modifyProduct(bean);
	}

	

}
