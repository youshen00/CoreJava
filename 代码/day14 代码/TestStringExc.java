package day14;

public class TestStringExc {

	public static void main(String[] args) {
		System.out.println(huiWen("ABCCBA"));
		System.out.println(huiWen("ABCCBA"));
		System.out.println(huiWen("ABC"));
		
		allIndexOf("ABCDBCABC", "BC");
	}
	
	//判断str是不是一个回文字符串
	public static  boolean huiWen(String str) {
		/*
		//得到str的倒置字符串
		String result = "";    
		char[] a  = str.toCharArray();
		for(int x=a.length-1 ; x>=0;x--) {
			result += a[x];
		}
		
		if(str.equals(result))
			return true;
		else return false;
		*/
		/*
		0  1  2  3  4
		A  B  C  B  A
		0 - 4 
		1 - 3              i    for(int i = 0 ; i < 2 ; i++)    a[i] PK a[4-i]    a.length = 5
	
		0 1 2 3 4 5
		A B C C B A
		0-5
		1-4
		2-3                     for(int i = 0 ; i < 3 ; i++)   a[i] PK a[5-i]     a.length = 6
		
		for(int i = 0 ; i < length/2 ; i++)   a[i] PK  a[length-1-i]
		*/
		for(int i = 0 ; i < str.length()/2 ; i++) {
			if (str.charAt(i) != str.charAt(str.length()-1-i))  return false;
		}
		return true;
 	}
	
	//在s字符串中, 找出所有子串str的位置
	static void allIndexOf(String s , String str) {
		/*
		 *    0 1 2 3 4 5 6 7 
		 *    A B C D B C B C
		 *    
		 *    s.indexOf("BC",0); = 1
		 *    s.indexOf("BC",3); = 4
		 *    s.indexOf("BC",6); = 6    
		 *    s.indexOf("BC",8); = -1
		 *    
		 *    
		 */
		int start = 0 ; 
		while(true) {
			int i = s.indexOf(str , start);
			if ( i == -1) break;
			System.out.println(i);
			start = i + 1;
		}
	}
}


















