import java.util.LinkedList;

public class Linkedlist4 {
	public static void main(String[] args) {
		
		LinkedList l1= new LinkedList();
		
		l1.add(45);
		l1.add(34);
		l1.add(89);
		l1.push(56);
		System.out.println(l1);
		l1.pop();
		System.out.println(l1);
		System.out.println(l1.element());
		System.out.println(l1);
	}
}
