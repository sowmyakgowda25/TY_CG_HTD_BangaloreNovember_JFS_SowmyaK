package bankaccount;

import java.util.Scanner;

public class Accounts 
{  
	private static void menuoptions() 
	{
		System.out.println("1-Display All");
		System.out.println("2-Search By Account");
		System.out.println("3-Deposit");
		System.out.println("4-Withdrawal");
		System.out.println("5-Exit");
	}
	public static void main(String arg[])
	{
		@SuppressWarnings("resource")
		Scanner scn1=new Scanner(System.in);
		System.out.print("How Many Customer U Want to Input : ");
		int n=scn1.nextInt();
		BankAcc  C[]=new BankAcc[n];
		for(int i=0;i<C.length;i++)
		{   
			C[i]=new BankAcc();
			C[i].openAccount();
		}
		while(true) {
			menuoptions();
			int ans=scn1.nextInt();
			switch(ans)
			{ 
				case 1:
					for(int i=0;i<C.length;i++)
					{
						C[i].showAccount();
					}
					break;

				case 2:
					System.out.print("Enter Account No U Want to Search...: ");
					String acn=scn1.next();
					boolean found=false;
					for(int i=0;i<C.length;i++)
					{  
						found=C[i].search(acn);
						if(found)
						{
							break;
						}
					}
					if(!found)
					{
						System.out.println("Search Failed..Account Not Exist..");
					}
					break;

				case 3:
					System.out.print("Enter Account No : ");
					acn=scn1.next();
					found=false;
					for(int i=0;i<C.length;i++)
					{  
						found=C[i].search(acn);
						if(found)
						{
							C[i].deposit();
							break;
						}
					}
					if(!found)
					{
						System.out.println("Search Failed..Account Not Exist..");
					}
					break;

				case 4:
					System.out.print("Enter Account No : ");
					acn=scn1.next();
					found=false;
					for(int i=0;i<C.length;i++)
					{  
						found=C[i].search(acn);
						if(found)
						{
							C[i].withdrawal();
							break;
						}
					}
					if(!found)
					{
						System.out.println("Search Failed..Account Not Exist..");
					}
					break;

				case 5:
					System.out.println("Good Bye..");
					break;
				default:System.out.println("please choose any of below options");
				menuoptions();
				}
			}
	
			
		}
	}

