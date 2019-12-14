
public class TestDemo5 {

	public static void main(String[] args) {
		Demo4 d1=new Demo4(28,"uday");
		System.out.println(d1.hashCode());
		 d1=new Demo4(22,"sara");
		System.out.println(d1.hashCode());
		
		int age=d1.getAge();
		String name=d1.getName();
		System.out.println(name);
		System.out.println(age);
	}

}
