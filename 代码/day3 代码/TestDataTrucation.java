package day3;
public class TestDataTrucation{
	public static void main(String[] args){
		int a = 40000;
		short b = (short)a;
		//System.out.println(b);
		
		long l = 1L;
		float f = l;
		
		byte b1 = 1 ;
		byte b2 = 2;
		byte b3 = (byte)(b1 + b2);
		
		
		//System.out.println(10/4);
		//System.out.println(10%4);
		
		System.out.println(a=20);
		
		a = a + 10;
		a += 10;
		
		//b = b + 10; // error!   
		b += 10;    // ok!   
		
		a = 4;
		System.out.println(++a);
		System.out.println(a);
	}
}