package day23;

import java.lang.reflect.Method;
import java.util.Scanner;

public class TestReflection {

	public static void main(String[] args) throws Exception{
		//Student s = new Student();
		Scanner sc = new Scanner(System.in);
		String classname = "day23.Student";
		Class c = Class.forName(classname);
		Object s = c.newInstance();

		//s.study();
		String methodname = "study";
		Method m = c.getDeclaredMethod(methodname);
		m.setAccessible(true);
		m.invoke(s);
	}

}

class Student{
	public Student() {
		System.out.println("Student()");
	}
	private void study() {
		System.out.println("Student study");
	}
	public void eat() {
		System.out.println("Student eat");
	}
}
class Teacher{
	public Teacher() {
		System.out.println("Teacher()");
	}
	public void teach() {
		System.out.println("Teacher teach");
	}
}







