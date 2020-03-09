package day10;
public class TestAbstract{
	public static void main(String[] args){
		Super s;  
		s = new Sub();
		
		s.method();
	}
}

abstract class Super{
	public abstract void method();
}
class Sub extends Super{
	//public abstract void method();
	public void method(){
		System.out.println("Sub method");
	}
}
