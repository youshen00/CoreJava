package day12;
public class TestGoldbach{
	public static void main(String[] args){
		method(100000000 , new MathToolB());
	}
	
	//²ðÊý  n
	static void method(int n , MathTool tool ){
		for(int i = 3 ; i <= n/2 ; i+=2){
			int j = n - i;
			if (tool.isPrime(i) && tool.isPrime(j) ) System.out.println(i+"+"+j);
		}
	}
}


interface MathTool{
	boolean isPrime(int x);
}
class MathToolA implements MathTool{
	public boolean isPrime(int x){
		for(int i = 2 ;  i< x ; i++){
			if (x % i == 0) return false;
		}
		return true;
	}
}

class MathToolB implements MathTool{
	public boolean isPrime(int x){
		double y = Math.sqrt(x);
		for(int i = 3 ; i <= y ; i+=2){
			if (x % i == 0) return false;
		}
		return true;
	}
}








