package day16;
import java.util.*;
public class TestList {

	public static void main(String[] args) {
		List<String> ls = new ArrayList<>();
		ls.add("Liucy");
		ls.add("Lixx");
		ls.add(0,"Huxz");
		
		for(int i = 0 ; i < ls.size() ; i++) {
			String s = ls.get(i);
			System.out.println(s);
		}
		
		for(String s : ls) {
			System.out.println(s);
		}
		
		ls.forEach(s->System.out.println(s));
	}

}
