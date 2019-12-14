package sample;

public class Aadhar
{
	private static Aadhar a=null;
	
	private Aadhar()
	{
		System.out.println("Aadhar is compulsary for all");
	}
	static Aadhar create()
	{
		if(a==null)
		{
			a=new Aadhar();
		}
		return a;
	}		
}


