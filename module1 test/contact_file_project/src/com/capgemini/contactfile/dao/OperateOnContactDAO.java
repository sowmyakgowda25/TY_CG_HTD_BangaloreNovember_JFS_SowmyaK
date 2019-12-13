package com.capgemini.contactfile.dao;

import com.capgemini.contactfile.bean.ContactBean;

public interface OperateOnContactDAO {
	public boolean addcontact(ContactBean bean);
	public boolean deletecontact(String name);
	public boolean editContact(String name);
}
