package day14;

public class TestSubString {

	public static void main(String[] args) {
		String s = "ABCDEBCFHGBCDABASEBCDEKGF";
		System.out.println(s.contains("BC"));
		System.out.println(s.indexOf("BC"));
		System.out.println(s.indexOf("BC" , 2));

		System.out.println(s.substring(1));
		System.out.println(s.substring(1 , 4));
		
		String s2= s.replace("BC", ":");
		System.out.println(s2);
		
		System.out.println();
		String[] ss = s2.split(":");
		for(int i = 0 ; i < ss.length ; i++) {
			System.out.println(ss[i]);
		}
	}

}
