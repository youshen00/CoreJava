package day16;
import java.util.*;
public class TestMap {
	public static void main(String[] args) {
		Map<Integer, String> map = new TreeMap<>();
		map.put( 2020, "����");
		map.put( 2024, "����");
		map.put( 2028, "��ɼ�");
		map.put( 2016, "��Լ����¬");
		map.put( 2012, "�׶�");
		map.put( 2008, "����");
		map.put( 2004, "�ŵ�");
		map.put( 2000, "Ϥ��");
		map.put( 1996, "��������");
		map.put( 1992, "��������");
		map.put( 1988, "����");
		map.put( 1984, "��ɼ�");
		map.put( 1980, "Ī˹��");
		map.put( 1976, "��������");
		map.put( 1972, "Ľ���");
		map.put( 1968, "ī�����");
		map.put( 1964, "����");
		map.put( 1960, "����");
		map.put( 1956, "ī����");
		map.put( 1952, "�ն�����");
		map.put( 1948, "�׶�");
		map.put( 1936, "����");

		/*
		String s = map.get(2008);
		System.out.println(s);
		
		System.out.println(map.containsKey(1940));
		System.out.println(map.containsValue("��ɼ�"));
		*/
		/*
		map.put(2020, "פ���");		
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







