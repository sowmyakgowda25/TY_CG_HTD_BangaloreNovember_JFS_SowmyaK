package com;

public class Registration {

	public static void main(String[] args) {
		int age = 0;
		if(age>18)
		{
			System.out.println("Registration process\n");
		}
		else
		{
			try
			{
				AgeInvalidException Obj=new AgeInvalidException();
				throw Obj;
			}
			catch(AgeInvalidException A)
			{
				System.out.println("Age limit for Registration is above 18");
			}
		}
	}

}
