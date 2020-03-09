package day9;
public class TestPolymorphism{
	public static void main(String[] args){
		/*
		java.util.Scanner s=  new java.util.Scanner(System.in);
		int i = s.nextInt();
		
		Animal a = null;
		if (i == 0 ) a = new Dog();
		if (i == 1 ) a = new Cat();
		*/
		Animal a = new Dog();// Dog is a Animal
		a.eat();
		a.sleep(); // sleep 6 hours
		//a.shout();  error!
		
		if (a instanceof Dog){
			Dog d = (Dog)a ; // ���ܳɹ� ,  ����ʧ��
			d.shout();
		}
		
		//Person p = (Person)a; // һ��ʧ��
		/*
		���a��װ���� Person��������� ,��ֵ���п��ܳɹ�
		ʵ����a��װ��һ����Animal��Animal �������
		����Java�ǵ��̳�����, Animal������һ������Person������
		���ǲ����ܳɹ�
		*/
						
	}
}
class Animal{
	public void eat(){
		System.out.println("Animal eat");
	}
	public void sleep(){
		System.out.println("sleep 8 hours");
	}
}
class Dog extends Animal{
	public void sleep(){
		System.out.println("sleep 6 hours");
	}
	public void shout(){
		System.out.println("WangWang");
	}
}
class Cat extends Animal{}

class Person {}























