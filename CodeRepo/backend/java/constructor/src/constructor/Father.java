package constructor;

public class Father {
	String fName;
	int fAge;
	
	Father(){
		System.out.println("A");
	}
	Father(String name,int age){
		this();
		fName=name;
		fAge=age;
		System.out.println("B");
	}

}
