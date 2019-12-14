import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet2 {

	public static void main(String[] args) {
		
		TreeSet<Student1> t1 = new TreeSet<Student1>();
		
		t1.add(new Student1(28,"uday"));
		t1.add(new Student1(23,"sowmya"));
		t1.add(new Student1(28,"uday"));
		t1.add(new Student1(34,"shivanand"));
		
		Iterator<Student1> itr = t1.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}