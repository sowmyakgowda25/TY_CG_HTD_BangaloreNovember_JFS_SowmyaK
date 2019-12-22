package com.capgemini.shopping.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import com.capgemini.shopping.productbean.ShoppingApp;

public class ShoppingDAOImpl implements ShoppingDAO{
	Properties prop=null;
	@Override
	public List<ShoppingApp> searchAngain(String productName) {
		List<ShoppingApp> list = new ArrayList<ShoppingApp>();
		try( Connection conn=DriverManager.getConnection(prop.getProperty("dbUrl"),prop.getProperty("dbUser"),prop.getProperty("dbPassword"));
				PreparedStatement pstmt=conn.prepareStatement(prop.getProperty("querySearch"))){

			pstmt.setString(1,productName);
			ResultSet rs = pstmt.executeQuery();

			ShoppingApp c2= new ShoppingApp();
			while(rs.next()) {
				c2.setProductId(rs.getInt(1));
				c2.setProductName(rs.getString(2));
				c2.setProductCost(rs.getDouble(3));
				c2.setProductColor(rs.getString(4));
				c2.setDescription(rs.getString(5));
				c2.setNumberOfProducts(rs.getInt(6));
			}
			list.add(c2);
		}catch (Exception e) {

			e.printStackTrace();
		}
		return null;
	}

	@Override
	public boolean buyTheProduct(int cardnumber, int cvv) {
		
		return false;
	}

}
