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
	
	// this ��  o ����Ƚ�����
	public boolean equals(Object o) {
		// �ж�this��o�ǲ���ͬһ������
		if (this == o) return true;
		// �ж� o�ǲ���null
		if (o == null) return false;
		// �ж�this �� o �Ƿ�����ͬһ����
		if (this.getClass() != o.getClass()) return false;
		// ��o��ǿ������ת��, ��ΪEmployee����
		Employee e = (Employee)o;
		// ����Ƚ�����  ������������ ��==��, ��������������equals��
		if (this.age == e.age  && this.name.equals(e.name)) return true;
		else return false;		
	}
	
}


