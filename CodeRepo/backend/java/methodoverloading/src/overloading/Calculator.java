package overloading;

public class Calculator {
	int add(int a) {
		return a+a;
	}
	int add(int a,int b) {
		return a+b;
	}
	double add(double a) {
		return a+a;
	}
	static void multiply(int a) {
		System.out.println("multiple of a is "+a);
	}
	static void multiply(int a,int b) {
		System.out.println("multiple of a and b is "+(a*b));
	}
	static void multiply(double a) {
		System.out.println("multiple of a is "+a);
	}
}
