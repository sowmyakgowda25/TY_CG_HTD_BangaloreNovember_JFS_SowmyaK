package throwkey;

public class Ola {
	GoogleMap g1;
	
	public Ola(GoogleMap g1) {
		this.g1=g1;
	}

	void find(String a) {
		try
		{
			g1.findLoc(a);
		}catch(NullPointerException e) {
			System.out.println("Ola user plz fill location name");
		}
	}
}
