package com.capgemini.fms_jdbc.controller;

import java.util.List;
import java.util.Scanner;

import com.capgemini.fms_jdbc.bean.ContractBean;
import com.capgemini.fms_jdbc.exception.FmsException;
import com.capgemini.fms_jdbc.factory.ContractFactory;
import com.capgemini.fms_jdbc.services.ContractServices;
import com.capgemini.fms_jdbc.validations.Validations;

public class Contract {

	public static void contract(String[] args) {
		ContractBean user = new ContractBean();
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		ContractServices services = ContractFactory.instanceOfContractorServices();

		while (true) {
			System.out.println("Press 1 to insert contractor data");
			System.out.println("Press 2 to delete contractor data");
			System.out.println("Press 3 to get all the contractor");
			System.out.println("Press 4 to back to Client Page");

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

				try {
					if (services.addContractor(user)) {
						System.out.println("Contractor inserted...");
					} else {
						System.err.println("something went wrong...");
					}
				} catch (FmsException e) {
					System.out.println(e.toString());
				}
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

				boolean b1 = false;
				try {
					b1 = services.deleteContractor(i1);
				} catch (FmsException e) {
					System.out.println(e.toString());
				}
				if (b1) {
					System.out.println("Contractor deleted successfully...");
				} else {
					System.out.println("Something went wrong...");
				}
				break;
			case 3:
				List<ContractBean> list = services.getAllContractor();
				if (list != null) {
					for (ContractBean bean : list) {
						System.out.println(bean);
					}
				} else {
					System.out.println("contractor not found");
				}
				break;
			case 4:
				Client.client(args);
				break;
			default:
				System.out.println("Entered wrong field");
				break;

			}
		}
	}
}
