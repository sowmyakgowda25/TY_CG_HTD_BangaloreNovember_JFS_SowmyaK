package staticandnonstatic;

public class Testperson2 {

	public static void main(String[] args) {
		Person p2=new Person();
		p2.age=23;
		p2.name="sara";
		p2.personDetails();
		Person2 p3=new Person2();
		p3.initialize(24,"sanu");
	}

}
