package com.capgemini.fms_collection.controller;

import java.util.List;
import java.util.Scanner;

import com.capgemini.fms_collection.bean.ContractorBean;
import com.capgemini.fms_collection.exception.FmsException;
import com.capgemini.fms_collection.factory.ContractFactory;
import com.capgemini.fms_collection.service.ContractServices;
import com.capgemini.fms_collection.validations.Validations;

public class Contract{
	public static void contract(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc= new Scanner(System.in);
		ContractorBean bean = new ContractorBean();
		ContractServices services = ContractFactory.instanceOfContractorServices();
		while(true) {
			System.out.println("Press 1 to insert contractor data");
			System.out.println("Press 2 to delete contractor data");
			System.out.println("Press 3 to get all the contractor");
			System.out.println("Press 4 to back to HomePage");

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
				String cNo="ab";
				while(cNo=="ab") {
					System.out.println("Enter contractor number");
					String conNum=sc.next();
					if(Validations.isValidId(conNum)) {
						bean.setContractNo(Integer.parseInt(conNum));
						cNo="stu";
					}else {
						System.out.println("Please Enter Correct number");
					}
					//					System.out.println("Enter contractor number");
					//					String conNum=sc.next();
					//					try {
					//						Validations.isValidIdException(conNum);
					//							bean.setDeliveryDate(conNum);
					//							cNo="gate";
					//					}catch(IdMismatchException e) {
					//						e.printStackTrace();
					//					}
				}

				String cusId="ab";
				while(cusId=="ab") {
					System.out.println("Enter customer id");
					String custId=sc.next();
					if(Validations.isValidId(custId)) {
						bean.setCustomerId(Integer.parseInt(custId));
						cusId="st";
					}else {
						System.out.println("Please Enter Correct Id");
					}
				}

				String pdId="ab";
				while(pdId=="ab") {
					System.out.println("Enter product id");
					String pId=sc.next();
					if(Validations.isValidId(pId)) {
						bean.setProductId(Integer.parseInt(pId));
						pdId="st";
					}else {
						System.out.println("Please Enter Correct Id");
					}
				}

				String haId="ab";
				while(haId=="ab") {
					System.out.println("Enter haulier id");
					String hId=sc.next();
					if(Validations.isValidId(hId)) {
						bean.setHaulierId(Integer.parseInt(hId));
						haId="st";
					}else {
						System.out.println("Please Enter Correct Id");
					}
				}

				String d="date";
				while(d=="date") {
					System.out.println("Enter product delivery date");
					String date=sc.next();
					if(Validations.isValidDate(date)) {
						bean.setDeliveryDate(date);
						d="gate";
					}else {
						System.out.println("Enter the Date in Correct Format");
					}
					//					System.out.println("Enter product delivery date");
					//					String date=sc.next();
					//					try {
					//						Validations.isValidDate(date);
					//							bean.setDeliveryDate(date);
					//							//d="gate";
					//					}catch(DateMismatchException e) {
					//						e.printStackTrace();
					//					}
				}

				System.out.println("Enter product delivery day");
				String day=sc.next();
				bean.setDeliveryDay(day);

				String qn="qunty";
				while(qn=="qunty") {
					System.out.println("Enter product quantity:");
					String qnty=sc.next();
					if(Validations.isValidId(qnty)) {
						bean.setQuantity(Integer.parseInt(qnty));
						qn="quanty";
					}else {
						System.out.println("Enter Quantity in integer format");
					}
				}
				boolean check = false;
				try {
				check = services.addContractor(bean);
				}catch(FmsException e) {
					e.toString();
				}
				if(check) {
					System.out.println("Contractor added successfully...");
				}else {
					System.out.println("Contractor number is not valid");
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
						bean.setContractNo(i1);
					} else {
						System.out.println("Please Enter digits only");
					}
				}

				boolean check1 = false;
				try {
				 check1 = services.deleteContractor(i1);
				}catch(FmsException e) {
					e.toString();
				}
				if(check1) {
					System.out.println("Contractor deleted successfully...");
				}else {
					System.out.println("Contractor is not deleted ");
				}
				break;
			case 3:
				List<ContractorBean> list = services.getAllContractor(bean);
				if(!list.isEmpty()){
						System.out.println(list);
				}else {
					System.out.println("Contract Details not found");
				}
				break;
			case 4:HomePage.main(args);
			break;
			default: 
				break;
			}
		}
	}
}
