package co.caps.jdbc;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class DeleteUser {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet res = null;

		//load the driver
		try {
			//Driver driver = new com.mysql.jdbc.Driver();
			//DriverManager.registerDriver(driver);
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("driver loaded...");

			//get db connection via driver
			String dbUrl = "jdbc:mysql://localhost:3306/ty_cg_nov6";
			System.out.println("enter DB user and password");
			String user = sc.nextLine();
			String password = sc.nextLine();
			con = DriverManager.getConnection(dbUrl,user,password);
			System.out.println("Connection established...");
			
			//issue sql queries via connection
			String query = "DELETE from users_info where userid=? and password=?";
			pstmt = con.prepareStatement(query);
			System.out.println("enter userid...");
			pstmt.setInt(1, Integer.parseInt(sc.nextLine()));
			System.out.println("enter password...");
			pstmt.setString(2, sc.nextLine());
			
			int count = pstmt.executeUpdate();
			if(count>0) {
				System.out.println("User Deleted...");
			}else {
				System.out.println("something went wrong...");
			}
			
			System.out.println("-------------------------------");
			//Process the results returned
			/*if(res.next()) {
				System.out.println("Userid : "+res.getInt(1));//it takes column index
				System.out.println("Username : "+res.getString(2));
				System.out.println("Email : "+res.getString(3));
				System.out.println("Password : "+res.getString(4));
				System.out.println("______________________________");
			}else
			{
				System.out.println("something went wrong...");
			}
			*/
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
			if(res!=null) {
				try {
					res.close();
				} catch (SQLException e) {
					e.printStackTrace();
					System.out.println("close all jdbc objects");
				}
				
			}
		}

	}

}
