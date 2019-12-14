
public class Append {

	public static void main(String[] args) {
		StringBuffer s1=new StringBuffer("Uday");
		System.out.println(s1.hashCode());
		s1=s1.append("pawar");
		System.out.println(s1.hashCode());
	System.out.println("-------------------------------------");
		
	StringBuilder s2=new StringBuilder("Gautham");
	System.out.println(s2.hashCode());
	s2=s2.append("Gowda");
	System.out.println(s2.hashCode());
	}
}
