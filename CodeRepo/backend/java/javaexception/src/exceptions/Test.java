package exceptions;

public class Test {
	
	void write() {
		String s1=null;
		try {
		System.out.println("length of the string is"+s1.length());
		}catch(NullPointerException e) {
			System.out.println("dont deal with null");
		}
	}
	public static void main(String[] args) {
		System.out.println("main started");
		Test t=new Test();
		t.write();
		System.out.println("main ended");
	}
	

}
