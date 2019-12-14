package staticandnonstatic;

public class TestQspiders {

	public static void main(String[] args) {
		Qspiders Raj=new Qspiders();
		Raj.swipe();
		Raj.swipe();
		Qspiders BTM=new Qspiders();
		BTM.swipe();
		System.out.println(Raj.branchcount);
		System.out.println(BTM.branchcount);
		System.out.println(Qspiders.totalcount);
	}

}
