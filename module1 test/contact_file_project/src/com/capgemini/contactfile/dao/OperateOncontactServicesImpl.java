package com.capgemini.contactfile.dao;

import com.capgemini.contact.factory.OperateOnContactFactory;
import com.capgemini.contactfile.bean.ContactBean;

public class OperateOncontactServicesImpl implements OperateOnContactServices {
	 OperateOnContactDAO dao =  OperateOnContactFactory.instanceOfOperateOnContactDAOImpl();

	@Override
	public boolean addcontact(ContactBean bean) {
		return dao.addcontact(bean);
	}

	@Override
	public boolean deletecontact(String name) {
		return dao.deletecontact(name);
	}

	@Override
	public boolean editContact(String name) {
		return dao.editContact(name);
	}

	
		
}
