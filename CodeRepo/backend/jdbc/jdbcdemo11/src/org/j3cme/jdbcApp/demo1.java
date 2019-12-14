package org.j3cme.jdbcApp;

import java.sql.*;

public class demo1 {
	public static void main(String[] args)
	{
		Connection con=null;
		try {
				Class.forName("com.mysql.jdbc.Driver");
				System.out.println("Driver class Loaded and Registered");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=root");
			System.out.println("Connection Established with DBServer");
		}catch(ClassNotFoundException|SQLException e) {
			e.printStackTrace();
		}
		finally
		{
			if(con!=null)
			{
				try {
					con.close();
					System.out.println("closed all Costly Resources");
				}catch(SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}

}


