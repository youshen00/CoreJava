package day13;

public class TestEquals {

	public static void main(String[] args) {
		
		String s1 = new String("abc");
		String s2 = new String("abc");
		
		System.out.println(s1 == s2);//false
		System.out.println(s1.equals(s2)); //true
		
		
		Employee e1 = new Employee("Liucy",40);
		Employee e2 = new Employee("Liucy",40);
		System.out.println(e1 == e2); //false
		System.out.println(e1.equals(e2)); //true
		
	}

}
class Employee{
	private String name;
	private int age;
	public Employee(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	// this 和  o 对象比较内容
	public boolean equals(Object o) {
		// 判断this和o是不是同一个对象
		if (this == o) return true;
		// 判断 o是不是null
		if (o == null) return false;
		// 判断this 和 o 是否属于同一个类
		if (this.getClass() != o.getClass()) return false;
		// 对o做强制类型转换, 变为Employee类型
		Employee e = (Employee)o;
		// 逐个比较属性  基本类型属性 用==比, 对象类型属性用equals比
		if (this.age == e.age  && this.name.equals(e.name)) return true;
		else return false;		
	}
	
}


