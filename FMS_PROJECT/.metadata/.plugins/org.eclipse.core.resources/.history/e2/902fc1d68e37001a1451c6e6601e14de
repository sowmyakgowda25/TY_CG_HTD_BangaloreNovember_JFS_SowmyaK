package com.capgemini.fms_jdbc.controller;

import java.util.Scanner;

import com.capgemini.fms_jdbc.validations.Validations;

public class Home {

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
			System.out.println("1.Admin\n2.Client\n3.Schedular");

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
				Admin.admin(args);
				break;
			case 2:
				Client.client(args);
				break;
			case 3:
				Schedular.schedular(args);
				break;
			default:
				System.err.println("Entered Wrong field...");
				break;
			}
		}
	}
}
