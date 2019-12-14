package multiplecatch;

public class TestExceptionB {
	public static void main(String[] args) {
		System.out.println("main started");
		ExceptioB e1=new ExceptioB();
		e1.exception(0,"uday");
		e1.exception(2, null);
	}

}
