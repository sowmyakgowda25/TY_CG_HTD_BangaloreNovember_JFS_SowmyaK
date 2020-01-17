package com.capgemini.fms_jpahibernate.controller;

import java.util.Scanner;

import com.capgemini.fms_jpahibernate.dto.LoginBean;
import com.capgemini.fms_jpahibernate.exception.FmsException;
import com.capgemini.fms_jpahibernate.factory.AdminFactory;
import com.capgemini.fms_jpahibernate.service.AdminService;
import com.capgemini.fms_jpahibernate.validations.Validations;

public class Client {
	public static void client(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		LoginBean bean = new LoginBean();
		AdminService services = AdminFactory.instanceOfAdminServices();

		System.out.println("Press 1 to Client Login");
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

			String adminType = null;
			boolean type11 = true;
			while (type11 == true) {
				System.out.println("Enter the Type ");
				adminType = sc.next();
				if (Validations.isValidName(adminType)) {
					bean.setType(adminType);
					type11 = false;
				} else {
					System.out.println("Please enter valid type");
				}
			}

			try {
				if (services.loginAdmin(adminName, adminPassword, adminType)) {
					System.out.println("Client logged in Successfully...");

					while (true) {
						System.out.println("Press 1 for Customer Opertaions");
						System.out.println("Press 2 for Contract Operations");
						System.out.println("Press 3 for Product Details");
						System.out.println("Press 4 for Back to Client");
						System.out.println("Press 5 for Back to Home");

						String choice1 = null;
						String in1 = "switch";
						while (in1 == "switch") {
							choice1 = sc.next();
							if (Validations.isValidId(choice1)) {
								in1 = "st";
							} else {
								System.out.println("Please Enter digits only");
							}
						}

						switch (Integer.parseInt(choice)) {
						case 1:
							Contract.contract(args);
							break;
						case 2:
							Customer.customer(args);
							break;
						case 3:
							Product.product(args);
							break;
						case 4:
							Client.client(args);
							break;
						case 5: 
							HomePage.main(args);
							break;
						default:
							System.out.println("Please Enter the valid field..");
							break;
						}
					}

				} else {
					System.out.println("Logged in failed");
				}
			} catch (FmsException e) {
				System.out.println(e.toString());
			}
			break;
		case 2:
			HomePage.main(args);
			break;
		default:
			System.out.println("Please enter the available digits only...");
			break;
		}
	}
}
