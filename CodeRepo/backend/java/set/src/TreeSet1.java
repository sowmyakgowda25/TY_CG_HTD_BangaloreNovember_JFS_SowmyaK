import java.util.TreeSet;

public class TreeSet1 {

	public static void main(String[] args) {
		TreeSet t1 = new TreeSet();
		
		t1.add(23);
		t1.add(45);
		t1.add(44);
		t1.add(23);
		t1.add(78);
		//t1.add("uday");//throws ClassCastException
		//t1.add(null);//throws NullPointerException
		t1.remove(44);
		
		for(Object o1:t1) {
			System.out.println(o1);
		}
	}

}
/*Class Integer implements comparable{
compareTo{  }//it overloding copareTo method
}*/