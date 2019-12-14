import java.util.LinkedList;

public class Linkedlist2 {

	public static void main(String[] args) {
		LinkedList l1 = new LinkedList();
		l1.add(23);
		l1.add(34);
		l1.add(67);
		l1.add(56);
		System.out.println("---------peek,peekFirst,peekLast------");
		System.out.println(l1.peek());
		System.out.println(l1.peekFirst());
		System.out.println(l1.peekLast());
		System.out.println(l1);
		
		System.out.println("----------poll,pollFisrt,pollLast--------");
		System.out.println(l1.poll());
		System.out.println(l1.pollFirst());
		System.out.println(l1.pollLast());
		System.out.println(l1);
		
		System.out.println("-----------offer,offerFirst,offerLast-----------");
		
		l1.offer(78);
		System.out.println(l1);
		l1.offerFirst(34);
		System.out.println(l1);
		l1.offerLast(98);
		System.out.println(l1);
	}
	
}
