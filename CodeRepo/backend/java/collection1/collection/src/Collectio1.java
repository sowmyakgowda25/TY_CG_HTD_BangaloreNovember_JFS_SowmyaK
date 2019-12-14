import java.util.ArrayList;
import java.util.Collection;

public class Collectio1 {

	public static void main(String[] args) {
		Collection c1=new ArrayList();
		
		//adding the element inside the arraylist
		c1.add(12);
		System.out.println(c1);
		
		//removing the element from the arraylist
		c1.remove(12);
		System.out.println(c1);
		
		//finding the size of collection
		System.out.println(c1.size());
		
		//checking the collection is empty or not
		System.out.println(c1.isEmpty());
		
		c1.add(12);
		
		//checking whether 12 object is present inside the collection or not
		System.out.println(c1.contains(12));
	}

}
