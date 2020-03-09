package day4;
public class TestLocal{
	int a = 10;//成员变量
	public static void main(String[] args){
		int b =0 ;  //局部变量
		
		int a = 20;
		System.out.println(b);
		while(true){
			int c = 10;
			break;
		}
		//System.out.println(c);
		
		{
			int d = 10;
		}
		{
			int d = 20;
			System.out.println(d);
		}
	}
	
	static void m2(){
		int b = 1;
	}
}