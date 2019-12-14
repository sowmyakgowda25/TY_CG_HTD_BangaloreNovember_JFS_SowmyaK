import java.util.ArrayList;
import java.util.Collection;

public class Collection2 {

	public static void main(String[] args) {
		Collection c1=new ArrayList();
		
		c1.add("Uday pawar");
		c1.add("sowmya");
		System.out.println(c1);
		
		System.out.println(c1.size());
		
		System.out.println(c1.contains("Uday pawar"));
		
		c1.remove("sowmya");
		System.out.println(c1);
		
		System.out.println(c1.isEmpty());
	}

}
