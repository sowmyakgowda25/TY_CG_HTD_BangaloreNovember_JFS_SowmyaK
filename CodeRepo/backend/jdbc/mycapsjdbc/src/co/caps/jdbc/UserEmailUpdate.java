package co.caps.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UserEmailUpdate {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Connection con = null;
		PreparedStatement pstmt= null;
		
		try {
			//Load the driver
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver loaded...");
			
			//get DB connection via driver
			String Url="jdbc:mysql://localhost:3306/ty_cg_nov6";
			System.out.println("Enter DB user and password");
			String user = sc.nextLine();
			String password = sc.nextLine();
			con = DriverManager.getConnection(Url,user,password);
			System.out.println("Connection established...");
			
			//issue sql queries via connection
			String query = "update users_info set email=? where userid=? and password=?";
			pstmt = con.prepareStatement(query);
			
			System.out.println("Enter Userid...");
			pstmt.setInt(2, Integer.parseInt(sc.nextLine()));
			System.out.println("Enter the new Email...");
			pstmt.setString(1, sc.nextLine());
			System.out.println("Enter password to update...");
			pstmt.setString(3, sc.nextLine());
			sc.close();
			int count = pstmt.executeUpdate();
			System.out.println("Query issued...");
			
			//process results returned
			if(count>0) {
				System.out.println("Query OK,"+count+" Rows effected");
			}else {
				System.out.println("Somethin went wrong...");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		//close all jdbc objects
		finally {
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
			
		}
		
	}

}
