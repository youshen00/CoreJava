package day8;
public class TestInheritance{
	public static void main(String[] args){
		Dog d = new Dog();
		d.sleep();
	}
}
class Animal{
	private int age;
	char gender;
	
	public void eat(){
		System.out.println("Animal eat");
	}
	private void sleep(){
		System.out.println("sleep 8 hours");
	}
	
}

class Dog extends Animal{
	public void sleep(){
		System.out.println("sleep 6 hours");
	}	
	public void shout(){}
}














