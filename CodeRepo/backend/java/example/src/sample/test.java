package sample;

public class test {

	public static void main(String[] args)
	{
		int []a= {10,20,30,40};

		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		for(int i:a)
		{
			System.out.println(i);
		}
		double []b= {1.2,2.3,4.5};
		for(double x:b)
		{
			System.out.println(x);
		}
	}

}
