package com.capgemini.fms_jdbc.controller;

import java.util.List;
import java.util.Scanner;

import com.capgemini.fms_jdbc.bean.OrderBean;
import com.capgemini.fms_jdbc.exception.FmsException;
import com.capgemini.fms_jdbc.factory.OrderFactory;
import com.capgemini.fms_jdbc.services.OrderServices;
import com.capgemini.fms_jdbc.validations.Validations;

public class Order {
	public static void order(String[] args) {
		OrderBean user = new OrderBean();
		OrderServices services = OrderFactory.instanceOfOrderServices();
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		while (true) {
			
		System.out.println("Press 1 to insert order data");
		System.out.println("Press 2 to Modify order data");
		System.out.println("Press 3 to delete order data");
		System.out.println("Press 4 to get all order data");
		System.out.println("Press 5 to back to Admin");

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
			String cId = "ab";
			while (cId == "ab") {
				System.out.println("Enter Order Number");
				String orderNo = sc.next();
				if (Validations.isValidId(orderNo)) {
					user.setOrderNo(Integer.parseInt(orderNo));
					cId = "st";
				} else {
					System.out.println("Please Enter Correct Number");
				}
			}

			String cName = "sanu";
			while (cName == "sanu") {
				System.out.println("Enter customer name:");
				String name = sc.next();
				if (Validations.isValidName(name)) {
					user.setCustomerName(name);
					cName = "sss";
				} else {
					System.out.println("Please Enter Correct Name");
				}
			}


			String cTown = "Mysore";
			while (cTown == "Mysore") {
				System.out.println("Enter Product Name");
				String proName = sc.next();
				if (Validations.isValidName(proName)) {
					user.setProductName(proName);
					cTown = "mandya";
				} else {
					System.out.println("Enter the Correct Product");
				}
			}

			String pc = "code";
			while (pc == "code") {
				System.out.println("Enter the quantity:");
				String quantity = sc.next();
				if (Validations.isValidId(quantity)) {
					user.setQuantity(Integer.parseInt(quantity));
					pc = "pcode";
				} else {
					System.out.println("Enter digits only");
				}
			}

			String d="date";
			while(d=="date") {
				System.out.println("Enter product delivery date");
				String date=sc.next();
				if(Validations.isValidDate(date)) {
					user.setDeliveryDate(date);
					d="gate";
				}else {
					System.out.println("Enter the Date in Correct Format");
				}

				String hName = "sanu";
				while (hName == "sanu") {
					System.out.println("Enter customer name:");
					String haulierName = sc.next();
					if (Validations.isValidName(haulierName)) {
						user.setCustomerName(haulierName);
						hName = "sss";
					} else {
						System.out.println("Please Enter Correct Name");
					}
				}

				boolean check = false;
				try {
					check = services.addOrder(user);
				} catch (FmsException e) {
					System.out.println(e.toString());
				}
				if (check) {
					System.out.println("Order added successfully...");
				} else {
					System.out.println("Order number is not valid");
				}
			}
			break;
		case 2:
			System.out.println(
					"Enter the field to modify\n1.customerName\n2.ProductName\n3.quantity\n4.DeliveryDate\n5.HaulierName\n6.Back to Order");

			String choice1 = null;
			String in = "switch";
			while(in=="switch") {
				choice1 = sc.next();
				if (Validations.isValidId(choice1)) {
					in = "st";
				} else {
					System.out.println("Please Enter digits only");
				}
			}

			switch (Integer.parseInt(choice1)) {
			case 1:
				int i1 = 0;
				boolean c1 = true;
				while (c1 == true) {
					System.out.println("Enter order number");
					String cid = sc.next();
					if (Validations.isValidId(cid)) {
						i1 = Integer.parseInt(cid);
						c1 = false;
						user.setOrderNo(i1);
					} else {
						System.out.println("Please Enter Correct number");
					}
				}
				String customerName = null;
				boolean cusName = true;
				while (cusName == true) {
					System.out.println("Enter customer name:");
					customerName = sc.next();
					if (Validations.isValidName(customerName)) {
						user.setCustomerName(customerName);
						cusName = false;
						user.setCustomerName(customerName);
					} else {
						System.out.println("Please Enter Correct Name");
					}
				}

				boolean cname = false;
				try {
					cname = services.modifyCustomerName(i1, customerName);
				} catch (FmsException e) {
					e.toString();
				}
				if (cname) {
					System.out.println("Customer Name modified successfully...");
				} else {
					System.out.println("customer Name not modified");
				}
				break;
			case 2:
				int i2 = 0;
				boolean c2 = true;
				while (c2 == true) {
					System.out.println("Enter order number");

					String id = sc.next();
					if (Validations.isValidId(id)) {
						i2 = Integer.parseInt(id);
						c2 = false;
						user.setOrderNo(i2);
					} else {
						System.out.println("Please Enter Correct Id");
					}
				}
				String address = null;
				boolean cusAdd = true;
				while (cusAdd == true) {
					System.out.println("Enter Product Name");
					address = sc.next();
					if (Validations.isValidName(address)) {
						user.setProductName(address);
						cusAdd = false;
						user.setProductName(address);
					} else {
						System.out.println("Please Enter Correct Name");
					}
				}
				boolean cAdd = false;
				try {
					cAdd = services.modifyProductName(i2, address);
				} catch (FmsException e) {
					e.toString();
				}
				if (cAdd) {
					System.out.println("Product Name modified successfully...");
				} else {
					System.out.println("Product not modified");
				}
				break;
			case 3:
				int i4 = 0;
				boolean c4 = true;
				while (c4 == true) {
					System.out.println("Enter order number");
					String id = sc.next();
					if (Validations.isValidId(id)) {
						i4 = Integer.parseInt(id);
						c4 = false;
						user.setOrderNo(i4);
					} else {
						System.out.println("Please Enter Correct Number");
					}
				}
				int postCode = 0;
				boolean pcode = true;
				while (pcode == true) {
					System.out.println("Enter the Quantity");
					String psCode = sc.next();
					if (Validations.isValidId(psCode)) {
						postCode = Integer.parseInt(psCode);
						pcode = false;
						user.setQuantity(postCode);
					} else {
						System.out.println("Please digits only");
					}
				}
				boolean town1 = false;
				try {
					town1 = services.modifyOrderQuantity(i4, postCode);
				} catch (FmsException e) {
					e.toString();
				}
				if (town1) {
					System.out.println("Quantity modified successfully...");
				} else {
					System.out.println("Quantity not modified");
				}
				break;
			case 4:
				int i5 = 0;
				boolean c5 = true;
				while (c5 == true) {
					System.out.println("Enter order number");

					String id = sc.next();
					if (Validations.isValidId(id)) {
						i5 = Integer.parseInt(id);
						c5 = false;
						user.setOrderNo(i5);
					} else {
						System.out.println("Please Enter Correct number");
					}
				}
				String d1="date";
				while(d1=="date") {
					System.out.println("Enter product delivery date");
					String date=sc.next();
					if(Validations.isValidDate(date)) {
						user.setDeliveryDate(date);
						d1="gate";
					}else {
						System.out.println("Enter the Date in Correct Format");
					}

				boolean emails = false;
				try {
					emails = services.modifyDeliverDate(i5, date);
				} catch (FmsException e) {
					e.toString();
				}
				if (emails) {
					System.out.println(" Delivery Date modified successfully...");
				} else {
					System.out.println("Date Not modified");
				}
				}
				break;
			case 5:
				int i6 = 0;
				boolean c6 = true;
				while (c6 == true) {
					System.out.println("Enter order number");
					String id = sc.next();
					if (Validations.isValidId(id)) {
						i6 = Integer.parseInt(id);
						c6 = false;
						user.setOrderNo(i6);
					} else {
						System.out.println("Please Enter Correct Id");
					}
				}
				String address1 = null;
				boolean cusAdd1 = true;
				while (cusAdd1 == true) {
					System.out.println("Enter Haulier Name");
					address = sc.next();
					if (Validations.isValidName(address1)) {
						user.setProductName(address1);
						cusAdd1 = false;
						user.setHaulierName(address1);
					} else {
						System.out.println("Please Enter Correct Name");
					}
				}
				
				boolean post = false;
				try {
					post = services.modifyHaulierName(i6, address1);
				} catch (FmsException e) {
					e.toString();
				}
				if (post) {
					System.out.println("Haulier Name modified successfully...");
				} else {
					System.out.println("Haulier Name not modified");
				}
				break;
			case 6:
				Order.order(args);
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
					user.setOrderNo(i1);
				} else {
					System.out.println("Please Enter digits only");
				}
			}


			boolean check1 = false;
			try {
				check1 = services.deleteOrder(i1);
			} catch (FmsException e) {
				e.toString();
			}
			if (check1) {
				System.out.println("Order deleted successfully...");
			} else {
				System.out.println("Order is not deleted ");
			}

			break;

		case 4:
			List<OrderBean> list = services.getAllOrders();
			if (list != null) {
				for (OrderBean user1 : list) {
					System.out.println(user1);
				}
			} else {
				System.out.println("Order not found");
			}

			break;
		case 5:
			Admin.admin(args);
			break;
		default:
			System.err.println("Entered Wrong field...");
			break;
		}
	}
}

}
