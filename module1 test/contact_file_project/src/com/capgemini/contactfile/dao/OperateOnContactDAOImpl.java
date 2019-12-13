package com.capgemini.contactfile.dao;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Properties;

import com.capgemini.contactfile.bean.ContactBean;
public class OperateOnContactDAOImpl implements OperateOnContactDAO {
	
	FileReader reader;
	Properties prop;
	ContactBean user;

	public OperateOnContactDAOImpl() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			reader = new FileReader("db.properties");
			prop = new Properties();
			prop.load(reader);
			Class.forName(prop.getProperty("driverClass"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public boolean addcontact(ContactBean bean) {
		try(Connection con = DriverManager.getConnection(prop.getProperty("dbUrl"),prop.getProperty("dbuser"),
				prop.getProperty("dbpassword"));
				PreparedStatement pstmt = con.prepareStatement(prop.getProperty("insertQuery"));
				){
			pstmt.setString(1, user.getName());
			pstmt.setLong(2, user.getNumber());

			int count = pstmt.executeUpdate();

			if(count > 0) {
				return true;
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean deletecontact(String name) {
		try(Connection con = DriverManager.getConnection(prop.getProperty("dbUrl"),prop.getProperty("dbuser"),
				prop.getProperty("dbpassword"));
				PreparedStatement pstmt = 
						con.prepareStatement(prop.getProperty("deleteQuery"));
				){
			pstmt.setString(2, user.getName());

			int count = pstmt.executeUpdate();

			if(count > 0) {
				return true;
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean editContact(String name) {
		try(Connection con = DriverManager.getConnection(prop.getProperty("dbUrl"),prop.getProperty("dbuser"),
				prop.getProperty("dbpassword"));
				PreparedStatement pstmt = 
						con.prepareStatement(prop.getProperty("updateQuery"))) {
			
			pstmt.setString(2, user.getName());

			int count = pstmt.executeUpdate();

			if(count > 0) {
				return true;
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	

}
