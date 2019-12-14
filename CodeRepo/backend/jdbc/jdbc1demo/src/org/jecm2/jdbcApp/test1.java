package org.jecm2.jdbcApp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class test1 {

		public static void main(String[] args)
		{
			Connection con=null;
			PreparedStatement pstmt=null;
			String qry="insert into j3cm2.table1 values(?,?,?)";
			try {
					Class.forName("com.mysql.jdbc.Driver");
					System.out.println("Driver class Loaded and Registered");
				con=DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=root");
				System.out.println("Connection Established with DBServer");
				
				pstmt=con.prepareStatement(qry);
				System.out.println("platform created");
				
				pstmt.setInt(1,1);
				pstmt.setString(2,"san");
				pstmt.setDouble(3,62.36);
				pstmt.execute();
				
				
				
			}catch(ClassNotFoundException|SQLException e) {
				e.printStackTrace();
			}
			finally
			{
				if(pstmt!=null)
				{
					try {
						pstmt.close();
					}catch(SQLException e) {
						e.printStackTrace();
					}
				}
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
