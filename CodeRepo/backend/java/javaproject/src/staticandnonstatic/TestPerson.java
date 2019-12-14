package staticandnonstatic;

public class TestPerson {
	public static void main(String arr[])
	{
		Person p1=new Person();
		
		Person.age=23;
		p1.name="john";
		p1.personDetails();
	}

}
