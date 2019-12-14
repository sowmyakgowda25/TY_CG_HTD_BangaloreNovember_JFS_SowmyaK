
public class Employee1 implements Comparable<Employee1> {
	int eAge;
	String eName;
	Double salary;
	public Employee1(int eAge, String eName,double salary) {
		super();
		this.eAge = eAge;
		this.eName = eName;
		this.salary=salary;
	}
		
	@Override
	public String toString() {
		return "Employee [eAge=" + eAge + ", eName=" + eName + ", salary="+ salary+ "]";
	}

	@Override
	public int compareTo(Employee1 o) {
		return this.eName.compareTo(o.eName);
	}
	
	
}

