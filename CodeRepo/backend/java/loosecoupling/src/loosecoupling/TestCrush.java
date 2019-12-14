package loosecoupling;

public class TestCrush {

	public static void main(String[] args) {
		Crush c1=new Crush();
		
		BasicSet b1=new BasicSet();
		c1.receive(b1);
		Oppo o1=new Oppo();
		c1.receive(o1);
		OnePlus op=new OnePlus();
		c1.receive(op);
		Apple a1=new Apple();
		c1.receive(a1);
		c1.receive(null);
	}

}
