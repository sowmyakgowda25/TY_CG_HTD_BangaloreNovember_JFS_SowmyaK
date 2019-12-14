package com.capgemini.jdbc.controller;

import java.util.Scanner;

import com.capgemini.jdbc.bean.UserBean;
import com.capgemini.jdbc.factory.UserFactory;
import com.capgemini.jdbc.service.UserServices;

public class UpdateUser {
	public static void main(String[] args) {
		UserServices services = UserFactory.instanceOfUserServices();
		UserBean user = new UserBean();
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter userid..");
		user.setUserid(Integer.parseInt(sc.nextLine()));
		System.out.println("Enter username...");
		user.setUsername(sc.nextLine());
		System.out.println("Enter Email...");
		user.setEmail(sc.nextLine());
		System.out.println("Enter password...");
		user.setPassword(sc.nextLine());


		if(services.updateUser(user)) {
			System.out.println("user upted...");
		}else
		{
			System.err.println("something went wrong...");
		}
		sc.close();
	}
}
