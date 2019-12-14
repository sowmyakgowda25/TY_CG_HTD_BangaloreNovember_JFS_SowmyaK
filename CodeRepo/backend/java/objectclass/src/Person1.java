
public class Person1 {
	String name;

	public Person1(String name) {
		super();
		this.name = name;
	}

	@Override
	protected void finalize() throws Throwable {
		super.finalize();
		System.out.println("finalize method called");
	}
	
}
