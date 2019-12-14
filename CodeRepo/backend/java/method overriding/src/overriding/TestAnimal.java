package overriding;

public class TestAnimal {

	public static void main(String[] args) {
		Lion l1=new Lion();
		l1.eat();
		Cat c1= new Cat();
		c1.eat();
		Animal a1=new Lion();
		a1.eat();
	}

}
