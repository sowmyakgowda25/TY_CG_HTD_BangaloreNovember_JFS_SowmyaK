package bankaccount;

import java.util.Scanner;

public class BankAcc 
{
	private String accno;
	private String name;
	private long balance;

	Scanner scn1=new Scanner(System.in);
		
		void openAccount()
		{ 
			System.out.print("Enter Account No: ");
			accno=scn1.next();
			System.out.print("Enter Name: ");
			name=scn1.next();
			System.out.print("Enter Balance: ");
			balance=scn1.nextLong();
		}

		
		void showAccount()
		{ 
			System.out.println(accno+","+name+","+balance);
		}

		
		void deposit()
		{
			long amt;
			System.out.println("Enter Amount U Want to Deposit : ");
			amt=scn1.nextLong();
			balance=balance+amt;
		}

		
		void withdrawal()
		{
			long amt;
			System.out.println("Enter Amount U Want to withdraw : ");
			amt=scn1.nextLong();
			if(balance>=amt)
			{ 
				balance=balance-amt;
			}
			else
			{
				System.out.println("Less Balance..Transaction Failed..");
			}
		}

		boolean search(String acn)
		{ 
			if(accno.equals(acn))
			{ 
				showAccount();
				return(true);
			}
			return(false);
		}
	}