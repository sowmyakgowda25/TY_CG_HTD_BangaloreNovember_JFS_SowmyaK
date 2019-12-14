
public class Employee {
	int eAge;
	String eName;
	public Employee(int eAge, String eName) {
		super();
		this.eAge = eAge;
		this.eName = eName;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + eAge;
		result = prime * result + ((eName == null) ? 0 : eName.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (eAge != other.eAge)
			return false;
		if (eName == null) {
			if (other.eName != null)
				return false;
		} else if (!eName.equals(other.eName))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Employee [eAge=" + eAge + ", eName=" + eName + "]";
	}
	
	
}
