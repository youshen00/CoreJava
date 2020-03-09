package day17;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class TestSales {
	static double result2 = 0 ; 
	public static void main(String[] args) {
		Set<Sales> hs = new HashSet<>();
		hs.add(new Sales("Zhang3" , 20.5 , "DeptA"));
		hs.add(new Sales("li4" , 30.5 , "DeptA"));
		hs.add(new Sales("wang5" , 10.3 , "DeptB"));
		hs.add(new Sales("zhao6" , 40.8 , "DeptB"));
		hs.add(new Sales("liucy" , 8.8 , "DeptC"));
		hs.add(new Sales("Huxz" , 100 , "DeptD"));
		hs.add(new Sales("lixx" , 50.0 , "DeptD"));
		hs.add(new Sales("wangt" , 20.4 , "DeptA"));
		hs.add(new Sales("zhangmj" , 30.6 , "DeptA"));
		hs.add(new Sales("chenpx" , 23.6 , "DeptB"));
		hs.add(new Sales("luxw" , 54.9 , "DeptC"));
		hs.add(new Sales("luxw" , 54.9 , "DeptC"));
		
		hs.forEach(s->System.out.println(s));
		
		//No4
		double result = 0 ; 
		for(Sales s : hs) {
			result += s.getSale();
		}
		System.out.println(result);
		
		hs.forEach(s->result2+=s.getSale());
		System.out.println(result2);
		
		//No5
		StringBuilder sb =new StringBuilder();
		for(Sales s : hs) {
			sb.append(s.getName()).append(',');
		}
		String names = sb.toString();
		names = names.substring(0 , names.length()-1);
		System.out.println(names);
		
		//No6  key:部门   value:该部门的总销量
		Map<String , Double> map = new HashMap<>();
		for(Sales s : hs) {
			String dept = s.getDept();
			if (map.containsKey(dept)) {
				double salestotal = map.get(dept);
				salestotal += s.getSale();
				map.put(dept, salestotal);
			}
			else {
				map.put(dept, s.getSale());
			}
		}
		map.forEach((k,v)->System.out.println("部门:"+k+" 总销量:"+v));
		
		//No7  1)
		Map<String,String> salesMap = new HashMap<>();
		for(Sales s: hs) {
			salesMap.put(s.getName(),s.getDept());
		}
		Collection<String> vs = salesMap.values();
		Set<String> resultSet = new HashSet<>();
		resultSet.addAll(vs);
		/*
		 * for(String s : vs){
		 * 		resultSet.add(s);
		 * }
		 */
		System.out.println(resultSet.size());
		resultSet.forEach(s->System.out.println(s));
		
		// No7 2)
		Scanner scan = new Scanner(System.in);
		String deptName = scan.next();
		
		Set<String> keys = salesMap.keySet();
		for(String name : keys) {
			String dept = salesMap.get(name);
			if (dept.equals(deptName)) System.out.println(name);
		}
				
		salesMap.forEach((name,dept)->{
			if (dept.equals(deptName)) System.out.println(name);
		});
		
		//No8
		String str = "ABCDEFGAMBNCY";
		Set<Character> charSet = new HashSet<>();
		for(int i = 0 ; i < str.length() ; i++) {
			char c= str.charAt(i);
			if (charSet.add(c) == false) System.out.println(c);
		}
		
		//No9
		Map<String,String> users = new HashMap<>();
		
		str = "liucy=12345,lixx=54321,huxz=0000";
		String[] ss = str.split(",");
		for(String subs : ss) {
			String[] subss = subs.split("=");
			users.put(subss[0], subss[1]);
		}
		
		String username = scan.next();
		if (users.containsKey(username)) System.out.println(users.get(username));
		else System.out.println("用户不存在");
	}

}

class Sales{
	private String name;
	private double sale;
	private String dept;
	public Sales(String name, double sale, String dept) {
		super();
		this.name = name;
		this.sale = sale;
		this.dept = dept;
	}
	public String getName() {
		return name;
	}
	public double getSale() {
		return sale;
	}
	public String getDept() {
		return dept;
	}
	public String toString() {
		StringBuilder sb = new StringBuilder();
		return sb.append("name=").append(name).append("  sale=").append(sale).append(" dept=").append(dept).toString();
	}
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null) return false;
		if (this.getClass() != o.getClass()) return false;
		Sales s = (Sales)o;
		if (this.name.equals(s.name) && this.sale == s.sale && this.dept.equals(s.dept)) return true;
		else return false;
	}
	public int hashCode() {
		Double d = sale;
		return this.name.hashCode() + this.dept.hashCode() + d.hashCode();
	}
}





































