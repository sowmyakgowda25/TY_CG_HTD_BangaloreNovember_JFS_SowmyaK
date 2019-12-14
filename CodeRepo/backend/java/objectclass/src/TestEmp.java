
public class TestEmp {
	public static void main(String[] args) {
		Employee1 e1=new Employee1(243,"uday");
		Employee1 e2=new Employee1(243,"uday");
		
		System.out.println(e1.equals(e2));
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
	}
}
