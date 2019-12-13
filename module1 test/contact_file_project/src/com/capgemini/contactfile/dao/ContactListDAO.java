package com.capgemini.contactfile.dao;

import java.util.List;

import com.capgemini.contactfile.bean.ContactBean;

public interface ContactListDAO {
	public boolean searchContacts();
	public List<ContactBean> getAllContact(ContactBean bean);
	
}
