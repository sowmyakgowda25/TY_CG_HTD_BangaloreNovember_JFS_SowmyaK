package exceptions;

public class Testcalculator {

	public static void main(String[] args) {
		System.out.println("main method started");
		calculator c1=new calculator();
		c1.divide(10, 0);
		System.out.println("main method ended");
	}

}
