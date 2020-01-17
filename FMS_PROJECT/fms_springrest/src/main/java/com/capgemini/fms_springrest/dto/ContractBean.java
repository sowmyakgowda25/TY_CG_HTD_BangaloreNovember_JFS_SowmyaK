package com.capgemini.fms_springrest.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "Contract")
public class ContractBean {

	@Id
	@Column(unique = true, nullable = false)
	private int contractorNum;
	@Column
	@JoinColumn(name = "FK_customerId")
	private int customerId;
	@Column
	@JoinColumn(name = "FK_productId")
	private int productId;
	@Column
	@JoinColumn(name = "FK_haulierId")
	private int haulierId;
	@Column
	private String deliveryDate;
	@Column
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

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "ContractBean [contractorNum=" + contractorNum + ", customerId=" + customerId + ", productId="
				+ productId + ", haulierId=" + haulierId + ", deliveryDate=" + deliveryDate + ", quantity=" + quantity
				+ "]";
	}
}
