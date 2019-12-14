import java.util.Vector;

public class Vector2 {

	public static void main(String[] args) {
		Vector v1 = new Vector();
		System.out.println(v1.size());
		System.out.println(v1.capacity());
		v1.add(23);
		v1.add(34);
		v1.add(56);
		v1.add(67);
		
		System.out.println(v1.size());
		System.out.println(v1.capacity());
		System.out.println("--------------------------");
		v1.trimToSize();
		System.out.println(v1.size());
		System.out.println(v1.capacity());
		System.out.println(v1);
		System.out.println("--------------------------");
		v1.setSize(10);
		System.out.println(v1.size());
		System.out.println(v1);
		
		v1.add(200);
		System.out.println(v1);
		System.out.println("--------------------------------------------------------");
		v1.set(5, 700);
		System.out.println(v1);
		
	}

}
