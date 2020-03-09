package day16;
import java.util.*;
public class TestSet {

	public static void main(String[] args) {
		
		String s1 = new String("Liucy");
		String s2 = new String("Huxz");
		String s3 = new String("Lixx");
		String s4 = new String("Liucy");
		
		/*
		Student s1 = new Student("Liucy" , 40);
		Student s2 = new Student("Lixx" , 25);
		Student s3 = new Student("Huxz" , 18);
		Student s4 = new Student("Liucy" , 40);
		*/
		
		Set<String> hs = new HashSet<>();
		hs.add(s1);
		hs.add(s2);
		hs.add(s3);
		hs.add(s4);
		
		hs.forEach(s->System.out.println(s));
	}

}

class Student{
	private String name;
	private int age;
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}

	public boolean equals(Object o) {
		System.out.println("call equals");
		if (this == o) return true;
		if (o ==null) return false;
		if (this.getClass() != o.getClass()) return false;
		Student s = (Student)o;
		if (this.name.equals(s.name) && this.age == s.age) return true;
		else return false;
	}

	public int hashCode() {
		return name.hashCode() + age; 
	}
}







