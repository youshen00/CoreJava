package day14;

public class TestStringPool {

	public static void main(String[] args) {
		String s1 = "ABC";
		String s2 = "ABC";
		
		System.out.println(s1 == s2);  //true
		
		String s3 = new String("ABC");
		String s4 = new String("ABC");
		System.out.println(s3 == s4);  // false
		
		s3 = s3.intern();
		s4 = s4.intern();
		System.out.println(s1 == s2);
		System.out.println(s2 == s3);
		System.out.println(s3 == s4);
	}

}
