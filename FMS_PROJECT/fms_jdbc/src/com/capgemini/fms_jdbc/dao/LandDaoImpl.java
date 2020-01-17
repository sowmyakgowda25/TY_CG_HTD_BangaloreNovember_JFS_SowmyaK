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

import com.capgemini.fms_jdbc.bean.LandBean;
import com.capgemini.fms_jdbc.exception.FmsException;

public class LandDaoImpl implements LandDao{
	@SuppressWarnings("unused")
	private List<LandBean> landBean = new ArrayList<LandBean>();
	FileReader reader=null;
	Properties prop=null;
	LandBean user = new LandBean();
	
	public LandDaoImpl() {
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
	public boolean addLand(LandBean bean) throws FmsException {
		try(Connection con = DriverManager.getConnection(prop.getProperty("dbUrl"),
				prop.getProperty("dbuser"),prop.getProperty("dbpassword"));
				PreparedStatement pstmt = con.prepareStatement(prop.getProperty("insertQuery4"));
			){
			pstmt.setInt(1, bean.getLandId());
			pstmt.setDouble(2, bean.getLandAcre());
			pstmt.setString(3, bean.getLandLocation());

			@SuppressWarnings("unused")
			int count = pstmt.executeUpdate();

		}catch(Exception e) {
			throw new FmsException("Id already exist");
		}
		return true;
	}


	@Override
	public boolean deleteLand(int landId) throws FmsException {
		try(Connection con = DriverManager.getConnection(prop.getProperty("dbUrl"),prop.getProperty("dbuser"),
				prop.getProperty("dbpassword"));
				PreparedStatement pstmt = 
						con.prepareStatement(prop.getProperty("deleteQuery4"));
				){
			pstmt.setInt(1, landId);

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
	public List<LandBean> getAllLand(LandBean bean) {
		List<LandBean> list = new ArrayList<LandBean>();
		try(Connection con = DriverManager.getConnection(prop.getProperty("dbUrl"),prop.getProperty("dbuser"),
				prop.getProperty("dbpassword"));
				Statement stmt=con.createStatement();
				ResultSet rs = stmt.executeQuery(prop.getProperty("query4"))){
			while(rs.next()) {
				user = new LandBean();
				user.setLandId(rs.getInt(1));
				user.setLandAcre(rs.getDouble(2));
				user.setLandLocation(rs.getString(3));
				list.add(user);
			}
			return list;
		}catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public boolean modifyLandLoc(int landId, String landLocation) throws FmsException {
		try(Connection con = DriverManager.getConnection(prop.getProperty("dbUrl"),
				prop.getProperty("dbuser"),prop.getProperty("dbpassword"));
				PreparedStatement pstmt = con.prepareStatement(prop.getProperty("updateQuery41"));)
		{
			pstmt.setInt(2, landId);
			pstmt.setString(1,landLocation);
			
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
	public boolean modifyLandAcre(int landId, double landAcre) throws FmsException {
		try(Connection con = DriverManager.getConnection(prop.getProperty("dbUrl"),
				prop.getProperty("dbuser"),prop.getProperty("dbpassword"));
				PreparedStatement pstmt = con.prepareStatement(prop.getProperty("updateQuery42"));)
		{
			pstmt.setInt(2,landId);
			pstmt.setDouble(1,landAcre);
			
			int count = pstmt.executeUpdate();
			if(count > 0) {
				return true;
			}
		}catch(Exception e) {
			throw new FmsException("Id already exist");
		}
	return false;
	}
	
}
