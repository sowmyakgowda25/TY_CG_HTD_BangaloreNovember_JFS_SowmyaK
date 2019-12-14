
public class TestEmployee {

	public static void main(String[] args) {
		Employee e1=new Employee(28,"Uday pawar");
		System.out.println(e1.hashCode());
		System.out.println(e1);
		
		Employee e2=new Employee(23,"Sowmya");
		System.out.println(e2.hashCode());
		System.out.println(e2);
		Object o1=new Object();
	}

}
