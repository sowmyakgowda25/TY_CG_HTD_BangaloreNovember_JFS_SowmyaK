package constructor;

public class Car1 extends Vehicle {
	int cost=50000;
	
	void carDetails() {
		int cost=30000;
		System.out.println("local variable cost of car is"+cost);
		System.out.println("global variable cost of car is"+this.cost);
		System.out.println("parent variable cost of car is"+super.cost);
	}
}
