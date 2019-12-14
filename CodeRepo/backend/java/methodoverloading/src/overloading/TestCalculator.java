package overloading;

public class TestCalculator {

	public static void main(String[] args) {
		Calculator c1= new Calculator();
		int r1=c1.add(12);
		System.out.println(r1);
		int r2=c1.add(20,40);
		System.out.println(r2);
		double r3=c1.add(12.25);
		System.out.println(r3);
		
		Calculator.multiply(24);
		Calculator.multiply(23, 6);
		Calculator.multiply(12.5);
	}

}
