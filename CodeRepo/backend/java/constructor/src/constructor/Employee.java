package constructor;

public class Employee {
	String eName;
	int eAge;
	double eSalary;
	
	Employee(String name,int age,double sal){
		eName=name;
		eAge=age;
		eSalary=sal;
	}
	
	void details() {
		System.out.println("eName: "+eName+" eAge: "+eAge+" eSalary: "+eSalary);
	}
}
