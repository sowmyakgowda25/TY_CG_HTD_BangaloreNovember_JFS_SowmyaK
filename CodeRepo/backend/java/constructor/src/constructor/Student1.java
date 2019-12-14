package constructor;

public class Student1 extends Father{
	String sName;
	int sAge;
	
	Student1(){
		super("john",23);
		System.out.println("C");
	}
	Student1(String name,int age){
		this();
		sName=name;
		sAge=age;
		System.out.println("D");
		
	}
}
