package com.capgemini.fms_collection.dao;

import java.util.List;

import com.capgemini.fms_collection.bean.CustomerBean;
import com.capgemini.fms_collection.exception.FmsException;

public interface CustomerDao {
	boolean addCustomer(CustomerBean bean) throws FmsException;

	boolean modifyCustomerName(int custId, String custName) throws FmsException;

	boolean modifyCustomerAddress1(int custId, String streetAddress1) throws FmsException;

	boolean modifyCustomerAddress2(int custId, String streetAddress2) throws FmsException;

	boolean modifyCustomerTown(int custId, String town) throws FmsException;

	boolean modifyCustomerEmail(int custId, String email) throws FmsException;

	boolean modifyCustomerPostalCode(int custId, int postalCode) throws FmsException;

	boolean modifyCustomerTelePhoneNum(int custId, long number) throws FmsException;

	boolean deleteCustomer(int custId) throws FmsException;

	public List<CustomerBean> getAllCustomers();
}
