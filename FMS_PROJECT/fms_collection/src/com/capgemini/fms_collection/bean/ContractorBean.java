package com.capgemini.fms_collection.bean;

import java.io.Serializable;

@SuppressWarnings("serial")
public class ContractorBean implements Serializable{
	
	private int contractNo;
	private int customerId;
	private int productId;
	private int haulierId;
	private String deliveryDate;
	private String deliveryDay;
	private int quantity;
		
	public int getContractNo() {
		return contractNo;
	}

	public void setContractNo(int contractNo) {
		this.contractNo = contractNo;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public int getHaulierId() {
		return haulierId;
	}

	public void setHaulierId(int haulierId) {
		this.haulierId = haulierId;
	}

	public String getDeliveryDate() {
		return deliveryDate;
	}

	public void setDeliveryDate(String deliveryDate) {
		this.deliveryDate = deliveryDate;
	}

	public String getDeliveryDay() {
		return deliveryDay;
	}

	public void setDeliveryDay(String deliveryDay) {
		this.deliveryDay = deliveryDay;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "ContractorBean [contractNo=" + contractNo + ", customerId=" + customerId + ", productId=" + productId
				+ ", haulierId=" + haulierId + ", deliveryDate=" + deliveryDate + ", deliveryDay=" + deliveryDay
				+ ", quantity=" + quantity + "]";
	}
}
	