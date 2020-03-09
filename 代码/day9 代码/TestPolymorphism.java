package day9;
public class TestPolymorphism{
	public static void main(String[] args){
		/*
		java.util.Scanner s=  new java.util.Scanner(System.in);
		int i = s.nextInt();
		
		Animal a = null;
		if (i == 0 ) a = new Dog();
		if (i == 1 ) a = new Cat();
		*/
		Animal a = new Dog();// Dog is a Animal
		a.eat();
		a.sleep(); // sleep 6 hours
		//a.shout();  error!
		
		if (a instanceof Dog){
			Dog d = (Dog)a ; // 可能成功 ,  可能失败
			d.shout();
		}
		
		//Person p = (Person)a; // 一定失败
		/*
		如果a中装的是 Person的子类对象 ,赋值就有可能成功
		实际上a中装的一定是Animal或Animal 子类对象
		由于Java是单继承语言, Animal的子类一定不是Person的子类
		于是不可能成功
		*/
						
	}
}
class Animal{
	public void eat(){
		System.out.println("Animal eat");
	}
	public void sleep(){
		System.out.println("sleep 8 hours");
	}
}
class Dog extends Animal{
	public void sleep(){
		System.out.println("sleep 6 hours");
	}
	public void shout(){
		System.out.println("WangWang");
	}
}
class Cat extends Animal{}

class Person {}























