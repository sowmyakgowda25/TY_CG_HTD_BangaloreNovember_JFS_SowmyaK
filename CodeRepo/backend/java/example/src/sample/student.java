package sample;

import java.util.Comparator;

public class student implements Comparator <student>
{
	int age;
	
	student(int age)
	{
		this.age=age;
	}

	@Override
	public String toString() 
	{
			return "Age:"+age;
	}
	public int compareTo(student std) 
	{
		return this.age-std.age;
		
	}

	@Override
	public int compare(student o1, student o2) {
		// TODO Auto-generated method stub
		return 0;
	}	
}
