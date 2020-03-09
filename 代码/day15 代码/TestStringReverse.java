package day15;

public class TestStringReverse {

	public static void main(String[] args) {
		String str = "ABC";
		/*
		char[] cs = str.toCharArray();
		StringBuilder sb = new StringBuilder();
		
		for(int i = cs.length-1 ; i >= 0 ; i--) {
			sb.append(cs[i]);
		}
		
		str = sb.toString();
		*/
		
		StringBuilder sb = new StringBuilder(str);
		sb = sb.reverse();
		str = sb.toString();
		
		System.out.println(str);
		
	}

}
