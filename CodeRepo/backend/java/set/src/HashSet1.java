import java.util.HashSet;

public class HashSet1 {

	public static void main(String[] args) {
		HashSet hs = new HashSet();
		hs.add(23);
		hs.add(45);
		hs.add(56);
		hs.add(12);
		hs.add(null);
		
		for(Object o1:hs) {
			System.out.println(o1);
		}
		
		HashSet<String> hs1 = new HashSet<String>();
		hs.add("Uday");
		hs.add("pawar");
		hs.add("Sara");
		hs.add("Roshan");
		hs.add(null);
		
		for(Object o1:hs) {
			System.out.println(o1);
		}
}
}