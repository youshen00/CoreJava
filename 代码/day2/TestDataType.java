package day2;
import java.math.*;
public class TestDataType{
	public static void main(String[] args){
		int a = 10;
		System.out.println(a);
		a = 20;
		System.out.println(a);
		
		//byte b = 200;
		long l = 200000000000001L;
		
		float f = 1.3F;
		double d = 1.3;
		
		System.out.println(2.0-1.1);
		
		BigDecimal b1 = new BigDecimal("2.0");
		BigDecimal b2 = new BigDecimal("1.1");
		System.out.println(b1.subtract(b2));
		
		a = 8;
		a = 010;
		System.out.println(a);
	}
}