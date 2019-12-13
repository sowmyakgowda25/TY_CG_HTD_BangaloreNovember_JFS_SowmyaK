package com.capgemini.contactfile.contact;

import java.util.Scanner;

public class SearchContact {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Contact Name");
		sc.nextLine();
		
		
		int choice=sc.nextInt();
		switch(choice) {
		case 1:
			System.out.println("Press 1 to call");
			break;
		case 2:
			System.out.println("Press 2 to message");
			break;
		case 3:
			OperateContact.main(args);
			break;
		}
	}
}
