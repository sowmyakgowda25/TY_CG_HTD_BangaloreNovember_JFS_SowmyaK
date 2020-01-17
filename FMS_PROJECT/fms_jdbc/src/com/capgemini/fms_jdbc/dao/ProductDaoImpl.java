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

import com.capgemini.fms_jdbc.bean.ProductBean;
import com.capgemini.fms_jdbc.exception.FmsException;

public class ProductDaoImpl implements ProductDao{
	
	FileReader reader=null;
	Properties prop=null;
	@SuppressWarnings("unused")
	private List<ProductBean> productBean = new ArrayList<ProductBean>();
	ProductBean user = new ProductBean();
	
	public ProductDaoImpl() {
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
	public boolean addProduct(ProductBean user) throws FmsException {
		try(Connection con = DriverManager.getConnection(prop.getProperty("dbUrl"),prop.getProperty("dbuser"),
				prop.getProperty("dbpassword"));
				PreparedStatement pstmt = con.prepareStatement(prop.getProperty("insertQuery2"));
				){
			pstmt.setInt(1, user.getProductId());
			pstmt.setString(2,user.getProductName());
			
			int count = pstmt.executeUpdate();
			if(count > 0) {
				return true;
			}
		}catch(Exception e) {
			throw new FmsException(" Id already exist");
		}
		return false;
	}

	@Override
	public boolean deleteProduct(int productId) throws FmsException {
		try(Connection con = DriverManager.getConnection(prop.getProperty("dbUrl"),prop.getProperty("dbuser"),
				prop.getProperty("dbpassword"));
				PreparedStatement pstmt = con.prepareStatement(prop.getProperty("deleteQuery2"));
				){
			pstmt.setInt(1, productId);

			int count = pstmt.executeUpdate();

			if(count > 0) {
				return true;
			}
		}catch(Exception e) {
			throw new FmsException("Product Id not exist");
		}
		return false;
	}

	@Override
	public List<ProductBean> getAllProduct() {
		List<ProductBean> list = new ArrayList<ProductBean>();
		try(Connection con = DriverManager.getConnection(prop.getProperty("dbUrl"),prop.getProperty("dbuser"),
				prop.getProperty("dbpassword"));
				Statement stmt=con.createStatement();
				ResultSet rs = stmt.executeQuery(prop.getProperty("query2"))){
			while(rs.next()) {
				user = new ProductBean();
				user.setProductId(rs.getInt(1));
				user.setProductName(rs.getString(2));
				list.add(user);
			}
			return list;
		}catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	@Override
	public boolean modifyProduct(ProductBean bean) {
		try(Connection con = DriverManager.getConnection(prop.getProperty("dbUrl"),prop.getProperty("dbuser"),
				prop.getProperty("dbpassword"));
				PreparedStatement pstmt = con.prepareStatement(prop.getProperty("updateQuery2"));) {
			pstmt.setInt(2, bean.getProductId());
			pstmt.setString(1, bean.getProductName());
			
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
