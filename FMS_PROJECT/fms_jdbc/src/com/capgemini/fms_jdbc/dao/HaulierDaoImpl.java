package com.capgemini.fms_jdbc.dao;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import com.capgemini.fms_jdbc.bean.HaulierBean;
import com.capgemini.fms_jdbc.exception.FmsException;

public class HaulierDaoImpl implements HaulierDao{
	FileReader reader;
	Properties prop;
	@SuppressWarnings("unused")
	private List<HaulierBean> haulierBean = new ArrayList<HaulierBean>();
	HaulierBean user = new HaulierBean();
	
	public HaulierDaoImpl() {
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
	public boolean addHaulier(HaulierBean bean) throws FmsException {
		try(Connection con = DriverManager.getConnection(prop.getProperty("dbUrl"),prop.getProperty("dbuser"),
				prop.getProperty("dbpassword"));
				PreparedStatement pstmt = con.prepareStatement(prop.getProperty("insertQuery3"));
				){
			pstmt.setInt(1, bean.getHaulierId());
			pstmt.setString(2, bean.getHaulierName());
			pstmt.setString(3, bean.getStreetAddress());
			pstmt.setInt(4, bean.getPostalCode());
			pstmt.setString(5, bean.getTown());
			pstmt.setString(6, bean.getEmail());
			pstmt.setLong(7, bean.getTelephoneNumber());
			
			int count = pstmt.executeUpdate();

			if(count > 0) {
				return true;
			}
		}catch(Exception e) {
			throw new FmsException("Id already exist");
		}
		return false;
	}


	@Override
	public boolean deleteHaulier(int haulierId) throws FmsException {
		try(Connection con = DriverManager.getConnection(prop.getProperty("dbUrl"),prop.getProperty("dbuser"),
				prop.getProperty("dbpassword"));
				PreparedStatement pstmt = 
						con.prepareStatement(prop.getProperty("deleteQuery3"));
				){
			pstmt.setInt(1, haulierId);

			int count = pstmt.executeUpdate();

			if(count > 0) {
				return true;
			}
		}catch(Exception e) {
			throw new FmsException("Id doesn't exist");
		}
		return false;
	}


	@Override
	public List<HaulierBean> getAllHaulier() {
		List<HaulierBean> list = new ArrayList<HaulierBean>();
		try(Connection con = DriverManager.getConnection(prop.getProperty("dbUrl"),prop.getProperty("dbuser"),
				prop.getProperty("dbpassword"));
				Statement stmt=con.createStatement();
				ResultSet rs = stmt.executeQuery(prop.getProperty("query3"))){
			while(rs.next()) {
				user = new HaulierBean();
				user.setHaulierId(rs.getInt(1));
				user.setHaulierName(rs.getString(2));
				user.setStreetAddress(rs.getString(3));
				user.setPostalCode(rs.getInt(4));
				user.setTown(rs.getString(5));
				user.setEmail(rs.getString(6));
				user.setTelephoneNumber(rs.getLong(7));
				list.add(user);
			}
			return list;
		}catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public boolean modifyHaulierName(int haulierId, String haulierName) throws FmsException {
		try(Connection con = DriverManager.getConnection(prop.getProperty("dbUrl"),
				prop.getProperty("dbuser"),prop.getProperty("dbpassword"));
				PreparedStatement pstmt = con.prepareStatement(prop.getProperty("updateQuery31"));)
		{
			pstmt.setInt(2, haulierId);
			pstmt.setString(1,haulierName);
			
			int count = pstmt.executeUpdate();
			if(count > 0) {
				return true;
			}
		}catch(Exception e) {
			throw new FmsException("Id doesn't exist");
		}
	return false;
	}

	@Override
	public boolean modifyHaulierAddress(int haulierId, String streetAddress) throws FmsException {
		try(Connection con = DriverManager.getConnection(prop.getProperty("dbUrl"),
				prop.getProperty("dbuser"),prop.getProperty("dbpassword"));
				PreparedStatement pstmt = con.prepareStatement(prop.getProperty("updateQuery32"));)
		{
			pstmt.setInt(2,haulierId);
			pstmt.setString(1,streetAddress);
			
			int count = pstmt.executeUpdate();
			if(count > 0) {
				return true;
			}
		}catch(Exception e) {
			throw new FmsException("Id doesn't exist");
		}
	return false;

	}

	@Override
	public boolean modifyHaulierPostalCode(int haulierId, int postalCode) throws FmsException {
		try(Connection con = DriverManager.getConnection(prop.getProperty("dbUrl"),
				prop.getProperty("dbuser"),prop.getProperty("dbpassword"));
				PreparedStatement pstmt = con.prepareStatement(prop.getProperty("updateQuery33"));)
		{
			pstmt.setInt(2,haulierId);
			pstmt.setInt(1,postalCode);
			
			int count = pstmt.executeUpdate();
			if(count > 0) {
				return true;
			}
		}catch(Exception e) {
			throw new FmsException("Id doesn't exist");
		}
	return false;

	}

	@Override
	public boolean modifyHaulierTown(int haulierId, String town) throws FmsException {
		try(Connection con = DriverManager.getConnection(prop.getProperty("dbUrl"),
				prop.getProperty("dbuser"),prop.getProperty("dbpassword"));
				PreparedStatement pstmt = con.prepareStatement(prop.getProperty("updateQuery34"));)
		{
			pstmt.setInt(2,haulierId);
			pstmt.setString(1,town);
			
			int count = pstmt.executeUpdate();
			if(count > 0) {
				return true;
			}
		}catch(Exception e) {
			throw new FmsException("Id doesn't exist");
		}
	return false;
	}

	@Override
	public boolean modifyHaulierEmail(int haulierId, String email) throws FmsException {
		try(Connection con = DriverManager.getConnection(prop.getProperty("dbUrl"),
				prop.getProperty("dbuser"),prop.getProperty("dbpassword"));
				PreparedStatement pstmt = con.prepareStatement(prop.getProperty("updateQuery35"));)
		{
			pstmt.setInt(2,haulierId);
			pstmt.setString(1,email);
			
			int count = pstmt.executeUpdate();
			if(count > 0) {
				return true;
			}
		}catch(Exception e) {
			throw new FmsException("Id doesn't exist");
		}
	return false;

	}

	@Override
	public boolean modifyHaulierTelePhoneNum(int haulierId, long number) throws FmsException {
		try(Connection con = DriverManager.getConnection(prop.getProperty("dbUrl"),
				prop.getProperty("dbuser"),prop.getProperty("dbpassword"));
				PreparedStatement pstmt = con.prepareStatement(prop.getProperty("updateQuery36"));)
		{
			pstmt.setInt(2,haulierId);
			pstmt.setLong(1,number);
			
			int count = pstmt.executeUpdate();
			if(count > 0) {
				return true;
			}
		}catch(Exception e) {
			throw new FmsException("Id doesn't exist");
		}
	return false;
	}
	
}
