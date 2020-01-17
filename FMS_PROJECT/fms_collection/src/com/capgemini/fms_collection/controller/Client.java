package com.capgemini.fms_collection.controller;

import java.util.Scanner;

import com.capgemini.fms_collection.bean.LoginBean;
import com.capgemini.fms_collection.exception.FmsException;
import com.capgemini.fms_collection.factory.ClientFactory;
import com.capgemini.fms_collection.service.ClientServices;
import com.capgemini.fms_collection.validations.Validations;

public class Client {
	public static void client(String[] args) {
		ClientServices services = ClientFactory.instanceOfClientServices();
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		LoginBean bean = new LoginBean();

		System.out.println("Enter Client Name to logged in");
		String choice1 = null;
		String in = "switch";
		while (in == "switch") {
			choice1 = sc.next();
			if (Validations.isValidId(choice1)) {
				in = "st";
			} else {
				System.out.println("Please Enter digits only");
			}
		}

		switch (Integer.parseInt(choice1)) {
		case 1:
			String clients = "qunty";
			while (clients == "qunty") {
				System.out.println("Enter Client Name:");
				String aName = sc.next();
				if (Validations.isValidName(aName)) {
					bean.setAdminName(aName);
					clients = "quanty";
				} else {
					System.out.println("Enter correct name");
				}
			}
			
			String password = "qunty";
			boolean pass = true;
			while (pass == true) {
				System.out.println("Enter Password");
				password = sc.next();
				if (Validations.passwordFormat(password) == 10) {
					bean.setPassword(password);
					pass = false;
				} else {
					System.out.println("Password Should consists atleast one Upper Case character,one number and special character");
				}
			}

			try {
				if (services.clientLogin(clients, password)) {
					System.out.println("Client logged in Successfully...");
					
					while (true) {
						System.out.println("Press 1 for Customer Opertaions");
						System.out.println("Press 2 for Contract Operations");
						System.out.println("Press 3 for Product Details");
						System.out.println("Press 4 for Back to Home");

						String choice = null;
						String in1 = "switch";
						while (in1 == "switch") {
							choice = sc.next();
							if (Validations.isValidId(choice)) {
								in1 = "st";
							} else {
								System.out.println("Please Enter digits only");
							}
						}

						switch (Integer.parseInt(choice)) {

						case 1:
							Customer.customer(args);
							break;
						case 2:
							Contract.contract(args);
							break;
						case 3:
							Product.product(args);
							break;
						case 4:
							HomePage.main(args);
							break;
						default:
							System.out.println("Entered wrong field");
							break;
						}
					}
				}else {
					System.out.println("logged in failed");
				}
				}catch(FmsException e) {
				System.out.println(e.toString());
			}
			break;
		case 2:
			HomePage.main(args);
			break;
		default:
			System.out.println("Enter valid field");
			break;
		}
	}
}