import java.util.HashSet;

public class HashSet2 {

	public static void main(String[] args) {
		HashSet<Student> hs = new HashSet<Student>();
		hs.add(new Student(23,"Uday"));
		hs.add(new Student(28,"pawar"));
		hs.add(new Student(23,"Uday"));
		hs.add(new Student(28,"pawar"));
		hs.add(new Student(23,"Sowmya"));
		
		for(Student s1:hs) {
			System.out.println(s1.sName +"ag1e is :"+s1.sAge);
		}	
	}

}
