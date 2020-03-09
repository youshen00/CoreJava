package day6;
public class Test3{
	public static void main(String[] args){
		
		long t1 = System.nanoTime();
		/*
		int result = 1 ; 
		for(int i = 3 ; i <= 10000 ; i+=2){
			if (isPrime(i)) result++;
		}
		*/
		//如果flag[n] = true  代表 n是质数
		boolean[] flag = new boolean[10001];
		//默认所有的数都是质数
		for(int i = 2; i < flag.length ; i++){
			flag[i]= true;
		}
		
		//找出质数, 在后面的数组元素中,删除该数的所有倍数
		for(int i = 2 ; i <= 100 ; i++){
			if (flag[i]){
				int max = 10000/i; //最大倍数
				for(int j = 2 ; j <= max; j++){
					flag[i * j] = false;
				}
			}
		}
		
		int result = 0 ; 
		for(int i =2 ; i <flag.length ; i++){
			if (flag[i]) result++;
		}
		
		long t2 = System.nanoTime();
		System.out.println(result +"    "+(t2-t1));
	}
	
	static boolean isPrime(int n){
		double d = Math.sqrt(n);
		for(int i = 3; i <= d; i+=2){
			if (n % i == 0) return false;
		}
		return true;
	}
}