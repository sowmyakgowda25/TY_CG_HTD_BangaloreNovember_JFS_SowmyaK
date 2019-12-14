import java.util.Stack;

public class Stack1 {

	public static void main(String[] args) {
		Stack s1 = new Stack();
		s1.add(56);
		s1.add(87);
		s1.add(34);
		s1.add(90);
		s1.push(100);
		System.out.println(s1);
		s1.pop();
		System.out.println(s1);
		System.out.println(s1.peek());
		System.out.println(s1);
		System.out.println(s1.search(new Integer(87)));
		System.out.println(s1);
		System.out.println(s1.search(new Integer(90)));
		
	}

}
