package boxigandunboxing;

public class TestA {
	public static void main(String[] args) {
		int i=10;
		//Boxing
		Integer i1=new Integer(i);
		//Unboxing
		int i2=i1.intValue();
		
		
		double d1=34.5;
		//Boxing
		Double d2=new Double(d1);
		//Unboxing
		double d3=d2.doubleValue();
		
		System.out.println(i1);
		System.out.println(i2);
		System.out.println(i);
		
		System.out.println(d2);
		System.out.println(d3);
		System.out.println(d1);
	}
}
