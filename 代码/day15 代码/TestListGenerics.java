package day15;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestListGenerics {

	public static void main(String[] args) {
		List<String> ls = new ArrayList<>();
		ls.add("abc");
		ls.add("xyz");
		//ls.add(12);

		for(int i = 0 ; i < ls.size() ; i++) {
			String s = ls.get(i);
			System.out.println(s.toUpperCase());
		}
		
		Iterator<String> it = ls.iterator();
		while(it.hasNext()) {
			String s = it.next();
			System.out.println(s.toUpperCase());
		}
		
		for(String s : ls) {
			System.out.println(s.toUpperCase());
		}
		
		/*
		ls.forEach(new Consumer<String>() {
			public void accept(String s) {
				System.out.println(s.toUpperCase());
			}
		});  */
		
		ls.forEach(s->System.out.println(s.toUpperCase()));

	}

}
