import java.util.Comparator;

public class Student1 implements Comparable<Student1>{
	int age;
	String name;
	public Student1(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student1 [age=" + age + ", name=" + name + "]";
	}

	@Override
	public int compareTo(Student1 o1) {
		if(this.age>o1.age) {
			return 1;
		}else if(this.age<o1.age){
			return -1;
		}else {
			return 0;
		}
	}
	
}
