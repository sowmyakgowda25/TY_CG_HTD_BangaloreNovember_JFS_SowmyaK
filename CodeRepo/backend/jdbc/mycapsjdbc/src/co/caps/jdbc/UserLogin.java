package co.caps.jdbc;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class UserLogin {
	public static void main(String[] args) {
		Connection con=null;
		Statement stmt = null;
		ResultSet res=null;
		
		Scanner sc=new Scanner(System.in);
		try {
			//Load the Driver
			//Driver driver=new com.mysql.jdbc.Driver();
			//DriverManager.registerDriver(driver);
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver Loaded...");
			
			//get DB connection via Driver
			String dbUrl="jdbc:mysql://127.0.0.1:3306/ty_cg_nov6";
			
			System.out.println("enter username and password");
			String dbUser = sc.nextLine();
			String dbPass = sc.nextLine();
			con = DriverManager.getConnection(dbUrl,dbUser,dbPass);
			System.out.println("Connection Estd...");
			
			//Issue sql queries via connection
			String query = "SELECT * FROM users_info" + " where userid = 2019001 AND password = 'pawar@25'";
			stmt=con.createStatement();
			res = stmt.executeQuery(query);
			System.out.println("Query Issued And executed....");
			
			System.out.println("-------------------------------");
			
			//Process the results returned
			if(res.next()) {
				System.out.println("Userid : "+res.getInt(1));//it takes column index
				System.out.println("Username : "+res.getString(2));
				System.out.println("Email : "+res.getString(3));
				System.out.println("Password : "+res.getString(4));
				System.out.println("______________________________");
			}
		} catch (SQLException | ClassNotFoundException e) {
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
			if(stmt!=null) {
				try {
					stmt.close();
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
