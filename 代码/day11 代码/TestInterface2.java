package  day11;
public class TestInterface2{
	public static void main(String[] args){
		C c = new C();
		c.ma();
		c.mb();
		B.print();
	}
}

class A{
	public void ma(){
		System.out.println("ma");
	}
}
interface B{
	default void mb(){
		System.out.println("mb");
	}
	public static void print(){
		System.out.println("hehe");
	}
	private void method(){}
}

class C extends A implements B{

}