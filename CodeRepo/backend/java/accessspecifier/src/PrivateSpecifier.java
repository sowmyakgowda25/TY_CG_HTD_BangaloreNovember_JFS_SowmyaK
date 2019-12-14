
public class PrivateSpecifier {
	private String name;
	
	PrivateSpecifier(String name) {
		this.name=name;
	}
	
	
	private void details(){
		System.out.println("name is"+name);
	}
}
