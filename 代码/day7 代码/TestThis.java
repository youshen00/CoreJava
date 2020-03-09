package day7;
public class TestThis{
	public static void main(String[] args){
		Student  s  = new Student();
		s.sleep();
		s.print();
	}
}
class Student{
	String name;
	int age = 20;
	
	public Student(String name , int age){
		this();	
		this.name = name; 
		this.age = age;
	}
	
	public Student(){
		// 10000
	}
	
	public void eat(){
		this.sleep();
	}
	public void sleep(){
	}
	public void print(){
		int age = 10;
		System.out.println(age);
		System.out.println(this.age);
	}
}
class Worker{
	String name;
	int age;
	double salary;
	char sex;
	String phone;
	
	public Worker(String name , int age , double salary , char sex){
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.sex = sex;
	}
	
	public Worker(String name , int age , double salary , char sex, String phone){
		this(name,age,salary,sex);
		this.phone = phone;
	}
}












