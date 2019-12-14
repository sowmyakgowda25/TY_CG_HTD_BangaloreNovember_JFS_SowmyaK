import java.util.ArrayList;
import java.util.Collection;

public class Collection3 {

	public static void main(String[] args) {
		Collection c=new ArrayList();
		System.out.println("-------------addAll------------");
		c.add(12);
		c.add(24);
		
		Collection c1=new ArrayList();
		c1.add(34);
		c1.add(24);
		
		System.out.println(c);
		System.out.println(c.addAll(c1));
		System.out.println(c);
		
		System.out.println("-----------removeAll---------------");
		
		Collection c3=new ArrayList();
		c3.add(12);
		c3.add(24);
		
		Collection c4=new ArrayList();
		c4.add(34);
		c4.add(24);
		
		System.out.println(c3);
		System.out.println(c3.removeAll(c4));
		System.out.println(c3);
		
		System.out.println("-------------containsAll------------");
		
		Collection c5=new ArrayList();
		c5.add(12);
		c5.add(24);
		
		Collection c6=new ArrayList();
		c6.add(34);
		c6.add(24);
		
		System.out.println(c5);
		System.out.println(c5.containsAll(c6));
		System.out.println(c5);
		
		System.out.println("-------------retainAll------------");
		
		Collection c7=new ArrayList();
		c7.add(12);
		c7.add(24);
		
		Collection c8=new ArrayList();
		c8.add(34);
		c8.add(24);
		
		System.out.println(c7);
		System.out.println(c7.containsAll(c8));
		System.out.println(c8);
		
		System.out.println("--------------clear----------------");
		c8.clear();
		System.out.println(c8);
		System.out.println("----------------------------------");
		Collection a1=new ArrayList();
		a1.add(34);
		a1.add(25);
		Object a[]= a1.toArray();
		
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);			
		}
		
	}

}
