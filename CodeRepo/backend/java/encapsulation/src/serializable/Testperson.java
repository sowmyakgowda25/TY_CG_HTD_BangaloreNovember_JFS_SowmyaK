package serializable;

public class Testperson {

	public static void main(String[] args) {
		Person p1=new Person();
		p1.setAge(28);
		p1.setName("Uday pawar");
		
		System.out.println(p1.getAge());
		System.out.println(p1.getName());
	}

}
