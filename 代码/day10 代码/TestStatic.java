package day10;
public class TestStatic{
	public static void main(String[] args){
		/*
		MyClass mc1 = new MyClass();
		MyClass mc2 = new MyClass();
		mc1.a++;
		mc1.b++;
		
		System.out.println(mc2.a);  // 10
		System.out.println(mc2.b);  // 21
		*/
		System.out.println(MyClass.b);
		
		MyClass.print();
		
		ClassA a = null;
		a.method(); //ClassA.method();

	}

}
class MyClass{
	int a = 10;
	static int b = 20;
	
	public static void print(){
		//System.out.println(a);
		System.out.println(b);
	}
}
class ClassA{
	public static void method(){
		System.out.println("ClassA method");
	}
}
class ClassB extends ClassA{
	public static void method(){
		System.out.println("ClassB method");
	}
}



