package com.capgemini.fms_collection.bean;

import java.io.Serializable;

@SuppressWarnings("serial")
public class ProductBean implements Serializable {
	
	private int productId;
	private String productName;
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	@Override
	public String toString() {
		return "ProductBean [productId=" + productId + ", productName=" + productName + "]";
	}


}
