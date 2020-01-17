package com.capgemini.fms_jdbc.controller;

import java.util.List;
import java.util.Scanner;

import com.capgemini.fms_jdbc.bean.LandBean;
import com.capgemini.fms_jdbc.exception.FmsException;
import com.capgemini.fms_jdbc.factory.LandFactory;
import com.capgemini.fms_jdbc.services.LandServices;
import com.capgemini.fms_jdbc.validations.Validations;

public class Land {
	public static void land(String[] args) {

		LandBean user = new LandBean();
		LandServices services = LandFactory.instanceOfLandServices();
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("Press 1 to Add Land data");
			System.out.println("Press 2 to Modify Land Location");
			System.out.println("Press 3 to Modify Land Acre");
			System.out.println("Press 4 to delete Land data");
			System.out.println("Press 5 to get all Land details");
			System.out.println("Press 6 to back to LoginPage");

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
				String lId = "ab";
				while (lId == "ab") {
					System.out.println("Enter Land id");
					String id = sc.next();
					if (Validations.isValidId(id)) {
						user.setLandId(Integer.parseInt(id));
						lId = "st";
					} else {
						System.out.println("Please Enter Correct Id");
					}
				}

				System.out.println("Enter the Land Acre");
				double acre = sc.nextDouble();
				user.setLandAcre(acre);

				String loc = "tt";
				while (loc == "tt") {
					System.out.println("Enter Land Location:");
					String location = sc.next();
					if (Validations.isValidName(location)) {
						user.setLandLocation(location);
						loc = "sss";
					} else {
						System.out.println("Please Enter Correct Location");
					}
				}
				try {
					if (services.addLand(user)) {
						System.out.println("Land inserted...");
					} else {
						System.err.println("something went wrong...");
					}
				} catch (FmsException e) {
					System.out.println(e.toString());
				}
				break;
			case 2:
				int i1 = 0;
				boolean l1 = true;
				while (l1 == true) {
					System.out.println("Enter Land id");
					String landId = sc.next();
					if (Validations.isValidId(landId)) {
						i1 = Integer.parseInt(landId);
						l1 = false;
						user.setLandId(i1);
					} else {
						System.out.println("Please Enter Correct Id");
					}
				}
				String landLocation = null;
				boolean lName = true;
				while (lName == true) {
					System.out.println("Enter Land location:");
					landLocation = sc.next();
					if (Validations.isValidName(landLocation)) {
						user.setLandLocation(landLocation);
						lName = false;
						user.setLandLocation(landLocation);
					} else {
						System.out.println("Please Enter Correct Name");
					}
				}

				boolean cname = false;
				try {
					cname = services.modifyLandLoc(i1, landLocation);
				} catch (FmsException e) {
					System.out.println(e.toString());
				}
				if (cname) {
					System.out.println("Land Name modified successfully...");
				} else {
					System.out.println("Land Name not modified");
				}
				break;

			case 3:
				int i6 = 0;
				boolean c6 = true;
				while (c6 == true) {
					System.out.println("Enter Land id");
					String id = sc.next();
					if (Validations.isValidId(id)) {
						i6 = Integer.parseInt(id);
						c6 = false;
						user.setLandId(i6);
					} else {
						System.out.println("Please Enter Correct Id");
					}
				}

				System.out.println("Enter the Land Acres :");
				double lAcre = sc.nextDouble();

				boolean post = false;
				try {
					post = services.modifyLandAcre(i6, lAcre);
				} catch (FmsException e) {
					System.out.println(e.toString());
				}
				if (post) {
					System.out.println("Land Acres modified successfully...");
				} else {
					System.out.println("Land Acres not modified");
				}
				break;
			case 4:
				int i11 = 0;
				boolean c1 = true;
				while (c1 == true) {
					System.out.println("Enter id to delete the Land details");
					String landId = sc.next();
					if (Validations.isValidId(landId)) {
						i11 = Integer.parseInt(landId);
						c1 = false;
						user.setLandId(i11);
					} else {
						System.out.println("Please Enter digits only");
					}
				}

				boolean b1 = false;
				try {
					b1 = services.deleteLand(i11);
				} catch (FmsException e) {
					System.out.println(e.toString());
				}
				if (b1) {
					System.out.println("Land deleted...");
				} else {
					System.out.println("Id does not exist...");
				}
				break;

			case 5:
				List<LandBean> list = services.getAllLand(user);
				if (list != null) {
					for (LandBean bean : list) {
						System.out.println(bean);
					}
				} else {
					System.out.println("Customer not found");
				}
				break;
			case 6:
				LoginPage.login(args);
				break;
			default:
				System.err.println("Entered Wrong field...");
				break;
			}
		}

	}
}
