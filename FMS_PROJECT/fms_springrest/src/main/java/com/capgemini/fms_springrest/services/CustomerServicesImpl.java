package com.capgemini.fms_springrest.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.fms_springrest.dao.CustomerDao;
import com.capgemini.fms_springrest.dto.CustomerBean;
import com.capgemini.fms_springrest.exception.CustomerException;
import com.capgemini.fms_springrest.validations.Validations;

@Service
public class CustomerServicesImpl implements CustomerServices {

	@Autowired
	private CustomerDao dao;

	public boolean addCustomer(CustomerBean bean) {
		String custId = Integer.toString(bean.getCustId());
		String postCode = Integer.toString(bean.getPostalCode());
		String phoneNum = Long.toString(bean.getTelephoneNumber());

		if (Validations.isValidId(custId)) {
			if (Validations.isValidName(bean.getCustName())) {
				if (Validations.isValidName(bean.getTown())) {
					if (Validations.isValidId(postCode)) {
						if (Validations.isValidEmail(bean.getEmail())) {
							if (Validations.isValidPhoneNo(phoneNum)) {
								return dao.addCustomer(bean);
							} else {
								throw new CustomerException("Enter 10 digits only");
							}
						} else {
							throw new CustomerException("Enter valid mail id");
						}
					} else {
						throw new CustomerException("Enter 6 digits postal code");
					}
				} else {
					throw new CustomerException("Enter alphabets only");
				}
			} else {
				throw new CustomerException("Enter alphabets only");
			}
		} else {
			throw new CustomerException("Enter digits only");
		}
	}

	public boolean deleteCustomer(int custId) {
		return dao.deleteCustomer(custId);
	}

	public List<CustomerBean> getAllCustomer() {
		return dao.getAllCustomer();
	}

	public boolean modifyCustomerName(int custId, String custName) {
		return dao.modifyCustomerName(custId, custName);
	}

	public boolean modifyCustomerAddress1(int custId, String streetAddress1) {
		return dao.modifyCustomerAddress1(custId, streetAddress1);
	}

	public boolean modifyCustomerAddress2(int custId, String streetAddress2) {
		return dao.modifyCustomerAddress2(custId, streetAddress2);
	}

	public boolean modifyCustomerTown(int custId, String town) {
		return dao.modifyCustomerTown(custId, town);
	}

	public boolean modifyCustomerEmail(int custId, String email) {
		return dao.modifyCustomerEmail(custId, email);
	}

	public boolean modifyCustomerPostalCode(int custId, int postalCode) {
		return dao.modifyCustomerPostalCode(custId, postalCode);
	}

	public boolean modifyCustomerTelePhoneNum(int custId, long number) {
		return dao.modifyCustomerTelePhoneNum(custId, number);
	}
}