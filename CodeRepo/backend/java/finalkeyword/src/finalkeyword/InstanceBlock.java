package finalkeyword;

public class InstanceBlock {
	final int MAXIMUM;
	static final double PI;
	
	public InstanceBlock() {

		System.out.println("constructor is calling");
	}
	public InstanceBlock(int a){
		
		System.out.println("constructor overloded");
	}
	static {
		System.out.println("static Initializer block is executed");
		PI=3.142;
	}
	{
		System.out.println("Instace Initializer block is executed");
		this.MAXIMUM=3000;
	}
}
