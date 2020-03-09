package day13;

public class TestObject {

	public static void main(String[] args) {
//		Animal a1 = new DogA();
//		Animal a2 = new DogA();
//		
//		System.out.println(a1.getClass() == a2.getClass());
		Worker w = new Worker("Liucy",50);
		
//		System.out.println(w.toString());
		System.out.println(w);
	}

}
class Worker{
	private String name;
	private int age;
	public Worker(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public String toString() {
		return "Worker name = "+name+"    age = "+age;
	}
}



class Animal{}
class Dog extends Animal{}
class Cat extends Animal{}
