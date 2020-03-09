/*
interface A{
	void m1();
	void m2();
	void m3();
}
abstract class B implements A{
	public void m1(){}
	public void m2(){}
	public void m3(){}
}*/
	
/*
class MyClass implements A{
	public void m1(){}
	public void m2(){}
	public void m3(){}
}
class MyClass2 extends B{
	public void m1(){
		System.out.println("hehe");
	}
}
*/

interface A{
	default void m1(){}
	default void m2(){}
	default void m3(){}
}
class MyClass implements A{
	public void m1(){
		System.out.println("hehe");
	}
}


