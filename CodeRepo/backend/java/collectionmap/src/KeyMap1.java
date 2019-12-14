import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class KeyMap1 {
	public static void main(String[] args) {
		HashMap<Integer,String> h1= new HashMap<Integer,String>();
		
		h1.put(3, "uday");
		h1.put(6, "sowmya");
		h1.put(5, "sara");
		h1.put(40, "santhu");
		h1.put(34, "suma");
		
		Set<Map.Entry<Integer,String>> s1 = h1.entrySet();
		
		for(Map.Entry<Integer, String> e1:s1) {
		System.out.println(e1.getKey());
			System.out.println(e1.getValue());
			System.out.println(h1.values());
			System.out.println("--------------------");
		}
	}
}
