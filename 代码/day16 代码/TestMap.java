package day16;
import java.util.*;
public class TestMap {
	public static void main(String[] args) {
		Map<Integer, String> map = new TreeMap<>();
		map.put( 2020, "东京");
		map.put( 2024, "巴黎");
		map.put( 2028, "洛杉矶");
		map.put( 2016, "里约热内卢");
		map.put( 2012, "伦敦");
		map.put( 2008, "北京");
		map.put( 2004, "雅典");
		map.put( 2000, "悉尼");
		map.put( 1996, "亚特兰大");
		map.put( 1992, "巴塞罗那");
		map.put( 1988, "汉城");
		map.put( 1984, "洛杉矶");
		map.put( 1980, "莫斯科");
		map.put( 1976, "蒙特利尔");
		map.put( 1972, "慕尼黑");
		map.put( 1968, "墨西哥城");
		map.put( 1964, "东京");
		map.put( 1960, "罗马");
		map.put( 1956, "墨尔本");
		map.put( 1952, "赫尔辛基");
		map.put( 1948, "伦敦");
		map.put( 1936, "柏林");

		/*
		String s = map.get(2008);
		System.out.println(s);
		
		System.out.println(map.containsKey(1940));
		System.out.println(map.containsValue("洛杉矶"));
		*/
		/*
		map.put(2020, "驻马店");		
		System.out.println(map.get(2020));
		*/
		/*
		Set<Integer> ks = map.keySet();
		for(Integer key : ks) {
			String value = map.get(key);
			System.out.println(key+" : "+value);
		}
		
		Collection<String> vs = map.values();
		for(String value : vs) {
			System.out.println(value);
		}*/
		
		map.forEach((k,v)->System.out.println(k+" --- "+v));
	}
}







