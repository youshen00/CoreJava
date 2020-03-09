package day12;
public class TestCallback{
	public static void main(String[] args){
		Student[] ss = {
			new Student("刘春阳",30,60.0),
			new Student("李晓霞",20,85.0),
			new Student("胡鑫喆",18,100.0),
			new Student("王亭",25,70.0),
		};
		
		/*
		Student s = find3(ss, 20);
		s = find4(ss, 60.0);
		s = find5(ss, 60.0 , 1 );
		*/
		//s = find6(ss , function(s){return s.age==18;});
		
		Test t = new TestAnyAgeAndScore(25,70.0);
		Student s = find7(ss, t);
		System.out.println(s.name);
	}
	
	static Student find1(Student[] ss){
		for(int i = 0 ; i < ss.length; i++){
			if (ss[i].age == 18) return ss[i];
		}
		return null;
	}
	static Student find2(Student[] ss){
		for(int i = 0 ; i < ss.length; i++){
			if (ss[i].age == 20) return ss[i];
		}
		return null;
	}	
	static Student find3(Student[] ss , int n){
		for(int i = 0 ; i < ss.length; i++){
			if (ss[i].age == n) return ss[i];
		}
		return null;
	}
	static Student find4(Student[] ss , double n){
		for(int i = 0 ; i < ss.length ; i++){
			if (ss[i].score == n) return ss[i];
		}
		return null;
	}
	// bad smell
	static Student find5(Student[] ss , double n,int t){
		for(int i = 0 ; i < ss.length ; i++){
			if (t == 0 && ss[i].age == n) return ss[i];
			if (t == 1 && ss[i].score ==n) return ss[i];
		}
		return null;
	}
		
	//函数回调
	/*
	static Student find6(Student[] ss, fn){ // fn函数参数为Student,返回值boolean
		for(int i = 0 ; i < ss.length ; i++){
			if (  fn(ss[i])  ) return ss[i];
		}
		return null;
	}
	*/
	
	// 传入的对象,必须具有一个 boolean test(Student s) 的方法
	static Student find7(Student[] ss , Test t){
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
	public boolean test(Student s){
		return s.age == 18;
	}
}
class TestScore implements Test{
	public boolean test(Student s){
		return s.score == 60.0;
	}
}
class TestAnyAge implements Test{
	int age;
	public TestAnyAge(int age){
		this.age =age;
	}
	public boolean test(Student s){
		return s.age == age;
	}
}
class TestAnyAgeAndScore implements Test{
	int age ;
	double score;
	public TestAnyAgeAndScore(int age,  double score){
		this.age =age;
		this.score = score;
	}
	public boolean test(Student s){
		return s.age == age && s.score==score;
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























