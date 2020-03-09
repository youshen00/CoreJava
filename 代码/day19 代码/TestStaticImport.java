package day19;

import static java.lang.Math.*; // 访问Math类中所有的静态成员时, 可以不写类名
import static java.lang.System.*;
public class TestStaticImport {

	public static void main(String... args) {
		out.println(PI);
		out.println(random());
		out.println(E);
		
		//fn();
		//fn(1);
		//fn(1,2);
		fn(1,2,3,4,5,6,7,8,9);
	}
	
	//a: 0-n个参数
	static void fn(int...  a) {
		for(int i : a) {
			System.out.println(i);
		}
	} 

	//m(1,2,3);
	static void m(int a , int... b) {}
	
}
