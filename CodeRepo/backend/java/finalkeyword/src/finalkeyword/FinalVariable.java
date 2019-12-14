package finalkeyword;

public class FinalVariable {
	final double PI;
	public FinalVariable(double PI) {
		this.PI=PI;
	}
	FinalVariable(int a,double PI){
		this.PI=PI;
	}
	void piVariable() {
		System.out.println(PI);
	}
}
