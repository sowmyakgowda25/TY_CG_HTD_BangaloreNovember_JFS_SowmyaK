package com.cpg.Map.linkedhashmap;

public class Employee {
	int eSalary;
	String eName;
	
	
	public Employee(int eSalary, String eName) {
		super();
		this.eSalary = eSalary;
		this.eName = eName;
	}


	@Override
	public String toString() {
		return "Employee [eSalary=" + eSalary + ", eName=" + eName + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((eName == null) ? 0 : eName.hashCode());
		result = prime * result + eSalary;
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
		if (eName == null) {
			if (other.eName != null)
				return false;
		} else if (!eName.equals(other.eName))
			return false;
		if (eSalary != other.eSalary)
			return false;
		return true;
	}
	
}
