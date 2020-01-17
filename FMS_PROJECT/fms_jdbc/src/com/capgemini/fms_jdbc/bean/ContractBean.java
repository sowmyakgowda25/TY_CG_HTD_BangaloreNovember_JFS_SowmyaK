package com.capgemini.fms_jdbc.bean;

import java.io.Serializable;

@SuppressWarnings("serial")
public class ContractBean implements Serializable{
	
	private int contractorNum;
	private int customerId;
	private int productId;
	private int haulierId;
	private String deliveryDate;
	private String deliveryDay;
	private int quantity;
	
	public int getContractorNum() {
		return contractorNum;
	}
	public void setContractorNum(int contractorNum) {
		this.contractorNum = contractorNum;
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
		return "ContractorBean [contractorNum=" + contractorNum + ", customerId=" + customerId + ", productId="
				+ productId + ", haulierId=" + haulierId + ", deliveryDate=" + deliveryDate + ", deliveryDay="
				+ deliveryDay + ", quantity=" + quantity + "]";
	}
	
	
}
