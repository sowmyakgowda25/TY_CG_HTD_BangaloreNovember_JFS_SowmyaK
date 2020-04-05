package com.capgemini.fms_jpahibernate.controller;

import java.util.List;
import java.util.Scanner;

import com.capgemini.fms_jpahibernate.dto.CustomerBean;
import com.capgemini.fms_jpahibernate.exception.FmsException;
import com.capgemini.fms_jpahibernate.factory.CustomerFactory;
import com.capgemini.fms_jpahibernate.service.CustomerServices;
import com.capgemini.fms_jpahibernate.validations.Validations;

public class Customer {
	public static void customer(String[] args) {

		CustomerBean user = new CustomerBean();
		CustomerServices services = CustomerFactory.instanceOfCustomerServices();
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("Press 1 to insert customer data");
			System.out.println("Press 2 to Modify customer data");
			System.out.println("Press 3 to delete customer data");
			System.out.println("Press 4 to get all customer data");
			System.out.println("Press 5 to back to Admin");

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
				// System.out.println("Enter customer id");
				// int id=sc.nextInt();
				String cId = "ab";
				while (cId == "ab") {
					System.out.println("Enter customer id");
					String id = sc.next();
					if (Validations.isValidId(id)) {
						user.setCustId(Integer.parseInt(id));
						cId = "st";
					} else {
						System.out.println("Please Enter Correct Id");
					}
				}
				// System.out.println("Enter customer name:");
				// String name=sc.next();
				String cName = "sanu";
				while (cName == "sanu") {
					System.out.println("Enter customer name:");
					String name = sc.next();
					if (Validations.isValidName(name)) {
						user.setCustName(name);
						cName = "sss";
					} else {
						System.out.println("Please Enter Correct Name");
					}
				}
				System.out.println("Enter customer streetAddress1:");
				String address1 = sc.next();
				user.setStreetAddress1(address1);

				System.out.println("Enter customer streetAddress2:");
				String address2 = sc.next();
				user.setStreetAddress2(address2);

				// System.out.println("Enter customer town:");
				// String town=sc.next();
				String cTown = "Mysore";
				while (cTown == "Mysore") {
					System.out.println("Enter customer town:");
					String town = sc.next();
					if (Validations.isValidName(town)) {
						user.setTown(town);
						cTown = "mandya";
					} else {
						System.out.println("Enter the Correct Town Name");
					}
				}

				// System.out.println("Enter customer postalCode:");
				// int postalCode=sc.nextInt();
				String pc = "code";
				while (pc == "code") {
					System.out.println("Enter customer postalCode:");
					String postalCode = sc.next();
					if (Validations.isValidPostal(postalCode)) {
						user.setPostalCode(Integer.parseInt(postalCode));
						pc = "pcode";
					} else {
						System.out.println("Enter 6 digits only");
					}
				}
				// System.out.println("Enter customer Email:");
				// String email=sc.next();
				String em = "mail";
				while (em == "mail") {
					System.out.println("Enter customer Email:");
					String email = sc.next();
					if (Validations.isValidEmail(email)) {
						user.setEmail(email);
						em = "email";
					} else {
						System.out.println("Enter the Email in Correct Formate");
					}
				}
				// System.out.println("Enter customer TelePhoneNumber:");
				// long phone=sc.nextLong();
				String ph = "tele";
				while (ph == "tele") {
					System.out.println("Enter customer TelePhoneNumber:");
					String phone = sc.next();
					if (Validations.isValidPhoneNo(phone)) {
						user.setTelephoneNumber(Long.parseLong(phone));
						ph = "telephone";
					} else {
						System.out.println("Enter Valid Phone Number ");
					}
				}

				try {
					if (services.addCustomer(user)) {
						System.out.println("Customer inserted...");
					} 
//					else {
//						System.err.println("something went wrong...");
//					}
				} catch (FmsException e) {
					System.out.println(e.toString());
				}
				break;
			case 2:
				System.out.println(
						"Enter the field to modify\n1.customerName\n2.streetAddress1\n3.streetAddress2\n4.Town\n5.Email\n6.PosatlCode\n7.TelephoneNumber\n8. Back to Customer");

				String choice1 = null;
				String in1 = "switch";
				while (in1 == "switch") {
					choice1 = sc.next();
					if (Validations.isValidId(choice1)) {
						in1 = "st";
					} else {
						System.out.println("Please Enter digits only");
					}
				}

				switch (Integer.parseInt(choice1)) {
				case 1:
					int i1 = 0;
					boolean c1 = true;
					while (c1 == true) {
						System.out.println("Enter customer id");
						String cid = sc.next();
						if (Validations.isValidId(cid)) {
							i1 = Integer.parseInt(cid);
							c1 = false;
							user.setCustId(i1);
						} else {
							System.out.println("Please Enter Correct Id");
						}
					}
					String customerName = null;
					boolean cusName = true;
					while (cusName == true) {
						System.out.println("Enter customer name:");
						customerName = sc.next();
						if (Validations.isValidName(customerName)) {
							user.setCustName(customerName);
							cusName = false;
							user.setCustName(customerName);
						} else {
							System.out.println("Please Enter Correct Name");
						}
					}
					boolean cname = false;
					try {
						cname = services.modifyCustomerName(i1, customerName);
					} catch (FmsException e) {
						System.out.println(e.toString());
					}
					if (cname) {
						System.out.println("Customer Name modified successfully...");
					} 
//					else {
//						System.out.println("customer Name not modified");
//					}
					break;
				case 2:
					int i2 = 0;
					boolean c2 = true;
					while (c2 == true) {
						System.out.println("Enter customer id");
						String id = sc.next();
						if (Validations.isValidId(id)) {
							i2 = Integer.parseInt(id);
							c2 = false;
							user.setCustId(i2);
						} else {
							System.out.println("Please Enter Correct Id");
						}
					}
					String address = null;
					boolean cusAdd = true;
					while (cusAdd == true) {
						System.out.println("Enter customer streetAddress1:");
						address = sc.next();
						if (Validations.isValidName(address)) {
							user.setCustName(address);
							cusAdd = false;
							user.setCustName(address);
						} else {
							System.out.println("Please Enter Correct Address");
						}
					}
					boolean cAdd = false;
					try {
						cAdd = services.modifyCustomerAddress1(i2, address);
					} catch (FmsException e) {
						System.out.println(e.toString());
					}
					if (cAdd) {
						System.out.println("Customer Address modified successfully...");
					} 
//					else {
//						System.out.println("customer not modified");
//					}
					break;
				case 3:
					int i3 = 0;
					boolean c3 = true;
					while (c3 == true) {
						System.out.println("Enter customer id");
						String id = sc.next();
						if (Validations.isValidId(id)) {
							i3 = Integer.parseInt(id);
							c3 = false;
							user.setCustId(i3);
						} else {
							System.out.println("Please Enter Correct Id");
						}
					}
					String address3 = null;
					boolean cusAdd1 = true;
					while (cusAdd1 == true) {
						System.out.println("Enter customer streetAddress2:");
						address3 = sc.next();
						if (Validations.isValidName(address3)) {
							user.setCustName(address3);
							cusAdd1 = false;
							user.setCustName(address3);
						} else {
							System.out.println("Please Enter Correct Address");
						}
					}
					boolean cAdd1 = false;
					try {
						cAdd1 = services.modifyCustomerAddress2(i3, address3);
					} catch (FmsException e) {
						System.out.println(e.toString());
					}
					if (cAdd1) {
						System.out.println("Customer Address modified successfully...");
					} 
//					else {
//						System.out.println("customer Address not modified");
//					}
					break;
				case 4:
					int i4 = 0;
					boolean c4 = true;
					while (c4 == true) {
						System.out.println("Enter customer id");
						String id = sc.next();
						if (Validations.isValidId(id)) {
							i4 = Integer.parseInt(id);
							c4 = false;
							user.setCustId(i4);
						} else {
							System.out.println("Please Enter Correct Id");
						}
					}
					String town = null;
					boolean ctown = true;
					while (ctown == true) {
						System.out.println("Enter Customer Town:");
						town = sc.next();
						if (Validations.isValidName(town)) {
							user.setCustName(town);
							ctown = false;
							user.setCustName(town);
						} else {
							System.out.println("Please Enter Correct Town Name");
						}
					}
					boolean town1 = false;
					try {
						town1 = services.modifyCustomerTown(i4, town);
					} catch (FmsException e) {
						System.out.println(e.toString());
					}
					if (town1) {
						System.out.println("Customer Town modified successfully...");
					}
//					else {
//						System.out.println("customer town not modified");
//					}
					break;
				case 5:
					int i5 = 0;
					boolean c5 = true;
					while (c5 == true) {
						System.out.println("Enter customer id");
						String id = sc.next();
						if (Validations.isValidId(id)) {
							i5 = Integer.parseInt(id);
							c5 = false;
							user.setCustId(i5);
						} else {
							System.out.println("Please Enter Correct Id");
						}
					}
					String email = null;
					boolean cEmail = true;
					while (cEmail == true) {
						System.out.println("Enter customer Email:");
						email = sc.next();
						if (Validations.isValidName(email)) {
							user.setCustName(email);
							cEmail = false;
							user.setCustName(email);
						} else {
							System.out.println("Please Enter Correct Emailaddress");
						}
					}
					boolean emails = false;
					try {
						emails = services.modifyCustomerEmail(i5, email);
					} catch (FmsException e) {
						System.out.println(e.toString());
					}
					if (emails) {
						System.out.println("Customer Email modified successfully...");
					} 
//					else {
//						System.out.println("customer Email not modified");
//					}
					break;
				case 6:
					int i6 = 0;
					boolean c6 = true;
					while (c6 == true) {
						System.out.println("Enter customer id");
						String id = sc.next();
						if (Validations.isValidId(id)) {
							i6 = Integer.parseInt(id);
							c6 = false;
							user.setCustId(i6);
						} else {
							System.out.println("Please Enter Correct Id");
						}
					}
					int postCode = 0;
					boolean pcode = true;
					while (pcode == true) {
						System.out.println("Enter Customer PostalCode:");
						String psCode = sc.next();
						if (Validations.isValidId(psCode)) {
							postCode = Integer.parseInt(psCode);
							pcode = false;
							user.setPostalCode(postCode);
						} else {
							System.out.println("Please Enter Correct Address");
						}
					}
					boolean post = false;
					try {
						post = services.modifyCustomerPostalCode(i6, postCode);
					} catch (FmsException e) {
						System.out.println(e.toString());
					}
					if (post) {
						System.out.println("Customer postalCode modified successfully...");
					} 
//					else {
//						System.out.println("customer postalcode not modified");
//					}
					break;
				case 7:
					int i7 = 0;
					boolean c7 = true;
					while (c7 == true) {
						System.out.println("Enter customer id");
						String id = sc.next();
						if (Validations.isValidId(id)) {
							i7 = Integer.parseInt(id);
							c7 = false;
							user.setCustId(i7);
						} else {
							System.out.println("Please Enter Correct Id");
						}
					}
					long telePhone = 0;
					boolean phone = true;
					while (phone == true) {

						System.out.println("Enter Customer Telephone Number:");
						String telephone = sc.next();
						if (Validations.isValidPhoneNo(telephone)) {
							telePhone = Long.parseLong(telephone);
							phone = false;
							user.setTelephoneNumber(telePhone);
						} else {
							System.out.println("Please Enter Correct Number");
						}
					}
					boolean tele = false;
					try {
						tele = services.modifyCustomerTelePhoneNum(i7, telePhone);
					} catch (FmsException e) {
						System.out.println(e.toString());
					}
					if (tele) {
						System.out.println("Customer Phone number modified successfully...");
					} 
//					else {
//						System.out.println("customer phone number not modified");
//					}
					break;
				case 8:
					Customer.customer(args);
					break;
				default:
					System.err.println("Entered Wrong field...");
					break;
				}
				break;
			case 3:
				int i1 = 0;
				boolean c1 = true;
				while (c1 == true) {
					System.out.println("Enter CustomerId to delete the Customer..");
					String cid = sc.next();
					if (Validations.isValidId(cid)) {
						i1 = Integer.parseInt(cid);
						c1 = false;
						user.setCustId(i1);
					} else {
						System.out.println("Please Enter digits only");
					}
				}

				boolean b1 = false;
				try {
					b1 = services.deleteCustomer(i1);
				} catch (FmsException e) {
					System.out.println(e.toString());
				}
				if (b1) {
					System.out.println("Customer deleted...");
				} 
//				else {
//					System.out.println("Something went wrong...");
//				}
				break;
			case 4:
				List<CustomerBean> list = services.getAllCustomers(user);
				if (!list.isEmpty()) {
						System.out.println(list);
				} else {
					System.out.println("Customer not found");
				}
				break;
			case 5:
				Admin.admin(args);
				break;
			default:
				System.out.println("Please Enter the valid field..");
				break;
			}
		}
	}

}