import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSet2 {
public static void main(String[] args) {
		
		LinkedHashSet<String> l1 = new LinkedHashSet<String>();
		
		l1.add("Uday");
		l1.add("gautham");
		l1.add("suma");
		l1.add("Uday");
		l1.add(null);
		
		Iterator<String> itr = l1.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
