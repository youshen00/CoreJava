package day15;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class TestListIterator {
	static String result = "";
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("Huxz");
		list.add("Lixx");
		list.add("Liucy");
		
		/*
		class MyConsumer implements Consumer{
			public void accept(Object o) {
				System.out.println(o);
			}
		}
		list.forEach(new MyConsumer());
		
		list.forEach(new Consumer() {
			public void accept(Object o) {
				System.out.println(o);
			}
		});
		*/
		
		list.forEach(o->System.out.println(o));
		//list.forEach(System.out::println);  方法引用
		
		/*
		for(int i = 0 ; i < list.size() ; i++) {
			Object o = list.get(i);
			System.out.println(o);
		}
		*/
		

		/*
		for(int i = 0 ; i < list.size() ; i++) {
			Object o = list.get(i);
			result += o;
		}*/
		
		list.forEach(o->result+=o);
		System.out.println(result);
		/*
		for(int i = 0 ; i < list.size() ; i++) {
			Object o = list.get(i);
			System.out.println(o.hashCode());
		}
		*/
		list.forEach(o->System.out.println(o.hashCode()));
	}

}


/*
public void forEach(Consumer c) {
	遍历集合  找出每个元素o
	c.accept(o);
}
*/








