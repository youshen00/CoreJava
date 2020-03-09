package day11;
public class TestCallback{
	public static void main(String[] args){
		Student[] ss = {};
		Student s = findStudent(ss , new PredicateImplA());
	}

	/*
	//��stus�����ҳ�����������ѧ��
	static Student findStudent(Student[] stus , int age){
		for(int i = 0 ; i < stus.length ; i++){
			if (stus[i].age == age) return stus[i];
		}
		return null;
	}
	*/
	
	/*
	//�����ص�    Java��֧�� JS֧��
	static Student findStudent(Student[] stus , һ������ΪStudent,����ֵΪboolean��һ������ fn){
		for(int i = 0 ; i < stus.length ; i++){
			if (  fn(stus[i]) ) return stus[i];
		}
		return null;
	}
	*/
	//static Student findStudent(Student[] stus , ���� �������һ������test,����Student ,����ֵboolean)
	
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























