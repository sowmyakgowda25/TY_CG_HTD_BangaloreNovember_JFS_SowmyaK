import java.util.LinkedList;

public class Linkedlist1 {

	public static void main(String[] args) {
		LinkedList l1=new LinkedList();
		l1.add(12);
		l1.add(34);
		l1.add(56);
		l1.add(34);
		l1.add(98);
		
		System.out.println(l1);
		l1.addFirst(45);
		l1.addLast(67);
		System.out.println(l1);
		
		System.out.println("---------remove(),removeFirst,removeLast-----------");
		
		l1.remove();
		System.out.println(l1);
		l1.removeFirst();
		System.out.println(l1);
		l1.removeLast();
		System.out.println(l1);
		
		System.out.println("----------removeFirstOccurence,removeLastOccurence-------");
		
		LinkedList l2=new LinkedList();
		l2.add(12);
		l2.add(34);
		l2.add(56);
		l2.add(34);
		l2.add(98);
		System.out.println(l2);
		
		l2.removeFirstOccurrence(34);
		System.out.println(l2);
		l2.removeLastOccurrence(34);
		System.out.println(l2);
		System.out.println("-------------------------------------");
		System.out.println(l2.getFirst());
		System.out.println(l2.getLast());
		
	}

}
