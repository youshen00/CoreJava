package day23;
import java.io.*;
import java.util.*;
public class TestFactory {
	public static void main(String[] args) {
		Animal a = createAnimal();
		a.eat();
	}
	public static Animal createAnimal() {
		String classname = null;
		Properties ps = new Properties();
		try(
			FileInputStream fis = new FileInputStream("config.txt")
		){
			ps.load(fis);
			classname = ps.getProperty("animal");
			Class c = Class.forName(classname);
			Object o = c.newInstance();
			return (Animal)o;
		}
		catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
abstract class Animal{
	public void eat() {}
}
class Dog extends Animal{
	public void eat() {
		System.out.println("Dog eat");
	}
}
class Cat extends Animal{
	public void eat() {
		System.out.println("Cat eat");
	}
}
class Tiger extends Animal{
	public void eat() {
		System.out.println("Tiger eat");
	}
}
class Lion extends Animal{
	public void eat() {
		System.out.println("Lion eat");
	}
}
class Monkey extends Animal{
	public void eat() {
		System.out.println("Monkey eat");
	}
}
