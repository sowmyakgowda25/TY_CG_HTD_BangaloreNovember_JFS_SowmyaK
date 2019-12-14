package staticandnonstatic;

public class TestA {

	public static void main(String[] args) {
		/*FirstGen fg=new FirstGen();
		fg.call();
		fg.msg();
		SecondGen sg=new SecondGen();
		sg.call();
		sg.msg();
		sg.radio();
		ThirdGen tg=new ThirdGen();
		tg.call();
		tg.msg();
		tg.radio();
		tg.camera();*/
		FirstGen fg=new ThirdGen();
		fg.call();
		fg.msg();
		SecondGen sg=new ThirdGen();
		sg.call();
		sg.msg();
		sg.radio();
		FirstGen fg1=new SecondGen();
		fg1.call();
		fg1.msg();
		
	}

}
