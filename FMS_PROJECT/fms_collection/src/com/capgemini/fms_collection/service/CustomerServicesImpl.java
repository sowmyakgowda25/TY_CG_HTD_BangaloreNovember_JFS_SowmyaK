package com.capgemini.fms_collection.service;

import java.util.List;

import com.capgemini.fms_collection.bean.CustomerBean;
import com.capgemini.fms_collection.dao.CustomerDao;
import com.capgemini.fms_collection.exception.FmsException;
import com.capgemini.fms_collection.factory.CustomerFactory;

public class CustomerServicesImpl implements CustomerServices {
	CustomerDao dao = CustomerFactory.instanceOfCustomerDAOImpl();

	@Override
	public boolean addCustomer(CustomerBean bean) throws FmsException {
		return dao.addCustomer(bean);
	}

	@Override
	public boolean deleteCustomer(int custId) throws FmsException {
		return dao.deleteCustomer(custId);
	}

	@Override
	public List<CustomerBean> getAllCustomers() {
		return dao.getAllCustomers();
	}

	@Override
	public boolean modifyCustomerName(int custId, String custName) throws FmsException {
		return dao.modifyCustomerName(custId, custName);
	}

	@Override
	public boolean modifyCustomerAddress1(int custId, String streetAddress1) throws FmsException {
		return dao.modifyCustomerAddress1(custId, streetAddress1);
	}

	@Override
	public boolean modifyCustomerAddress2(int custId, String streetAddress2) throws FmsException {
		return dao.modifyCustomerAddress2(custId, streetAddress2);
	}

	@Override
	public boolean modifyCustomerTown(int custId, String town) throws FmsException {
		return dao.modifyCustomerTown(custId, town);
	}

	@Override
	public boolean modifyCustomerEmail(int custId, String email) throws FmsException {
		return dao.modifyCustomerEmail(custId, email);
	}

	@Override
	public boolean modifyCustomerPostalCode(int custId, int postalCode) throws FmsException {
		return dao.modifyCustomerPostalCode(custId, postalCode);
	}

	@Override
	public boolean modifyCustomerTelePhoneNum(int custId, long number) throws FmsException {
		return dao.modifyCustomerTelePhoneNum(custId, number);
	}

}
