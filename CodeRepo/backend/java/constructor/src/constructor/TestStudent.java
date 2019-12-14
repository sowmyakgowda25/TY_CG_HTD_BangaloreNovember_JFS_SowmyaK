package constructor;

public class TestStudent {

	public static void main(String[] args) {
		Student s1=new Student();
		System.out.println(s1.sName);
		System.out.println(s1.sAge);
		
		Student s2=new Student("sara",23);
		System.out.println(s2.sName);
		System.out.println(s2.sAge);
	}

}
