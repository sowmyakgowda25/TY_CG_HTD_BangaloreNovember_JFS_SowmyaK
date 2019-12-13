package com.capgemini.contactfile.dao;

import java.util.List;

import com.capgemini.contact.factory.ContactListFactory;
import com.capgemini.contactfile.bean.ContactBean;

public class ContactListServicesImpl implements ContactListServices {
	ContactListDAO dao = ContactListFactory.instanceOfContactListDAOImpl();

	@Override
	public boolean searchContacts(String name) {
		return dao.searchContacts();
	}

	@Override
	public List<ContactBean> getAllContact(ContactBean bean) {
		return dao.getAllContact(bean);
	}

}
