package jspider;

public class student 
{
	static int count=0;
	
	student()
	{
		count++;
	}

public static void main(String[] args) 
{
	student std1=new student();
	new student();
	student s2=new student();
	System.out.println(student.count);
}
}

