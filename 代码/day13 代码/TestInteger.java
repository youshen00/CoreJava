package day13;

public class TestInteger {

	public static void main(String[] args) {
		int i =12;
		
		/*
		Integer a = new Integer(i);
		Integer b = new Integer(i);
		System.out.println(a == b);
		*/
		
		Integer a = Integer.valueOf(i);
		Integer b = Integer.valueOf(i);
		
		System.out.println(a == b);
		
		i = a ; //i = a.intValue();
		
		Object o = 10; // Object o = Integer.valueOf(10);
		
		a = 12;
		a++;   // a = Integer.valueOf(a.intValue()+1);
	}

}

class BaizhiStudent{
	Integer score = null;
}





















