package co.caps.jdbc;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertUser {
	public static void main(String[] args) {
		Connection con=null;
		PreparedStatement pstmt = null;
		ResultSet res=null;
		
		Scanner sc=new Scanner(System.in);
		try {
			//Load the Driver
			Driver driver=new com.mysql.jdbc.Driver();
			DriverManager.registerDriver(driver);
			System.out.println("Driver Loaded...");
			
			//get DB connection via Driver
			String dbUrl="jdbc:mysql://127.0.0.1:3306/ty_cg_nov6";
			
			System.out.println("enter username and password");
			String dbUser = sc.nextLine();
			String dbPass = sc.nextLine();
			con = DriverManager.getConnection(dbUrl,dbUser,dbPass);
			System.out.println("Connection Estd...");
			
			//Issue sql queries via connection
			String query = "Insert into users_info(userid,username,email,password) values(?,?,?,?)";
			pstmt=con.prepareStatement(query);
			
			System.out.println("Enter userid...");
			pstmt.setInt(1, Integer.parseInt(sc.nextLine()));
			System.out.println("Enter username...");
			pstmt.setString(2, sc.nextLine());
			System.out.println("Enter email...");
			pstmt.setString(3, sc.nextLine());
			System.out.println("Enter password...");
			pstmt.setString(4, sc.nextLine());
			
			int count = pstmt.executeUpdate();
			if(count>0) {
				System.out.println("User inserted...");
			}else {
				System.out.println("something went wrong...");
			}
			System.out.println("Query Issued And executed....");
			System.out.println("-------------------------------");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			//Close all jdbc objects
			if(con!=null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(pstmt!=null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(res!=null) {
				try {
					res.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
				
	}
}

