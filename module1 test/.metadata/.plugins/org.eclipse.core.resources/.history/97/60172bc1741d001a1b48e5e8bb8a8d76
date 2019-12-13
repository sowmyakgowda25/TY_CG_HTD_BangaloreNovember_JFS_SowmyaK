package com.capgemini.contactfile.contact;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("1.Show all Contacts\n 2.Search for Contact\n 3.Operate on Contact\n 4.MainClass");
		while(true) {
		int choice = sc.nextInt();
		switch(choice) {
		case 1:
			//System.out.println("Press 1 to Show all contacts");
			ContactList.main(args);
			break;
		case 2:
			//System.out.println("Press 2 to Search for contact");
			OperateContact.main(args);
			break;
		case 3:
			//System.out.println("Press 3 to Operate on contact");
			SearchContact.main(args);
			break;
		case 4:
			MainClass.main(args);
		}
	}

}
}