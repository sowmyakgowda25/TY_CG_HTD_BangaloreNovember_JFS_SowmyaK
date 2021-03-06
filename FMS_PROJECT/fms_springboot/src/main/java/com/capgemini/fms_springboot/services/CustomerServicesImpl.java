package com.capgemini.fms_springboot.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.fms_springboot.dao.CustomerDao;
import com.capgemini.fms_springboot.dto.CustomerBean;

@Service
public class CustomerServicesImpl implements CustomerServices{
	
	@Autowired
	private CustomerDao dao;

	public boolean addCustomer(CustomerBean bean) {
		return dao.addCustomer(bean);
	}

	public boolean deleteCustomer(int custId){
		return dao.deleteCustomer(custId);
	}

	public List<CustomerBean> getAllCustomer() {
		return dao.getAllCustomer();
	}

	public boolean modifyCustomerName(int custId, String custName){
		return dao.modifyCustomerName(custId,custName);
	}

	public boolean modifyCustomerAddress1(int custId, String streetAddress1){
		return dao.modifyCustomerAddress1(custId,streetAddress1);
	}

	public boolean modifyCustomerAddress2(int custId, String streetAddress2) {
		return dao.modifyCustomerAddress2(custId,streetAddress2);
	}

	public boolean modifyCustomerTown(int custId, String town){
		return dao.modifyCustomerTown(custId,town);
	}

	public boolean modifyCustomerEmail(int custId, String email){
		return dao.modifyCustomerEmail(custId,email);
	}

	public boolean modifyCustomerPostalCode(int custId, int postalCode){
		return dao.modifyCustomerPostalCode(custId,postalCode);
	}
	public boolean modifyCustomerTelePhoneNum(int custId, long number){
		return dao.modifyCustomerTelePhoneNum(custId,number);
	}

	
}