package day14;

public class TestStringChar {

	public static void main(String[] args) {
		String str = "HelloWorld";
		
		/*
		char[] cs = str.toCharArray();
		for(int i = 0 ; i < cs.length ; i++) {
			if (cs[i] >= 'a' && cs[i] <= 'z') cs[i] -= 32;
		}
		
		String str2= new String(cs);
		*/
		
		String str2 = str.toUpperCase();
		
		System.out.println(str2);
		
		str ="                                     A BC                                           ";
		System.out.println(str.length());
		str = str.trim();
		System.out.println(str.length());
	}

}
