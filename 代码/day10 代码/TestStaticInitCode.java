package day10;
public class TestStaticInitCode{
	public static void main(String[] args){
		new A();
		new A();
	}
}

class A{
	static {
		System.out.println("Init A");
	}
	public A(){
		System.out.println("A()");
	}
}