package day3;
public class TestIfElse{
	public static void main(String[] args){
		java.util.Scanner s = new java.util.Scanner(System.in);
		int age = s.nextInt();
		
		if (age < 6) System.out.println("婴幼儿");
		else if (age < 12) System.out.println("儿童");
		else if (age < 18) System.out.println("青少年");
		else if (age < 50) System.out.println("青年");
		else System.out.println("中老年");
		
		
	}
}