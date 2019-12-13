package com.capgemini.contactfile.dao;

import java.io.FileReader;
import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import com.capgemini.contactfile.bean.ContactBean;


public class ContactListDAOImpl implements ContactListDAO {

	FileReader reader;
	Properties prop=null;
	ContactBean bean;
	

	@Override
	public boolean searchContacts() {
		
		
		List<ContactBean> list = new ArrayList<ContactBean>();
		try(java.sql.Connection con = DriverManager.getConnection(prop.getProperty("dbUrl"),prop.getProperty("dbuser"),
				prop.getProperty("dbpassword"));
				java.sql.Statement stmt=con.createStatement();
				java.sql.ResultSet rs = stmt.executeQuery(prop.getProperty("query1"))){
			while(rs.next()) {
				bean = new ContactBean();
				bean.setName(rs.getString(1));
				bean.setNumber(rs.getLong(2));
				bean.setGroup(rs.getString(3));
				list.add(bean);
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		return false;

	}

	@Override
	public List<ContactBean> getAllContact(ContactBean bean) {

		List<ContactBean> list = new ArrayList<ContactBean>();
		try(java.sql.Connection con = DriverManager.getConnection(prop.getProperty("dbUrl"),prop.getProperty("dbuser"),
				prop.getProperty("dbpassword"));
				java.sql.Statement stmt=con.createStatement();
				java.sql.ResultSet rs = stmt.executeQuery(prop.getProperty("query"))){
			while(rs.next()) {
				bean = new ContactBean();
				bean.setName(rs.getString(1));
				bean.setNumber(rs.getLong(2));
				bean.setGroup(rs.getString(3));
				list.add(bean);
			}
			return list;
		}catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}






}
