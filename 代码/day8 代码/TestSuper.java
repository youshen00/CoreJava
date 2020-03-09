package day8;
public class TestSuper{
	public static void main(String[] args){
		//ClassB b = new ClassB();
		//b.method();
		new B(10);
	}
}
class ClassA{
	private int m = 10;
	
	public void method(){
		System.out.println("ClassA method");
	}
}
class ClassB extends ClassA{
	/*
	private int m = 20;
	public void print(){
		System.out.println(this.m);   //20
		System.out.println(super.m);  //10
	}
	*/
	
	public void method(){
		super.method();
		System.out.println("ClassB method");
	}
}

class A{
	public A(){
		System.out.println("A()");
	}
	public A(String s){
		System.out.println("A(String)");
	}	
}
class B extends A{
	public B(){
		super("abc");//创建父类对象
		System.out.println("B()");
	}
	public B(int a){
		super();
		System.out.println("B(int)");
	}
}

class Super{
	public Super(int a){}
}
class Sub extends Super{
	//	public Sub(){
	//		super();
	//	}
}



class MyClass{
	int a = 10;
	int b ; 
	String s = "abc";
	
	public MyClass(){
		System.out.println("hehe");
	}
}

class MyClassAfterCompile{
	int a ;
	int b ; 
	String s ;
	
	public MyClass(){
		super();
		a = 10;
		s = "abc";
		System.out.println("hehe");
	}
}

class MyClassB extends MyClass{
	int c ;
	public MyClassB(){
		super();
		c = 20;
		System.out.println("xixi");
	}
}









