import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Collection6 {

	public static void main(String[] args) {
		
		ArrayList<String> a1=new ArrayList<String>();
		
		a1.add("uday pawar");
		a1.add("sanath");
		a1.add("sowmya");
		a1.add("uday pawar");//It allows duplicates
		a1.add("gautham");
		System.out.println(a1);
		a1.remove(1);
		System.out.println(a1);
		System.out.println("------------forloop----------------");
		for(int i=0;i<a1.size();i++) {
			System.out.println(a1.get(i));
		}
		System.out.println("----------foreach loop----------------");
		
		for(String i1:a1) {
			System.out.println(i1);
		}
		
		System.out.println("------------iterator method--------------");
		Iterator<String> itr = a1.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("--------------list Iterator--------------");
		ListIterator<String> itr1 = a1.listIterator(a1.size());
		while(itr1.hasPrevious()) {
			System.out.println(itr1.previous());
		}
		System.out.println("-----------------------------------------");
		ArrayList<String> a2=new ArrayList<String>();
		a2.add("santhosh");
		a2.add("sumalatha");
		a2.add("sowmya");
		System.out.println(a2);
		a2.remove(new String("sowmya"));
		System.out.println(a2);
		}

	}


