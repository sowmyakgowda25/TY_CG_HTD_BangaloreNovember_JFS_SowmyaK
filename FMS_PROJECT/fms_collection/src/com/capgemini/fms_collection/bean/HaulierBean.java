package com.capgemini.fms_collection.bean;

import java.io.Serializable;

@SuppressWarnings("serial")
public class HaulierBean implements Serializable {
	
	private int haulierId;
	private String haulierName;
	private String streetAddress;
	private int postalCode;
	private String town;
	private String email;
	private long telephoneNumber;
	
	
	public int getHaulierId() {
		return haulierId;
	}
	public void setHaulierId(int haulierId) {
		this.haulierId = haulierId;
	}
	public String getHaulierName() {
		return haulierName;
	}
	public void setHaulierName(String haulierName) {
		this.haulierName = haulierName;
	}
	public String getStreetAddress() {
		return streetAddress;
	}
	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}
	public int getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(int postalCode) {
		this.postalCode = postalCode;
	}
	public String getTown() {
		return town;
	}
	public void setTown(String town) {
		this.town = town;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getTelephoneNumber() {
		return telephoneNumber;
	}
	public void setTelephoneNumber(long telephoneNumber) {
		this.telephoneNumber = telephoneNumber;
	}
	@Override
	public String toString() {
		return "HaulierBean [haulierId=" + haulierId + ", haulierName=" + haulierName + ", streetAddress=" + streetAddress
				+ ", postalCode=" + postalCode + ", town=" + town + ", email=" + email
				+ ", telephoneNumber=" + telephoneNumber + "]";
	}	
}
