package day12;
public class TestPoly{
	public static void main(String[] aegs){
		A a = new A();
		method(a);
		
		method();
	}
	static void method(A a){
		a.m();		
	}
	
	static void method(){
		System.out.println("m() A");
	}
}

class A{
	public void m(){
		System.out.println("m() A");
	}
}
class B extends A{
	public void m(){
		System.out.println("m() B");
	}
}