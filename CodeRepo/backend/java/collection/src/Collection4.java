import java.util.ArrayList;
import java.util.List;

public class Collection4 {

	public static void main(String[] args) {
		List l1=new ArrayList();
		l1.add(0, 12);
		l1.add(1,24);
		l1.add(2,34);
		l1.add(3,45);
		//l1.add(6,66);exception occures
		l1.add(1,100);
		
		System.out.println(l1);
		System.out.println("----------------------");
		
		l1.remove(2);
		System.out.println(l1);
		System.out.println(l1.indexOf(45));
		l1.add(45);
		System.out.println(l1);
		System.out.println(l1.lastIndexOf(100));
		
		System.out.println("---------------------------");
		
		for(int i=0;i<l1.size();i++) {
			System.out.println(l1.get(i));
		}
		List l2=new ArrayList();
		
		l2.add(45);
		l2.add(55);
		l2.add(66);
		
		List l3=new ArrayList();
		
		l3.add(23);
		l3.add(33);
		l3.add(43);
		l3.add(53);
		System.out.println("-----------------------");
		System.out.println(l2.addAll(l3));
		System.out.println("***********************");
		l2.set(2, 1000);
		System.out.println(l2);
		System.out.println("-----------------------");
		List l4=l3.subList(0, 3);
		System.out.println(l4);
	}

}
