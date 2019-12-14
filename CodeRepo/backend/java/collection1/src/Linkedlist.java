import java.util.LinkedList;
import java.util.ListIterator;

public class Linkedlist {

	public static void main(String[] args) {
		LinkedList l1 = new LinkedList();
		l1.add(12);
		l1.add(2);
		l1.add(4);
		l1.add(12);
		
		ListIterator ltr = l1.listIterator();
		while(ltr.hasNext()) {
			System.out.println(ltr.next());
		}
		l1.add(null);
		System.out.println(l1);
		l1.remove(new Integer(12));
		System.out.println(l1);
		
		System.out.println("-----------forEach loop----------");
		for(Object o1:l1) {
			System.out.println(o1);
		}
		
		System.out.println("------------for loop-------------");
		for(int i=0;i<l1.size();i++) {
			System.out.println(l1.get(i));
		}
	}

}
