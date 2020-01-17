package com.capgemini.fms_collection.controller;

import java.util.Scanner;

import com.capgemini.fms_collection.bean.LoginBean;
import com.capgemini.fms_collection.exception.FmsException;
import com.capgemini.fms_collection.factory.AdminFactory;
import com.capgemini.fms_collection.service.AdminService;

public class Schedular {
	public static void schedular(String[] args) {
		LoginBean bean = new LoginBean();
		AdminService services = AdminFactory.instanceOfAdminServices();
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Client Name to logged in");
		String aName = sc.next();
		System.out.println("Enter Password");
		String pwd = sc.next();

		bean.setAdminName(aName);
		bean.setPassword(pwd);

		try {
			if (services.loginAdmin(aName, pwd)) {
				System.out.println("Schedular logged in Successfully...");
				Contract.contract(args);

			} else {
				System.out.println("Logged in failed");
			}
		} catch (FmsException e) {
			System.out.println(e.toString());
		}
	}
}
