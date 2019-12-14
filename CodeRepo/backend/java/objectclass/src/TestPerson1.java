
public class TestPerson1 {
	public static void main(String[] args) throws Throwable {
		System.out.println("------main method started-------");
		Person1 p1=new Person1("Uday");
		p1.finalize();
		p1=null;
		System.gc();
		System.out.println("-------main method ended-------");
	}
}
