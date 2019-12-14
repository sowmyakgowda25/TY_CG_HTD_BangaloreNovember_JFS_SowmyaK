package org.j3cm2.jdbcApp;

public class jdbcDemo {

	public static void main(String[] args) {
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
		} 
		catch (ClassNotFoundException e) 
		{
			e.printStackTrace();
		}

	}

}
