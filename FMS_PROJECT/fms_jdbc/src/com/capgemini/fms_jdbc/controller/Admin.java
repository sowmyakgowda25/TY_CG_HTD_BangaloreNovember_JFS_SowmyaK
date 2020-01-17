package com.capgemini.fms_jdbc.controller;

import java.util.Scanner;

import com.capgemini.fms_jdbc.bean.LoginBean;
import com.capgemini.fms_jdbc.exception.FmsException;
import com.capgemini.fms_jdbc.factory.AdminFactory;
import com.capgemini.fms_jdbc.services.AdminService;
import com.capgemini.fms_jdbc.validations.Validations;

public class Admin {
	public static void admin(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		LoginBean bean = new LoginBean();
		AdminService services = AdminFactory.instanceOfAdminServices();

		System.out.println("Press 1 to Admin Login");
		System.out.println("press 2 for Home Page");
		String choice = null;
		String in = "switch";
		while (in == "switch") {
			choice = sc.next();
			if (Validations.isValidId(choice)) {
				in = "st";
			} else {
				System.out.println("Please Enter digits only");
			}
		}

		switch (Integer.parseInt(choice)) {
		case 1:
			String adminName = null;
			boolean ad = true;
			while (ad == true) {
				System.out.println("Enter Admin Name:");
				adminName = sc.next();
				if (Validations.isValidName(adminName)) {
					ad = false;
					bean.setAdminName(adminName);
				} else {
					System.out.println("Enter correct name");
				}
			}

			String adminPassword = null;
			boolean adminPwd = true;
			while (adminPwd == true) {
				System.out.println("Enter Admin password:");
				adminPassword = sc.next();
				if (Validations.passwordFormat(adminPassword) == 10) {
					bean.setPassword(adminPassword);
					adminPwd = false;
				} else {
					System.out.println("Enter valid password");
				}
			}

//			String adminType = null;
//			boolean type11 = true;
//			while (type11 == true) {
//				System.out.println("Enter the Type ");
//				adminType = sc.next();
//				if (Validations.isValidName(adminType)) {
//					bean.setType(adminType);
//					type11 = false;
//				} else {
//					System.out.println("Please enter valid type");
//				}
//			}

			try {
				if (services.loginAdmin(adminName, adminPassword)) {
					System.out.println("Admin logged in Successfully...");
					LoginPage.login(args);
					
				} else {
					System.out.println("Admin logged in failed");
				}
			} catch (FmsException e) {
				System.out.println(e.toString());
			}
			break;
		case 2:
			Home.main(args);
			break;
		default:
			System.out.println("Entered wrong field");
			break;
		}
	}
}
