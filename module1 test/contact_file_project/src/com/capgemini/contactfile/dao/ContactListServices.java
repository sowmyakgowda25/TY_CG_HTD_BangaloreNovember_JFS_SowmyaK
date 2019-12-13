package com.capgemini.contactfile.dao;

import java.util.List;

import com.capgemini.contactfile.bean.ContactBean;

public interface ContactListServices {
	
	public boolean searchContacts(String name);
	public List<ContactBean> getAllContact(ContactBean bean);
	
}
