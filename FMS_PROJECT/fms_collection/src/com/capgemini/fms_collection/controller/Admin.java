package com.capgemini.fms_collection.controller;

import java.util.Scanner;
import com.capgemini.fms_collection.bean.LoginBean;
import com.capgemini.fms_collection.exception.FmsException;
import com.capgemini.fms_collection.factory.AdminFactory;
import com.capgemini.fms_collection.service.AdminService;
import com.capgemini.fms_collection.validations.Validations;

public class Admin {
	public static void admin(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		LoginBean bean = new LoginBean();
		AdminService services = AdminFactory.instanceOfAdminServices();

		System.out.println("Press 1 to Admin Login");
		System.out.println("Press 2 Back to Home");

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
			System.out.println("Enter AdminName");
			String aName = sc.next();
			System.out.println("Enter Password");
			String pwd = sc.next();

			bean.setAdminName(aName);
			bean.setPassword(pwd);

			try {
				if (services.loginAdmin(aName, pwd)) {
					System.out.println("Admin logged in Successfully...");
					LoginPage.login(args);
					
				} else {
					System.err.println("Admin not loggedin...please enter valid credentials");
				}
			} catch (FmsException e) {
				System.out.println(e.toString());
			}
			break;
		case 2:
			HomePage.main(args);
			break;
		default:
			System.err.println("Entered Wrong field...");
			break;
		}

	}
}
