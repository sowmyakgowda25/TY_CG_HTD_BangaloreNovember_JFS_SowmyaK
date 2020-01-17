package com.capgemini.fms_jpahibernate.controller;

import java.util.List;
import java.util.Scanner;

import com.capgemini.fms_jpahibernate.dto.ContractBean;
import com.capgemini.fms_jpahibernate.exception.FmsException;
import com.capgemini.fms_jpahibernate.factory.ContractFactory;
import com.capgemini.fms_jpahibernate.service.ContractServices;
import com.capgemini.fms_jpahibernate.validations.Validations;

public class Contract {
	public static void contract(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		ContractBean user = new ContractBean();
		ContractServices services = ContractFactory.instanceOfContractorServices();
		while (true) {
			System.out.println("Press 1 to insert contractor data");
			System.out.println("Press 2 to delete contractor data");
			System.out.println("Press 3 to get all the contractor");
			System.out.println("Press 4 to Client");

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

//				System.out.println("Enter Contractor number..");
//				user.setContractorNum(Integer.parseInt(sc.next()));
				String cNo = "ab";
				while (cNo == "ab") {
					System.out.println("Enter contractor number");
					String conNum = sc.next();
					if (Validations.isValidId(conNum)) {
						user.setContractorNum(Integer.parseInt(conNum));
						cNo = "stu";
					} else {
						System.out.println("Please Enter Correct number");
					}
				}
//				System.out.println("Enter customerId..");
//				user.setCustomerId(Integer.parseInt(sc.next()));
				String cusId = "ab";
				while (cusId == "ab") {
					System.out.println("Enter customer id");
					String custId = sc.next();
					if (Validations.isValidId(custId)) {
						user.setCustomerId(Integer.parseInt(custId));
						cusId = "st";
					} else {
						System.out.println("Please Enter Correct Id");
					}
				}
//				System.out.println("Enter productId..");
//				user.setProductId(Integer.parseInt(sc.next()));
				String pdId = "ab";
				while (pdId == "ab") {
					System.out.println("Enter product id");
					String pId = sc.next();
					if (Validations.isValidId(pId)) {
						user.setProductId(Integer.parseInt(pId));
						pdId = "st";
					} else {
						System.out.println("Please Enter Correct Id");
					}
				}
//				System.out.println("Enter haulierId..");
//				user.setHaulierId(Integer.parseInt(sc.next()));
				String haId = "ab";
				while (haId == "ab") {
					System.out.println("Enter haulier id");
					String hId = sc.next();
					if (Validations.isValidId(hId)) {
						user.setHaulierId(Integer.parseInt(hId));
						haId = "st";
					} else {
						System.out.println("Please Enter Correct Id");
					}
				}
				System.out.println("Enter deliveryDate...");
				user.setDeliveryDate(sc.next());

				System.out.println("Enter deliveyDay...");
				user.setDeliveryDay(sc.next());

//				System.out.println("Enter Quantity..");
//				user.setQuantity(Integer.parseInt(sc.next()));
				String qn = "qunty";
				while (qn == "qunty") {
					System.out.println("Enter product quantity:");
					String qnty = sc.next();
					if (Validations.isValidId(qnty)) {
						user.setQuantity(Integer.parseInt(qnty));
						qn = "quanty";
					} else {
						System.out.println("Enter Quantity in integer format");
					}
				}
				
				boolean check = false;
				try {
				check = services.addContractor(user);
				}catch(FmsException e) {
					System.out.println(e.toString());
				}
				if(check) {
					System.out.println("Contractor added successfully...");
				}
//				else {
//					System.out.println("Contractor number is not valid");
//				}
				break;
			case 2:

				int i1 = 0;
				boolean c1 = true;
				while (c1 == true) {
					System.out.println("Enter contractor number to delete the customer:");
					String contractNum = sc.next();
					if (Validations.isValidId(contractNum)) {
						i1 = Integer.parseInt(contractNum);
						c1 = false;
						user.setContractorNum(i1);
					} else {
						System.out.println("Please Enter digits only");
					}
				}


				boolean check1 = false;
				try {
				 check1 = services.deleteContractor(i1);
				}catch(FmsException e) {
					System.out.println(e.toString());
				}
				if(check1) {
					System.out.println("Contractor deleted successfully...");
				}
//				else {
//					System.out.println("Contractor is not deleted ");
//				}
				break;
			case 3:
				List<ContractBean> list = services.getAllContractor(user);
				if (!list.isEmpty()) {
						System.out.println(list);
				} else {
					System.out.println("contract not found");
				}
				break;
			case 4:
				Client.client(args);
				break;
			default:
				System.out.println("Please Enter the valid field..");
				break;
			}
		}
	}
}
