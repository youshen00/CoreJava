package day20;

import java.io.*;

public class TestClone {
	public static void main(String[] args) {
		Teacher t = new Teacher("Huxz", 18);
		Student s = new Student("Liucy" , 40 , t);
		Student s2 = (Student)s.clone();
		
		System.out.println(s);
		System.out.println(s2);
		System.out.println(s == s2);
		
		System.out.println(s.getTeacher() == s2.getTeacher());
	}
}

class Student implements Serializable{
	private String name;
	private int age;
	private Teacher teacher;
	public Student(String name, int age, Teacher teacher) {
		super();
		this.name = name;
		this.age = age;
		this.teacher = teacher;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", teacher=" + teacher + "]";
	}
	
	@Override
	public Object clone() {
		byte[] bs = null; 
		try(
			ByteArrayOutputStream bos = new ByteArrayOutputStream();
			ObjectOutputStream out = new ObjectOutputStream(bos)
		){
			out.writeObject(this);
			bs = bos.toByteArray();
		}
		catch(Exception e) {}
		
		try(
			ByteArrayInputStream bis = new ByteArrayInputStream(bs);
			ObjectInputStream in = new ObjectInputStream(bis)
		){
			Object o = in.readObject();
			return o;
		}
		catch(Exception e) {
			return null;
		}
	}
	
}
class Teacher implements Serializable{
	private String name;
	private int age;
	public Teacher(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Teacher [name=" + name + ", age=" + age + "]";
	}
	
}