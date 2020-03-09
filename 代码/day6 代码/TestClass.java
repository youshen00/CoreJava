package day6;
public class TestClass{
	public static void main(String[] args){
		Student s = new Student();
		s.print();
	}
}

class Student{
	String name;
	int age = 10; 
	double score;
	
	public void print(){
		int age = 20;
		System.out.println(age); // 20
	}
}

