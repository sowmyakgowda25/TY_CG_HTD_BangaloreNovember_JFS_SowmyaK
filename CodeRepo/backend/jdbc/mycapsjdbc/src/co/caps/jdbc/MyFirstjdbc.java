package co.caps.jdbc;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MyFirstjdbc {

	public static void main(String[] args) {
		Connection con=null;
		Statement stmt=null;
		ResultSet res=null;
		
		try {
			//Load the driver
			Driver driver=new com.mysql.jdbc.Driver();
			DriverManager.registerDriver(driver);
			System.out.println("Driver loaded...");
			
			//Get DBConnection via Driver
			String dbUrl = "jdbc:mysql://localhost:3306/ty_cg_nov6"+"?user=root&password=root";
			con = DriverManager.getConnection(dbUrl);
			System.out.println("Connection Established...");
			
			//Issue SQL query via connection
			String query = "SELECT * FROM users_info";
			stmt=con.createStatement();
			res = stmt.executeQuery(query);
			System.out.println("Query Issued...");
			System.out.println("*****************************************");
			
			//Process the result returned
			while(res.next()) {
				System.out.println("Userid : "+res.getInt("userid"));
				System.out.println("Username : "+res.getString("username"));
				System.out.println("Email : "+res.getString("email"));
				System.out.println("Password : "+res.getString("password"));
				System.out.println("*****************************************");
			}
		} catch (SQLException e) {
			e.printStackTrace();
			//Close all JDBC Objects
		}
		finally {
			if(con!= null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
				if(stmt!= null) {
					try {
						stmt.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
					if(res!= null) {
						try {
							res.close();
						} catch (SQLException e) {
							e.printStackTrace();}
					}
			System.out.println("close all JDBC Objects");
		}
		
	}

}
