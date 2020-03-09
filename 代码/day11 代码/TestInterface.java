package day11;
public class TestInterface{
	public static void main(String[] args){
		MyClass mc = new MyClass();
		IA a = mc ; 
		IB b = mc ; 
		IC c = mc ; 
		ID d = mc ;
		IE e = mc ; 
		ClassF f = mc ;
		
		a.m1();
		a.m2();
		
		b.m3();
		
		c.m4();
		
		d.m5();
		
		e.m4();
		e.m5();
		e.m6();
		
		f.m7();
	}
}
abstract class ClassA{
	public static final int A = 10;
	public static final double B = 2.5;
	public abstract void m1();
	public abstract void m2();
	public ClassA(){}
}
interface IA{
	int A = 10;
	double B = 2.5;
	void m1();
	void m2();	
}
interface IB{
	void m3();
}
interface IC{
	void m4();
}
interface ID{
	void m5();
}
interface IE extends IC,ID{
	void m6();
}
abstract class ClassF {
	public abstract void  m7();
}
class MyClass extends ClassF implements IA,IB,IE{
	// IA
	public void m1(){} 
	public void m2(){}
	//IB
	public void m3(){}
	//IE
	public void m4(){} //¼Ì³Ð×Ô IC
	public void m5(){} //¼Ì³Ð×Ô ID
	public void m6(){}
	//ClassF
	public void m7(){}
	
}






