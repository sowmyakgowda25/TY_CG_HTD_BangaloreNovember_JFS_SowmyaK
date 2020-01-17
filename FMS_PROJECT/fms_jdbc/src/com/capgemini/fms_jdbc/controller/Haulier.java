package com.capgemini.fms_jdbc.controller;

import java.util.List;
import java.util.Scanner;

import com.capgemini.fms_jdbc.bean.HaulierBean;
import com.capgemini.fms_jdbc.exception.FmsException;
import com.capgemini.fms_jdbc.factory.HaulierFactory;
import com.capgemini.fms_jdbc.services.HaulierServices;
import com.capgemini.fms_jdbc.validations.Validations;

public class Haulier {

	public static void haulier(String[] args) {

		HaulierBean user = new HaulierBean();
		HaulierServices services = HaulierFactory.instanceOfHaulierServices();
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("Press 1 to Add Haulier data");
			System.out.println("Press 2 to Modify Haulier data");
			System.out.println("Press 3 to delete Haulier data");
			System.out.println("Press 4 to get all Haulier data");
			System.out.println("Press 5 to back to HomePage");

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
				String hId="ab";
				while(hId=="ab") {
					System.out.println("Enter Haulier id");
					String id=sc.next();
					if(Validations.isValidId(id)) {
						user.setHaulierId(Integer.parseInt(id));
						hId="st";
					}else {
						System.out.println("Please Enter Correct Id");
					}
				}


				String hName="sonu";
				while(hName=="sonu") {
					System.out.println("Enter Haulier name:");
					String name=sc.next();
					if(Validations.isValidName(name)) {
						user.setHaulierName(name);
						hName="sss";
					}else {
						System.out.println("Please Enter Correct Name");
					}
				}

				System.out.println("Enter Haulier streetAddress:");
				String address=sc.next();
				user.setStreetAddress(address);

				String hTown ="ug";
				while(hTown=="ug") {
					System.out.println("Enter Haulier town:");
					String town=sc.next();
					if(Validations.isValidName(town)) {
						user.setTown(town);
						hTown="df";
					}else {
						System.out.println("Enter the Correct Town Name");
					}
				}

				String hc="code";
				while(hc=="code") {
					System.out.println("Enter Haulier postalCode:");
					String postalCode=sc.next();
					if(Validations.isValidPostal(postalCode)) {
						user.setPostalCode(Integer.parseInt(postalCode));
						hc="pcode";
					}else {
						System.out.println("Enter 6 digits only");
					}
				}

				String em="mail";
				while(em=="mail") {
					System.out.println("Enter Haulier Email:");
					String email=sc.next();
					if(Validations.isValidEmail(email)) {
						user.setEmail(email);
						em="email";
					}else {
						System.out.println("Enter the Email in Correct Formate");
					}
				}

				String ph="tele";
				while(ph=="tele") {
					System.out.println("Enter Haulier TelePhoneNumber:");
					String phone=sc.next();
					if(Validations.isValidPhoneNo(phone)) {
						user.setTelephoneNumber(Long.parseLong(phone));
						ph="telephone";
					}else {
						System.out.println("Enter Valid Phone Number ");
					}
				}

				try {
					if(services.addHaulier(user)) {
						System.out.println("Haulier inserted...");
					}else
					{
						System.err.println("something went wrong...");
					}
				} catch (FmsException e) {
					System.out.println(e.toString());
				}

				break;
			case 2:
				System.out.println("Enter the field to modify\n1.haulierName\n2.streetAddress\n3.PosatlCode\n4.Town\n5.Email\n6.TelephoneNumber\n7 Back to Customer");

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
					int i1=0;
					boolean c1 = true;
					while(c1==true) {
						System.out.println("Enter haulier id");
						String cid=sc.next();
						if(Validations.isValidId(cid)) {
							i1 = Integer.parseInt(cid);
							c1=false;
							user.setHaulierId(i1);
						}else {
							System.out.println("Please Enter Correct Id");
						}
					}
					String haulierName=null;
					boolean cusName=true;
					while(cusName==true) {
						System.out.println("Enter haulier name:");
						haulierName=sc.next();
						if(Validations.isValidName(haulierName)) {
							user.setHaulierName(haulierName);
							cusName=false;
							user.setHaulierName(haulierName);
						}else {
							System.out.println("Please Enter Correct Name");
						}
					}
					boolean cname = false;
					try {
						cname = services.modifyHaulierName(i1,haulierName);
					} catch (FmsException e) {
						System.out.println(e.toString());
					}
					if(cname) {
						System.out.println("Haulier Name modified successfully...");
					}else{
						System.out.println("Haulier Name not modified");
					}
					break;
				case 2:
					int i2=0;
					boolean c2 = true;
					while(c2==true) {
						System.out.println("Enter haulier id");
						String id=sc.next();
						if(Validations.isValidId(id)) {
							i2 = Integer.parseInt(id);
							c2=false;
							user.setHaulierId(i2);
						}else {
							System.out.println("Please Enter Correct Id");
						}
					}
					String addresss=null;
					boolean cusAdd=true;
					while(cusAdd==true) {
						System.out.println("Enter customer streetAddress:");
						addresss=sc.next();
						if(Validations.isValidName(addresss)) {
							user.setStreetAddress(addresss);
							cusAdd=false;
							user.setStreetAddress(addresss);
						}else {
							System.out.println("Please Enter Correct Address");
						}
					}
					boolean cAdd = false;
					try {
						cAdd = services.modifyHaulierAddress(i2,addresss);
					} catch (FmsException e) {
						System.out.println(e.toString());
					}
					if(cAdd) {
						System.out.println("Haulier Address modified successfully...");
					}else{
						System.out.println("Haulier not modified");
					}
					break;

				case 3:
					int i6=0;
					boolean c6 = true;
					while(c6==true) {
						System.out.println("Enter Haulier id");
						String id=sc.next();
						if(Validations.isValidId(id)) {
							i6 = Integer.parseInt(id);
							c6=false;
							user.setHaulierId(i6);
						}else {
							System.out.println("Please Enter Correct Id");
						}
					}
					int postCode = 0;
					boolean pcode=true;
					while(pcode==true) {
						System.out.println("Enter Haulier PostalCode:");
						String psCode=sc.next();
						if(Validations.isValidId(psCode)) {
							postCode = Integer.parseInt(psCode);
							pcode=false;
							user.setPostalCode(postCode);
						}else {
							System.out.println("Please Enter Correct Address");
						}
					}
					boolean post = false;
					try {
						post = services.modifyHaulierPostalCode(i6,postCode);
					} catch (FmsException e) {
						System.out.println(e.toString());
					}
					if(post) {
						System.out.println("Haulier postalCode modified successfully...");
					}else{
						System.out.println("Haulier postalcode not modified");
					}

					break;
				case 4:
					int i5=0;
					boolean c5 = true;
					while(c5==true) {
						System.out.println("Enter Haulier id");
						String id=sc.next();
						if(Validations.isValidId(id)) {
							i5 = Integer.parseInt(id);
							c5=false;
							user.setHaulierId(i5);
						}else {
							System.out.println("Please Enter Correct Id");
						}
					}
					String email=null;
					boolean cEmail=true;
					while(cEmail==true) {
						System.out.println("Enter Haulier Email:");
						email=sc.next();
						if(Validations.isValidName(email)) {
							user.setEmail(email);
							cEmail=false;
							user.setEmail(email);
						}else {
							System.out.println("Please Enter Correct Emailaddress");
						}
					}
					boolean emails = false;
					try {
						emails = services.modifyHaulierEmail(i5,email);
					} catch (FmsException e) {
						System.out.println(e.toString());
					}
					if(emails) {
						System.out.println("Haulier Email modified successfully...");
					}else{
						System.out.println("Haulier Email not modified");
					}
					break;
				case 5:
					int i4=0;
					boolean c4 = true;
					while(c4==true) {
						System.out.println("Enter Haulier id");
						String id=sc.next();
						if(Validations.isValidId(id)) {
							i4 = Integer.parseInt(id);
							c4=false;
							user.setHaulierId(i4);
						}else {
							System.out.println("Please Enter Correct Id");
						}
					}
					String town=null;
					boolean ctown=true;
					while(ctown==true) {
						System.out.println("Enter Customer Town:");
						town=sc.next();
						if(Validations.isValidName(town)) {
							user.setTown(town);
							ctown=false;
							user.setTown(town);
						}else {
							System.out.println("Please Enter Correct Town Name");
						}
					}
					boolean town1 = false;
					try {
						town1 = services.modifyHaulierTown(i4,town);
					} catch (FmsException e) {
						System.out.println(e.toString());
					}
					if(town1) {
						System.out.println("Haulier Town modified successfully...");
					}else{
						System.out.println("Haulier town not modified");
					}

				break;
				case 6:
					int i7=0;
					boolean c7 = true;
					while(c7==true) {
						System.out.println("Enter Haulier id");
						String id=sc.next();
						if(Validations.isValidId(id)) {
							i7 = Integer.parseInt(id);
							c7=false;
							user.setHaulierId(i7);
						}else {
							System.out.println("Please Enter Correct Id");
						}
					}
					long telePhone = 0;
					boolean phone=true;
					while(phone==true) {
						System.out.println("Enter Haulier Telephone Number:");
						String telephone=sc.next();
						if(Validations.isValidPhoneNo(telephone)) {
							telePhone = Long.parseLong(telephone);
							phone=false;
							user.setTelephoneNumber(telePhone);
						}else {
							System.out.println("Please Enter Correct Number");
						}
					}
					boolean tele = false;
					try {
						tele = services.modifyHaulierTelePhoneNum(i7,telePhone);
					} catch (FmsException e) {
						System.out.println(e.toString());
					}
					if(tele) {
						System.out.println("Haulier Phone number modified successfully...");
					}else{
						System.out.println("Haulier phone number not modified");
					}
					break;
				case 7:
						Haulier.haulier(args);
					break;
				default : System.err.println("Entered Wrong field...");
				}
				break;


			case 3:
				int i1 = 0;
				boolean c1 = true;
				while (c1 == true) {
					System.out.println("Enter id to delete the Haulier details");
					String haulierId = sc.next();
					if (Validations.isValidId(haulierId)) {
						i1 = Integer.parseInt(haulierId);
						c1 = false;
						user.setHaulierId(i1);
					} else {
						System.out.println("Please Enter digits only");
					}
				}

				boolean b1 = false;
				try {
					b1 = services.deleteHaulier(i1);
				} catch (FmsException e) {
					System.out.println(e.toString());
				}
				if(b1) {
					System.out.println("Haulier deleted...");
				}	else {
					System.out.println("Something went wrong...");
				}

				break;

			case 4:List<HaulierBean> list = services.getAllHaulier();
			if(list != null){
				for(HaulierBean bean:list) {
					System.out.println(bean);
				}
			}else 
			{
				System.out.println("Haulier not found");
			}

			break;
			case 5:Home.main(args);
			break;
			default: 
				System.err.println("Entered Wrong field...");
				break;
			}
		}
	}
}
