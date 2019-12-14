package jspider;

import java.util.Comparator;

public  class Employee implements Comparator <Employee>
{
	Integer id;
	String name;
	Double salary;
	
	Employee(int id,String name,double salary)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	public String tostring()
	{
		return "id:"+id+"name:"+name+"salary:"+salary;
	}
	public int compareTo(Employee emp)
	{
		return this.salary.compareTo(emp.salary);
	}
	@Override
	public int compare(Employee arg0, Employee arg1) {
		// TODO Auto-generated method stub
		return 0;
	}
}
