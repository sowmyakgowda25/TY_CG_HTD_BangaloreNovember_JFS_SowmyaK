import java.util.TreeSet;

public class TreeSet1 {

	public static void main(String[] args) {
		EmployeeName e1 = new EmployeeName();
		EmployeeAge e2 = new EmployeeAge();
		EmployeeSalary e3 = new EmployeeSalary();
		
		TreeSet<Employee> t1=new TreeSet<Employee>(e3);
		
		t1.add(new Employee(28,"uday",35000.0));
		t1.add(new Employee(23,"sowmya",25000.0));
		t1.add(new Employee(27,"pawar",39000.0));
		
		for(Employee e:t1) {
			System.out.println("employee name is "+e.name);
			System.out.println("employee age is "+e.age);
			System.out.println("employee salary is "+e.salary);
			System.out.println("---------------------------------");
		}
	}
	}


