package day11;
public class Exc9_2{
	public static void main(String[] args){
		new MyClass();
		new MyClass();
		new MyClass();
		
		System.out.println(MyClass.count);
	}
}
class MyClass{
	public static int count ; 
	public MyClass(){
		count++;
	}
}

