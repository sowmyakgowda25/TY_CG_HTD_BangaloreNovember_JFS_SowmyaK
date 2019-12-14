package staticandnonstatic;

public class Person {
	static int age;
	String name;
	
	void personDetails()
	{
		System.out.println("The person name is " +name+ " and person age is "+age);
		personDetailsStatic();
	}
	static void personDetailsStatic()
	{
		System.out.println(age);
	}
}

