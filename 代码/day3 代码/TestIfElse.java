package day3;
public class TestIfElse{
	public static void main(String[] args){
		java.util.Scanner s = new java.util.Scanner(System.in);
		int age = s.nextInt();
		
		if (age < 6) System.out.println("Ӥ�׶�");
		else if (age < 12) System.out.println("��ͯ");
		else if (age < 18) System.out.println("������");
		else if (age < 50) System.out.println("����");
		else System.out.println("������");
		
		
	}
}