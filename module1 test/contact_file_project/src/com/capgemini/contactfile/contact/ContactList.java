package com.capgemini.contactfile.contact;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.capgemini.contactfile.bean.ContactBean;

public class ContactList {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		String Name;
		System.out.println("Enter the Contact Names");
		sc.nextLine();
		System.out.println("Enter the Contact Number");
		sc.nextLine();

		List<ContactBean> list=new ArrayList<ContactBean>();
		if(list != null){
			for(ContactBean user:list) {
				System.out.println(user);
			}
		}

	}
}


