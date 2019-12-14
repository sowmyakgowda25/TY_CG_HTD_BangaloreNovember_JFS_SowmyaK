
public class Demo1 {
	public static void main(String[] args) {
		String s1="Uday";
		System.out.println("s1 hashcode value is "+s1.hashCode());
		String s2="pawar";
		s1="sanath";
		String s3="Uday";
		System.out.println("s1 hashcode value is "+s1.hashCode());
		
		System.out.println("s3 hashcode value is "+s3.hashCode());
	}
	
}
