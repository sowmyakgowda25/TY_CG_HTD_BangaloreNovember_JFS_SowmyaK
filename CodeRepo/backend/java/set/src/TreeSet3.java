import java.util.TreeSet;
public class TreeSet3 {

	public static void main(String[] args) {
		TreeSet<Employee1> t2=new TreeSet<Employee1>();
		
		t2.add(new Employee1(23,"uday",35000));
		t2.add(new Employee1(23,"sowmya",25000));
		t2.add(new Employee1(23,"pawar",39000));
		
		for(Employee1 e1:t2) {
			System.out.println("employee name is "+e1.eName);
			System.out.println("employee age is "+e1.eAge);
			System.out.println("employee salary is "+e1.salary);
			System.out.println("---------------------------------");
		}
	}

}
