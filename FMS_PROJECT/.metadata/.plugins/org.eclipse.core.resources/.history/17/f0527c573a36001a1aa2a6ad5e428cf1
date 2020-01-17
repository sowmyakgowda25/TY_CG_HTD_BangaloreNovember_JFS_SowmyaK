package com.capgemini.fms_springrest.services;

import java.util.List;

import com.capgemini.fms_springrest.dto.CustomerBean;

public interface CustomerServices {
	boolean addCustomer(CustomerBean bean);
	boolean modifyCustomerName(int custId,String custName);
	boolean modifyCustomerAddress1(int custId,String streetAddress1);
	boolean modifyCustomerAddress2(int custId,String streetAddress2);
	boolean modifyCustomerTown(int custId,String town);
	boolean modifyCustomerEmail(int custId,String email);
	boolean modifyCustomerPostalCode(int custId,int postalCode);
	boolean modifyCustomerTelePhoneNum(int custId,long number);
	boolean deleteCustomer(int custId);
	public List<CustomerBean> getAllCustomer();
}
