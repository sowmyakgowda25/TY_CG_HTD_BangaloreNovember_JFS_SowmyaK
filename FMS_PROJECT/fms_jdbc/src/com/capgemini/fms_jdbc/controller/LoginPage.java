package com.capgemini.fms_jdbc.controller;

import java.util.List;
import java.util.Scanner;

import com.capgemini.fms_jdbc.bean.ContractBean;
import com.capgemini.fms_jdbc.bean.LoginBean;
import com.capgemini.fms_jdbc.bean.ProductBean;
import com.capgemini.fms_jdbc.exception.FmsException;
import com.capgemini.fms_jdbc.factory.AdminFactory;
import com.capgemini.fms_jdbc.factory.ContractFactory;
import com.capgemini.fms_jdbc.factory.ProductFactory;
import com.capgemini.fms_jdbc.services.AdminService;
import com.capgemini.fms_jdbc.services.ContractServices;
import com.capgemini.fms_jdbc.services.ProductServices;
import com.capgemini.fms_jdbc.validations.Validations;

public class LoginPage {
	public static void login(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		LoginBean bean = new LoginBean();
		ContractBean user = new ContractBean();
		ProductBean pUser = new ProductBean();
		AdminService services = AdminFactory.instanceOfAdminServices();
		ContractServices services1 = ContractFactory.instanceOfContractorServices();
		ProductServices services2 = ProductFactory.instanceOfProductServices();

		try {
			while (true) {
				System.out.println("press 1 to insert Client");
				System.out.println("press 2 for remove Client");
				System.out.println("Press 3 for Show All clients ");
				System.out.println("Press 4 for add the Contractor");
				System.out.println("Press 5 for View the Contracts");
				System.out.println("Press 6 for Add Product");
				System.out.println("Press 7 for View the Products");
				System.out.println("press 8 for Land details");
				System.out.println("press 9 for Home");

				String choice1 = null;
				String in1 = "switch";
				while (in1 == "switch") {
					choice1 = sc.next();
					if (Validations.isValidId(choice1)) {
						in1 = "st";
					} 
//					else {
//						System.out.println("Please Enter digits only");
//					}

					switch (Integer.parseInt(choice1)) {
					case 1:
						String clId = "ab";
						while (clId == "ab") {
							System.out.println("Enter Client id");
							String Id = sc.next();
							if (Validations.isValidId(Id)) {
								bean.setId(Integer.parseInt(Id));
								clId = "st";
							} else {
								System.out.println("Please Enter Correct Id");
							}
						}

						String client1 = "qunty";
						while (client1 == "qunty") {
							System.out.println("Enter Client Name:");
							String clientName = sc.next();
							if (Validations.isValidName(clientName)) {
								bean.setAdminName(clientName);
								client1 = "quanty";
							} else {
								System.out.println("Enter correct name");
							}
						}
						String pwd = "qunty";
						while (pwd == "qunty") {
							System.out.println("Enter Password");
							String password = sc.next();
							if (Validations.passwordFormat(password) == 10) {
								pwd = "quanty";
								bean.setPassword(password);
							} else {
								System.out.println("Enter correct format..");
							}
						}

						String type1 = "door";
						while (type1 == "door") {
							System.out.println("Enter the Type ");
							String clientType = sc.next();
							if (Validations.isValidName(clientType)) {
								bean.setType(clientType);
								type1 = "doors";
							} else {
								System.out.println("Please enter valid type");
							}
						}

						try {
							if (services.addClient(bean)) {
								System.out.println("Client inserted...");
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
							System.out.println("Enter Client Id to delete the Client:");
							String clientNum = sc.next();
							if (Validations.isValidId(clientNum)) {
								i1 = Integer.parseInt(clientNum);
								c1 = false;
								bean.setId(i1);
							} else {
								System.out.println("Please Enter digits only");
							}
						}

						boolean check1 = false;
						try {
							check1 = services.deleteClient(i1);
						} catch (FmsException e) {
							e.toString();
						}
						if (check1) {
							System.out.println("Client deleted successfully...");
						} else {
							System.out.println("Client is not deleted ");
						}
						break;

					case 3:
						List<LoginBean> list = services.getAllClient();
						if (list != null) {
							for (LoginBean c : list) {
								System.out.println(c);
							}
						} else {
							System.out.println("Client not found");
						}
						break;
					case 4:
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

						boolean checks = false;
						try {
							checks = services1.addContractor(user);
						} catch (FmsException e) {
							System.out.println(e.toString());
						}
						if (checks) {
							System.out.println("Contractor added successfully...");
						}
						break;

					case 5:
						List<ContractBean> lists = services1.getAllContractor();
						if (lists != null) {
							for (ContractBean beans : lists) {
								System.out.println(beans);
							}
						} else {
							System.out.println("contractor not found");
						}
						break;
					case 6:
						String prId = "bc";
						while (prId == "bc") {
							System.out.println("Enter Product Id");
							String id = sc.next();
							if (Validations.isValidId(id)) {
								pUser.setProductId(Integer.parseInt(id));
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
								pUser.setProductName(name);
								prName = "doors";
							} else {
								System.out.println("Please Enter Correct Name");
							}
						}

						boolean check2 = false;
						try {
							check2 = services2.addProduct(pUser);
						} catch (FmsException e) {
							System.out.println(e.toString());
						}
						if (check2) {
							System.out.println("Product added successfully...");
						} else {
							System.out.println("Product id is not valid");
						}
						break;
					case 7:
						List<ProductBean> list1 = services2.getAllProduct();
						if (list1 != null) {
							for (ProductBean bean1 : list1) {
								System.out.println(bean1);
							}
						} else {
							System.out.println("Product not found");
						}
						break;
					case 8:
						Land.land(args);
						break;
					case 9:
						Home.main(args);
						break;
					default:
						System.out.println("Entered wrong field");
						break;
					}
				}
			}
		} catch (Exception e) {
			try {
				throw new FmsException("Enter digits only");
			} catch (FmsException e1) {
				System.out.println(e1.toString());
				LoginPage.login(args);
			}
		}
	}
}
