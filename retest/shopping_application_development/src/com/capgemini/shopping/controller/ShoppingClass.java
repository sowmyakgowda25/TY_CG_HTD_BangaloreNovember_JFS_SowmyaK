package com.capgemini.shopping.controller;

import java.util.List;
import java.util.Scanner;

import com.capgemini.shopping.dao.ShoppingAppDAO;
import com.capgemini.shopping.factory.ShoppingAppFactory;
import com.capgemini.shopping.productbean.Shopping;
import com.capgemini.shopping.productbean.ShoppingApp;
import com.capgemini.shopping.services.ShoppingAppServices;

public class ShoppingClass {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ShoppingApp bean=new ShoppingApp();
		ShoppingAppDAO dao= ShoppingAppFactory.instanceOfShoppingAppDAOImpl();
		ShoppingAppServices services=ShoppingAppFactory.instanceOfShoppingAppServices();
		while(true) {
			System.out.println("Press 1 to buy the product");
			System.out.println("Press 2 to search again the Item");
			System.out.println("Press 3 to main menu");
			int choice=sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Enter the product Id");
				int productId=sc.nextInt();
				System.out.println("Enter the card number");
				int cardNumber=sc.nextInt();
				System.out.println("Enter 3 digits cvv");
				int cvv=sc.nextInt();
				Shopping s1=new Shopping();
				if(s1 != null) {
					System.out.println("After the payment deliver the product");
				}else {
					System.err.println("product not deliverd");
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
					MainClass.main(null);
			}
			
		}
	}
}