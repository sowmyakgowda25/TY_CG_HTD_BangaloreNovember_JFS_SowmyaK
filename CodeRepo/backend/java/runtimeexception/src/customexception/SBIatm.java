package customexception;

public class SBIatm {

	public static void main(String[] args) {
		System.out.println("main started");
		AtmSimulator a1=new AtmSimulator();
		try {
		a1.withdraw(41000);
		}catch(DayLimitException e) {
			System.out.println(e.getMessage());
			throw e;
		}
		System.out.println("main ended");
		
	}

}
