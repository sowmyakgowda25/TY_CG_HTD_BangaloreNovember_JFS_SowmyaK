package abstraction;

public class TestRobot {

	public static void main(String[] args) {
		Robot r1=new Robot();
		r1.move();
		r1.talk();
		
		System.out.println("-------------------------------------");
		Moment m1=new Robot();
		m1.move();
		//m1.talk();
	}

}
