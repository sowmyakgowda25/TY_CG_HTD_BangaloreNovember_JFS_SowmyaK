package abstraction;

public class Robot implements Moment, Sound {

	public void talk() {
		System.out.println("Robot is talking");
	}
	public void move() {
		System.out.println("Robot is moving");
	}
	
}
