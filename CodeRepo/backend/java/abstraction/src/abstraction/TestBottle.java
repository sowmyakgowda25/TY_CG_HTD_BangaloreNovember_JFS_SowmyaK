package abstraction;

public class TestBottle {

	public static void main(String[] args) {
		Pepsi p1=new Pepsi();
		p1.open();
		p1.drink();
		p1.juice();
		System.out.println("--------------------------------------");
		Fanta f1=new Fanta();
		f1.open();
		f1.juice();
		f1.drink();
		System.out.println("---------------------------------------");
		Bottle.close();
	}

}
 