package day4;
public class TestFunction2{
	public static void main(String[] args){
		for(int n = 100 ; n <= 999 ; n++){
			int a = n/100;
			int b = n/10%10;
			int c = n%10;
			
			if (fact(a) + fact(b) + fact(c) == n) 
				System.out.println(n);
		}
	}
	
	//计算一个数x的阶乘
	static int fact(int x){
		int result = 1 ; 
		for(int i = 1 ; i <= x; i++){
			result *= i ; 
		}
		return result;
	}
}