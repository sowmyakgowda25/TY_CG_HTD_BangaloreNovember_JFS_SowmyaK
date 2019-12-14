package multiplecatch;

public class TestExceptionA {

	public static void main(String[] args) {
		System.out.println("main started");
		Exception e1=new Exception();
		e1.exception(0,"uday");
		e1.exception(2, null);
	}

}
