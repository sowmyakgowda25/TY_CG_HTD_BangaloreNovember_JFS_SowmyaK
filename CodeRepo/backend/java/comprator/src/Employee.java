
public class Employee implements Comparable{
	Integer age;
	String name;
	Double salary;
	public Employee(Integer age, String name, Double salary) {
		super();
		this.age = age;
		this.name = name;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [age=" + age + ", name=" + name + ", salary=" + salary + "]";
	}
	@Override
	public int compareTo(Object o) {
		return 0;
	}

	
}
