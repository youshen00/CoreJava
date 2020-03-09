package day23;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
public class TestClass {
	public static void main(String[] args) throws Exception{
		Class c1 = ArrayList.class;
		
		List l = new ArrayList();
		Class c2 = l.getClass();
		
		String classname = "java.util.ArrayList";
		Class c3 = Class.forName(classname);
		
		System.out.println(c1.getName());
		System.out.println(c1.getSuperclass().getName());
		
		Class[] cs = c1.getInterfaces();
		for(Class c : cs) {
			System.out.println(c.getName());
		}
		
		Method[] ms = c1.getDeclaredMethods();
		for(Method m : ms) {
			System.out.println(m.getName());
		}
	}
}



