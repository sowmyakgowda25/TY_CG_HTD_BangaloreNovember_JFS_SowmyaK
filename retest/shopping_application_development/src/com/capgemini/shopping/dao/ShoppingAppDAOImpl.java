package com.capgemini.shopping.dao;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import com.capgemini.shopping.productbean.ShoppingApp;


public class ShoppingAppDAOImpl implements ShoppingAppDAO {
	FileReader reader;
	Properties prop;
	ShoppingApp app=new ShoppingApp();

	public ShoppingAppDAOImpl() {

		{
			try {
				Class.forName("com.mysql.jdbc.Driver");
				reader=new FileReader("db.property");
				prop=new Properties();
				prop.load(reader);
				Class.forName(prop.getProperty("driverClass"));

			} catch (Exception e) {

				e.printStackTrace();
			}
		}
	}
	@Override
	public List<ShoppingApp> showAllItems() {
		List<ShoppingApp> list=new ArrayList<ShoppingApp>();
		try( Connection conn=DriverManager.getConnection(prop.getProperty("dbUrl"),prop.getProperty("dbUser"),prop.getProperty("dbPassword"));
				Statement stmt=conn.createStatement();
				ResultSet rs=stmt.executeQuery(prop.getProperty("query"))){
			while(rs.next()) {
				app=new ShoppingApp();
				app.setProductId(rs.getInt(1));
				app.setProductName(rs.getString(2));
				app.setProductCost(rs.getLong(3));
				app.setProductColor(rs.getString(4));
				app.setDescription(rs.getString(5));
				app.setNumberOfProducts(rs.getInt(6));
				list.add(app);

			}
			return list;

		} catch (Exception e) {

			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<ShoppingApp> searchAnItem(String productName) {
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

}
