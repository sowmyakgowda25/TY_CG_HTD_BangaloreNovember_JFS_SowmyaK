package com.capgemini.fms_jpahibernate.service;

import java.util.List;

import com.capgemini.fms_jpahibernate.dao.CustomerDao;
import com.capgemini.fms_jpahibernate.dto.CustomerBean;
import com.capgemini.fms_jpahibernate.exception.FmsException;
import com.capgemini.fms_jpahibernate.factory.CustomerFactory;

public class CustomerServicesImpl implements CustomerServices{

CustomerDao dao = CustomerFactory.instanceOfCustomerDAOImpl();
	
	public boolean addCustomer(CustomerBean bean) throws FmsException {
		return dao.addCustomer(bean);
	}

	public boolean deleteCustomer(int custId) throws FmsException {
		return dao.deleteCustomer(custId);
	}

	public List<CustomerBean> getAllCustomers(CustomerBean bean) {
		return dao.getAllCustomers(bean);
	}

	public boolean modifyCustomerName(int custId, String custName) throws FmsException {
		return dao.modifyCustomerName(custId,custName);
	}

	public boolean modifyCustomerAddress1(int custId, String streetAddress1) throws FmsException {
		return dao.modifyCustomerAddress1(custId,streetAddress1);
	}

	public boolean modifyCustomerAddress2(int custId, String streetAddress2) throws FmsException{
		return dao.modifyCustomerAddress2(custId,streetAddress2);
	}

	public boolean modifyCustomerTown(int custId, String town) throws FmsException{
		return dao.modifyCustomerTown(custId,town);
	}

	public boolean modifyCustomerEmail(int custId, String email) throws FmsException{
		return dao.modifyCustomerEmail(custId,email);
	}

	public boolean modifyCustomerPostalCode(int custId, int postalCode) throws FmsException{
		return dao.modifyCustomerPostalCode(custId,postalCode);
	}
	public boolean modifyCustomerTelePhoneNum(int custId, long number) throws FmsException{
		return dao.modifyCustomerTelePhoneNum(custId,number);
	}

	
}