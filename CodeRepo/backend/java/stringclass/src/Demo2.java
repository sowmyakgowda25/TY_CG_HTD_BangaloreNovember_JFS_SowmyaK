
public class Demo2 {

	public static void main(String[] args) {
		String s1=new String("uday");
		System.out.println("s1 hashcode value is "+s1.hashCode());
		String s2=new String("pawar");
		String s3= new String("uday");
		
		s1 = new String("sara");
		System.out.println("s1 hashcode value is "+s1.hashCode());
		System.out.println("s2 hashcode value is "+s2.hashCode());
		System.out.println("s3 hashcode value is "+s3.hashCode());
		
	}

}
