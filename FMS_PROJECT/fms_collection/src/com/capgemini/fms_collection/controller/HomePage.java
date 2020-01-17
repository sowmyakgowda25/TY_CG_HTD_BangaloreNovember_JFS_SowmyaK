package com.capgemini.fms_collection.controller;

import java.util.Scanner;

import com.capgemini.fms_collection.validations.Validations;

public class HomePage {
	public static void main(String[] args) {

		System.out.println();
		System.out.println("                             Welcome Iggesund Paperboard Forestry Management System  ");
		System.out.println(
				"______________________________________________________________________________________________________________________________");
		System.out.println("Enter the choice:");
		System.out.println();

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("1.Admin\n2.Client");//\n3.Schedular

			String choice = null;
			String i = "switch";
			while(i=="switch") {
				choice = sc.next();
				if (Validations.isValidId(choice)) {
					i = "st";
				} else {
					System.out.println("Please Enter digits only");
				}
			}
			
			switch (Integer.parseInt(choice)) {
			case 1:
				Admin.admin(args);
				break;
			case 2:
				Client.client(args);
				break;
			case 3:
				Schedular.schedular(args);
				break;
			default:
				break;
			}
		}
	}

}
