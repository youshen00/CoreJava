package day11;
public class TestCallback{
	public static void main(String[] args){
		Student[] ss = {};
		Student s = findStudent(ss , new PredicateImplA());
	}

	/*
	//在stus数组找出任意条件的学生
	static Student findStudent(Student[] stus , int age){
		for(int i = 0 ; i < stus.length ; i++){
			if (stus[i].age == age) return stus[i];
		}
		return null;
	}
	*/
	
	/*
	//函数回调    Java不支持 JS支持
	static Student findStudent(Student[] stus , 一个参数为Student,返回值为boolean的一个函数 fn){
		for(int i = 0 ; i < stus.length ; i++){
			if (  fn(stus[i]) ) return stus[i];
		}
		return null;
	}
	*/
	//static Student findStudent(Student[] stus , 对象 必须具有一个方法test,参数Student ,返回值boolean)
	
	static Student findStudent(Student[] stus , Predicate p){
		for(int i = 0 ; i < stus.length ; i++){
			if (p.test(stus[i])) return stus[i];
		}	
		return null;
	}
	
}
interface Predicate{
	boolean test(Student s);
}
class PredicateImplA implements Predicate{
	public boolean test(Student s){
		return s.score == 60;
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























