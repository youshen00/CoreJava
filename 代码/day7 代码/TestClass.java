package day7;

public class TestClass{
	public static void main(String[] argfgdasfsdgsersefsezs){
		Student s = new Student("Liucy" , 18);
		System.out.println(s.name);
		System.out.println(s.age);
		System.out.println(s.score);
		
		s.eat();
		s.sleep();
		
		
		int a = 10;
	}
}

class Student{
	String name;
	int age = 10;
	double score;
	
	public Student(){}
	public Student(String n , int a){
		name = n ; 
		age = a;
	}
	public Student(String n){
		name = n;
	}
		
	void eat(){
		System.out.println("Student eat");
	}
	
	void sleep(){
		
	}
	
	int study(){
		System.out.println("Student study");
		return 0;
	}
	void study(String course){
		System.out.println("Student study " +course);
	}
	void study(int time){}
	//void study(int n){}  error!
	void study(String course , int time){}
	void study(int time,  String course){}
	
	void method(){
		study();  
		study("CoreJava");
		study("CoreJava",10);
		study(10,"CoreJava");
		
		study(10); 
	}
	
}









