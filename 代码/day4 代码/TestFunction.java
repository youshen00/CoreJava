package day4;
public class TestFunction{
	public static void main(String[] args){
		printChars(30 , '-');
		System.out.println("闺中少妇不知愁");
		printChars(20 , '*');
		System.out.println("春日凝装上翠楼");
		printChars(40 , '+');
		System.out.println("忽见陌头杨柳色");
		printChars(25 , '?');
		System.out.println("悔教夫婿觅封侯");
		printChars(35 , '^');
		
		ma(10);
		
		System.out.println(add(10 , 20));
		
	}
	//打印分割线
	static void printChars(int length , char c){
		if (length == 0) return;
		for(int i = 1 ; i <= length ; i++){
			System.out.print(c);
		}
		System.out.println();
	}
	
	static void ma(int x){
		System.out.println(x);
	}
	
	static int add(int a , int b){
		int c = a + b ; 
		if (c >= 0) return c;
		else return 0;
	}
}




