package day4;
import java.math.*;
public class Exc4_3{
	public static void main(String[] args){
		java.util.Scanner s = new java.util.Scanner(System.in);
		int n = s.nextInt();
		
		BigInteger result = BigInteger.valueOf(1);
		for(int i = 1 ; i <= n ; i++){
			result = result.multiply(BigInteger.valueOf(i));
		}
		
		System.out.println(result);
	}
}