package multiplecatch;
//nested try block
public class ExceptioB {
		void exception(int a,String b) {
			try {
				System.out.println(b.length());
				try {
					System.out.println(500/0);
				}catch(ArithmeticException a1) {
				System.out.println("dont deal with 0");
			}}catch(NullPointerException e) {
				System.out.println("dont deal with null");
			}
	}
}

