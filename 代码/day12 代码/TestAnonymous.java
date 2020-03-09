package day12;
import java.util.*;
public class TestAnonymous{
	public static void main(String[] args){
		Student[] ss = {
			new Student("Áõ´ºÑô",30,60.0),
			new Student("ÀîÏşÏ¼",20,85.0),
			new Student("ºúöÎ†´",18,100.0),
			new Student("ÍõÍ¤",25,70.0),
		};
		
		Scanner s = new Scanner(System.in);
		final int a = s.nextInt();
		
		class TestImpl implements Test{
			public boolean test(Student s){
				return s.age == a;
			}
		}
		Student stu = find(ss, new TestImpl());
		
		
		stu = find(ss, new Test(){
			public boolean test(Student s){
				return s.age == a;
			}
		});
		
		System.out.println(stu.name);
	}
	static Student find(Student[] ss , Test t){
		for(int i = 0 ; i < ss.length; i++){
			if ( t.test(ss[i]) ) return ss[i];
		}
		return null;
	}
	
}

interface Test{
	boolean test(Student s);
}
class TestAge implements Test{
	int a;
	public TestAge(int a){
		this.a =a ; 
	}
	public boolean test(Student s){
		return s.age == a;
	}
}
class Student{
	String name;
	int age;
	double score;
	public Student(String name,int age,double score){
		this.name = name;
		this.age =age;
		this.score= score;
	}
}

interface IA{
	void m1();
	void m2();
}
interface IB{
	void m3();
	void m4();
}
static void m(IA a , IB b){}

m(new IA(){
	public void m1(){
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	public void m2(){
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
} , new IB(){
	public void m3(){
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	public void m4(){
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
} );











