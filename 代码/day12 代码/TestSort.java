package day12;
import java.util.*;
public class TestSort{
	public static void main(String[] args){
		//int[] a = {2,1,4,5,6};
		//java.util.Arrays.sort(a);
		Worker[] w = {
			new Worker("����ϼ",25,5000.0),
			new Worker("������",40,2000.0),
			new Worker("���Ά�",18,1000000.0)			
		};
		
		Arrays.sort(w , new ComparatorB());
		
		for(int i = 0 ; i < w.length; i++){
			w[i].print();
		}
	}
}
class ComparatorA implements Comparator <Worker>{
	/*
	���w1 ���� w2 ǰ��  ���ظ���
	���w1 ���� w2 ����  ��������
	����ν  ���� 0
	*/
	public int compare(Worker w1 , Worker w2){
		if (w1.age < w2.age) return -1;
		else if (w2.age < w1.age) return 1;
		else return 0;
	}
}
class ComparatorB implements Comparator <Worker>{
	public int compare(Worker w1, Worker w2){
		if (w1.salary < w2.salary) return -1;
		else if (w1.salary > w2.salary) return 1;
		else return 0;
	}
}	

class Worker{
	String name;
	int age;
	double salary;
	public Worker(String name,int age, double salary){
		this.name= name;
		this.age = age;
		this.salary = salary;
	}
	public void print(){
		System.out.println(name+"   "+age+"   "+salary);
	}
}