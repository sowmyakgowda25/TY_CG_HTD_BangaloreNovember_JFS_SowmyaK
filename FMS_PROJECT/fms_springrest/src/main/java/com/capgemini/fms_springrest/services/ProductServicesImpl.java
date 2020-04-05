package com.capgemini.fms_springrest.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.fms_springrest.dao.ProductDao;
import com.capgemini.fms_springrest.dto.ProductBean;
import com.capgemini.fms_springrest.exception.ProductException;
import com.capgemini.fms_springrest.validations.Validations;

@Service
public class ProductServicesImpl implements ProductServices {

	@Autowired
	private ProductDao dao;
	@SuppressWarnings("unused")
	private ProductBean bean;

	public boolean addProduct(ProductBean bean) {
		String pId = Integer.toString(bean.getProductId());
		if (Validations.isValidId(pId)) {
			if (Validations.isValidName(bean.getProductName())) {
				return dao.addProduct(bean);
			} else {
				throw new ProductException("Enter alphabets only");
			}
		} else {
			throw new ProductException("Enter digits only");
		}
	}

	public boolean modifyProduct(int productId, String productName) {
		String pId = Integer.toString(productId);
		if (Validations.isValidId(pId)) {
			if (Validations.isValidName(productName)) {
				return dao.modifyProduct(productId, productName);
			} else {
				throw new ProductException("Enter alphabets only");
			}
		} else {
			throw new ProductException("Enter digits only");
		}

	}

	public boolean deleteProduct(int productId) {
		String pId = Integer.toString(productId);
		if (Validations.isValidId(pId)) {
			return dao.deleteProduct(productId);
		} else {
			throw new ProductException("Enter digits only");
		}
	}

	@Override
	public List<ProductBean> getAllProduct() {
		return dao.getAllProduct();
	}

}