package abstraction;

public class Pepsi implements Bottle {

	public void open() {
		System.out.println("open the bottle");
	}
	public void drink() {
		System.out.println(" drinking pepsi ");
	}
	public void juice() {
		System.out.println("juice");//overriden the default juice method 
	}
}
