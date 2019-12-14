package com;

class employee
{
	String name;
	int age;
	double salary;
	
	public employee(int age, String name, double salary)
	{
		this.age=age;
		this.name=name;
		this.salary=salary;
	}

	/*public boolean equals(Object arg)
	{
		employee emp1 = (employee) arg;
		return this.name = emp1.name;
		return this.age=emp1.age;
		return this.salary=emp1.salary;*/
	
	public String toString()
	{
		return "employee[age="+age+"name="+name+"salary="+salary+"] \n";
		
	}

	public static void main(String[] args)
	{
		employee e1=new employee(28,"Ram",25000);
		employee e2=new employee(28,"Ram",25000);

	}

}
