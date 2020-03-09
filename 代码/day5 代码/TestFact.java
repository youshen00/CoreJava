package day5;
public class TestFact{
	public static void main(String[] args){
		System.out.println(fact(4));
	}
	// 计算n的阶乘
	static int fact(int n){
		if ( n == 1 ) return 1;
		int result = n * fact(n-1);
		return result;
	}
	
	//计算斐波那契数列的第n项
	static int fabo(int n){
		if (n == 1 ) return 0;
		if (n == 2 ) return 1;
		return fabo(n-1) + fabo(n-2);
	}
}
/*
n! = n * n-1 * n-2 * n-3 * ...  * 2 * 1
n! = n * (n-1)!
1! = 1 
*/

/*
0 1   1   2  3  5  8  13  21  34 ....
编程计算第n项是多少
*/
























