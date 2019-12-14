package loosecoupling;

public class TestPerson {

	public static void main(String[] args) {
		Person p1=new Person();
		Atm a1=new Atm();
		
		Sbi s1=new Sbi();
		Hdfc h1=new Hdfc();
		
		p1.withdrawing(s1);
	}

}
