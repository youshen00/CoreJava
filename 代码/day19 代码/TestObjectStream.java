package day19;
import java.io.*;
public class TestObjectStream {
	public static void main(String[] args) throws Exception{
		Employee e = new Employee("Liucy" , 40);
		
		FileOutputStream fos = new FileOutputStream("a.dat");
		ObjectOutputStream out = new ObjectOutputStream(fos);
		out.writeObject(e);
		out.close();
		
		FileInputStream fis = new FileInputStream("a.dat");
		ObjectInputStream in= new ObjectInputStream(fis);
		Object o = in.readObject();
		in.close();
		System.out.println(o);
	}
}
class Employee implements Serializable{
	String name;
	transient int age;
	public Employee(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + "]";
	}
	
}