package day19;

public class TestAnnotation {

	public static void main(String[] args) {
		Student s = new Student("Liucy",40);
		System.out.println(s);
	}	

}
class Student{
	String name;
	int age;
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	//ÎÒÒª¸²¸Ç
	@Override
	public String toString() {
		return "Student name="+name+"  age="+age;
	}
	
	@Override
	public boolean equals(Object o) {
		return true;
	}
}