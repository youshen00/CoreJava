package day5;
public class TestExc5_13{
	public static void main(String[] args){
		java.util.Scanner s=  new java.util.Scanner(System.in);
		int n = s.nextInt();
		if (n <= 6 || n % 2 == 1){
			System.out.println("���������6��ż��");
			return ;
		}
		
		/*
		100 = 2+98
		= 3+97
		= 4+96
		= 5+95
		=....
		= 50+50
		*/
		
		for(int a = 3 ; a <= n/2 ; a+=2){
			int b = n - a ;
			if (isPrime(a) && isPrime(b)){
				System.out.println(n+"="+a+"+"+b);
			}
		}
	}
	
	
	//�ж�x�ǲ�������, �Ƿ���true , ���Ƿ���false
	static boolean isPrime(int x){
		double d = Math.sqrt(x);
		for(int i = 3 ; i <= d ; i+=2){
			if (x % i == 0 ) return false;
		}
		return true;
	}
}






