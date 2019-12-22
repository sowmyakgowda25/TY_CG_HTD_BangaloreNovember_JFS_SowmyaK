package com.capgemini.shopping.controller;

import java.util.List;
import java.util.Scanner;

import com.capgemini.shopping.dao.ShoppingAppDAO;
import com.capgemini.shopping.factory.ShoppingAppFactory;
import com.capgemini.shopping.productbean.ShoppingApp;
import com.capgemini.shopping.services.ShoppingAppServices;


public class MainClass {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ShoppingApp bean=new ShoppingApp();
		ShoppingAppDAO dao= ShoppingAppFactory.instanceOfShoppingAppDAOImpl();
		ShoppingAppServices services=ShoppingAppFactory.instanceOfShoppingAppServices();
		while(true) {
			System.out.println("Press 1 to show all Items");
			System.out.println("Press 2 to search for an Item");
			System.out.println("Press 3 to Shopping");
			int choice=sc.nextInt();
			switch(choice) {
			case 1:
				List<ShoppingApp> c1=services.showAllItems();
				if(c1 != null) {
					for ( ShoppingApp shop : c1) {
						System.out.println(shop);
					}
				}
				else {
					System.err.println("Item not found");
				}

				break;
			case 2:
				System.out.println("enter the Product name");
				bean.setProductName(sc.next());
				List<ShoppingApp> c2=services.showAllItems();
				if(c2 != null) {
					for ( ShoppingApp shop : c2) {
						System.out.println(shop);
					}
				}else {
					System.err.println("Item not found");
				}

				break;
			case 3:
				ShoppingClass.main(null);
			}
		}
	}
}

