import java.util.Vector;

public class Vector1 {

	public static void main(String[] args) {
		Vector v1 = new Vector();
		v1.add(23);
		v1.add(45);
		v1.add(67);
		v1.add(78);
		
		for(int i=0;i<v1.size();i++) {
		System.out.println(v1.get(i));}
		System.out.println("-------------------------");
		v1.set(1, 10);
		System.out.println(v1);
	}

}
