package day13;
public class TestLambda {

	public static void main(String[] args) {
		Student[] ss = {
				new Student("ºúöÎ†´" , 18 , 100.0),
				new Student("Áõ´ºÑô" , 50 , 60.0),
				new Student("ÀîÏşÏ¼" , 20 , 80.0),
				new Student("ÍõÍ¤", 30 , 75.0)
		};
		
		/*
		class TestImpl implements Test{
			public boolean test(Student s) {
				return s.getAge() == 18;
			}
		}
		Test t = new TestImpl();
		Student s = find(ss , t);
		*/
		
		Test t1 = new Test() {
			public boolean test(Student s) {
				return s.getAge() == 18;
			}
		};
		Test t2 = (Student s)->{return s.getAge()==18;};
		Test t3 = (s)->{return s.getAge()==18;};
		Test t4 = s->{return s.getAge()==18;};
		Test t5 = s->s.getAge()==18;
		
		
		Student stu = find(ss, s->s.getScore()==60);		
		
		stu = find(ss, new Test() {
			public boolean test(Student s) {
				return s.getAge()<30;
			}
		});
		stu = find(ss , s->s.getAge()<30);
		
		
		System.out.println(stu.getName());
	}
	
	static Student find(Student[] ss , Test t) {
		for(int i = 0 ; i < ss.length ; i++) {
			if ( t.test(ss[i]) ) return ss[i];
		}
		return null;
	}

}
interface Test{
	boolean test(Student s);
}
class Student{
	private String name;
	private int age;
	private double score;
	public Student(String name, int age, double score) {
		super();
		this.name = name;
		this.age = age;
		this.score = score;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public double getScore() {
		return score;
	}
	
}