package day7;
public class TestReference{
	public static void main(String[] args){
		int a = 10;
		int b = a;
		b++;
		System.out.println(a); //10
		
		MyClass mc1 = new MyClass();
		MyClass mc2 = mc1 ; 
		mc2.value++;
		System.out.println(mc1.value); //21
		
		
		a= 10;
		changeInt(a);
		System.out.println(a); //10
		
		MyClass mc = new MyClass();
		changeValue(mc);
		System.out.println(mc.value); //21
	}
	
	static void changeInt(int a){
		a++;
	}
	static void changeValue(MyClass mc){
		mc.value ++;
	}
}

class MyClass{
	int value = 20;
}