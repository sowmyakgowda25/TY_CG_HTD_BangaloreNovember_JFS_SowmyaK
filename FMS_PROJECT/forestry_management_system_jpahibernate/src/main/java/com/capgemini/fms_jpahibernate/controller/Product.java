package com.capgemini.fms_jpahibernate.controller;

import java.util.List;
import java.util.Scanner;

import com.capgemini.fms_jpahibernate.dto.ProductBean;
import com.capgemini.fms_jpahibernate.exception.FmsException;
import com.capgemini.fms_jpahibernate.factory.ProductFactory;
import com.capgemini.fms_jpahibernate.service.ProductServices;
import com.capgemini.fms_jpahibernate.validations.Validations;

public class Product {
	public static void product(String[] args) {

		ProductBean product = new ProductBean();
		ProductServices services = ProductFactory.instanceOfProductServices();
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("Press 1 to insert Product");
			System.out.println("Press 2 to Modify Product");
			System.out.println("Press 3 to delete Product");
			System.out.println("Press 4 to get all the Product");
			System.out.println("Press 5 to back to HomePage");

			String choice = null;
			String i = "switch";
			while (i == "switch") {
				choice = sc.next();
				if (Validations.isValidId(choice)) {
					i = "st";
				} else {
					System.out.println("Please Enter digits only");
				}
			}

			switch (Integer.parseInt(choice)) {
			case 1:
				String prId = "bc";
				while (prId == "bc") {
					System.out.println("Enter Product Id");
					String id = sc.next();
					if (Validations.isValidId(id)) {
						product.setProductId(Integer.parseInt(id));
						prId = "ac";
					} else {
						System.out.println("Please Enter Correct Id");
					}
				}

				String prName = "door";
				while (prName == "door") {
					System.out.println("Enter Product Name");
					String name = sc.next();
					if (Validations.isValidName(name)) {
						product.setProductName(name);
						prName = "doors";
					} else {
						System.out.println("Please Enter Correct Name");
					}
				}
				boolean check = false;
				try {
					check = services.addProduct(product);
				} catch (FmsException e) {
					System.out.println(e.toString());
				}
				if (check) {
					System.out.println("Product added successfully...");
				} 
//				else {
//					System.out.println("Product id is not valid");
//				}
				break;
			case 2:
				int i7=0;
				boolean c7 = true;
				while(c7==true) {
					System.out.println("Enter Product id");
					String id=sc.next();
					if(Validations.isValidId(id)) {
						i7 = Integer.parseInt(id);
						c7=false;
						product.setProductId(i7);
					}else {
						System.out.println("Please Enter digits only..");
					}
				}

				
				String proName=null;
				String pName = "door";
				while (pName == "door") {
					System.out.println("Enter the Product Name ");
					proName = sc.next();
					if (Validations.isValidName(proName)) {
						product.setProductName(proName);
						pName = "doors";
					} else {
						System.out.println("Please Enter Correct Name");
					}

					// int productId = Integer.parseInt(proId);
					boolean c2 = false;
					try {
						c2 = services.modifyProduct(i7, proName);
					} catch (FmsException e) {
						System.out.println(e.toString());
					}
					if (c2) {
						System.out.println("Product modified successfully...");
					} 
				}
				break;
			case 3:
				int i11 = 0;
				boolean c11 = true;
				while (c11 == true) {
					System.out.println("Enter id to delete the Land details");
					String productId = sc.next();
					if (Validations.isValidId(productId)) {
						i11 = Integer.parseInt(productId);
						c11 = false;
						product.setProductId(i11);
					} else {
						System.out.println("Please Enter digits only");
					}
				}
				boolean c1 = false;
				try {
					c1 = services.deleteProduct(i11);
				} catch (FmsException e) {
					System.out.println(e.toString());
				}
				if (c1) {
					System.out.println("Product deleted successfully...");
				} 

				break;
			case 4:
				List<ProductBean> list = services.getAllProduct(product);
				if (!list.isEmpty()) {
						System.out.println(list);
				} else {
					System.out.println("Product Details not found");
				}
				break;
			case 5:
				HomePage.main(args);
				break;
			default:
				System.out.println("Please Enter the valid field..");
				break;
			}
		}
	}
}