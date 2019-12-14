package abstraction;

public interface Bottle {
	void open();
	
	default void juice() {
		System.out.println("juice name is ");
	}
	void drink();
	
	static void close() {
		System.out.println("close the bottle");
	}
}
