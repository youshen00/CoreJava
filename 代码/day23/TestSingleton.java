package day23;

public class TestSingleton {

	public static void main(String[] args) {
		ClassA a1 = ClassA.newInstance();
		ClassA a2 = ClassA.newInstance();
		
		new Thread(()->ClassB.newInstance()).start();
		new Thread(()->ClassB.newInstance()).start();

	}

}

class ClassA{
	private static ClassA instance = new ClassA();
	public static ClassA newInstance() {
		return instance;
	}
	private ClassA() {}
}

class ClassB{
	private static ClassB instance = null;
	public static synchronized ClassB newInstance() {
		if (instance == null) instance = new ClassB();
		return instance;
	}
	private ClassB() {}
}
class ClassC{
	private static class Holder{
		static ClassC instance = new ClassC();
	}
	public static ClassC newInstance() {
		return Holder.instance;
	}
	private ClassC() {}
}










