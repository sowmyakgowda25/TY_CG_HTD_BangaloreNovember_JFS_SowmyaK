package customexception;

public class AtmSimulator {
	
	void withdraw(double amount) {
		if(amount>40000) {
			try {
			throw new DayLimitException("user exceeded the limit of withdrawing amount ");
			}catch(DayLimitException e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
