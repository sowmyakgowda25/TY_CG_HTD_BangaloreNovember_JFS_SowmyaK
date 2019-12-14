
public class Vehicle implements Cloneable{
	String vName;

	public Vehicle(String vName) {
		super();
		this.vName = vName;
	}

	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	
}
