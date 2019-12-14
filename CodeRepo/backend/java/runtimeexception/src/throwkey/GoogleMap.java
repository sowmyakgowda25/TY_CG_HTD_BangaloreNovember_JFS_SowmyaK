package throwkey;

public class GoogleMap {
	
	void findLoc(String a) {
		try {
		System.out.println(a.length());
		}catch(NullPointerException n) {
			System.out.println("plz fill the location name");
			throw n;
		}
	}
}
