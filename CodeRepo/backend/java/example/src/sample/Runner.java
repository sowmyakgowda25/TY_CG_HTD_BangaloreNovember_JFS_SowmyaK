package sample;

public class Runner {

	public static void main(String[] args) 
	{
		String s1="A";
		String s2="B";
		System.out.println(s1.compareTo(s2));
		System.out.println(s2.compareTo(s1));
		System.out.println(s1.compareTo(s1));
		
		System.out.println("***************************************");
		
		Integer a=10;
		Integer b=20;
		System.out.println(a.compareTo(b));
		System.out.println(b.compareTo(a));
		System.out.println(b.compareTo(b));
		
		System.out.println("****************************************");
		
		Double x=3.14;
		Double y=5.34;
		System.out.println(x.compareTo(y));
		System.out.println(y.compareTo(x));
		System.out.println(x.compareTo(x));
	}

}
