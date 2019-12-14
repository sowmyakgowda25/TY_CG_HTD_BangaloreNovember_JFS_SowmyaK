package org.jecm3.loginApp;
import java.sql.*;
import java.util.Scanner;

public class loginvalidation
{
	public static void main(String[] args)
	{
		Connection con=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		String qry="select username from jecm3.user where name=? and password=?";
		Scanner sc=new Scanner(System.in);
		System.out.println("enter name??");
		String name=sc.next();
		System.out.println("enter password??");
		String pwd=sc.next();
		sc.close();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=root");
			pstmt=con.prepareStatement(qry);
			pstmt.setString(1, name);
			pstmt.setString(2, pwd);
			rs=pstmt.executeQuery();
			if(rs.next()) 
			{
				String uname=rs.getString(1);
				System.out.println("welcome "+uname);
			}
			else
			{
				System.err.println("invalid name/password");
			}
				
		}catch(ClassNotFoundException | SQLException e)
		{
			e.printStackTrace();
		}
		finally {
			if(rs!=null)
			{
				try 
				{
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(pstmt!=null)
			{
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(con!=null)
			{
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			}
		}
	}

