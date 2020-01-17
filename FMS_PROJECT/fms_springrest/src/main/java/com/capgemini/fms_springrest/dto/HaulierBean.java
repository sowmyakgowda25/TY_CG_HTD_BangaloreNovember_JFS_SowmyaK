package com.capgemini.fms_springrest.dto;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Haulier")
public class HaulierBean {
	
	@Id
	@Column(unique=true,nullable=false)
	private int haulierId;
	@Column
	private String haulierName;
	@Column
	private String streetAddress;
	@Column
	private int postalCode;
	@Column
	private String town;
	@Column
	private String email;
	@Column
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
		return "HaulierBean [haulierId=" + haulierId + ", haulierName=" + haulierName + ", streetAddress="
				+ streetAddress + ", postalCode=" + postalCode + ", town=" + town + ", email=" + email
				+ ", telephoneNumber=" + telephoneNumber + "]";
	}
	
}
