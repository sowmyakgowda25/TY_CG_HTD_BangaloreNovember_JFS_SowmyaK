
public class Demo3 {

	public static void main(String[] args) {
		String s1= "uday";
		System.out.println(s1.toLowerCase());
		System.out.println(s1.toUpperCase());
		
		String s2="  uday pawar  ";
		System.out.println(s2.trim());
		
		String s3=s1.substring(3);
		System.out.println(s3);
		
		String s4="sudhanshu";
		System.out.println(s4.substring(3,6));
		System.out.println(s4.isEmpty());
		
		String s5="shreeshree";
		System.out.println(s5.indexOf('h'));
		System.out.println(s5.indexOf("re"));
		System.out.println(s5.lastIndexOf('e'));
		System.out.println(s5.lastIndexOf("ee"));
		}

}
