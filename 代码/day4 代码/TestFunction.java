package day4;
public class TestFunction{
	public static void main(String[] args){
		printChars(30 , '-');
		System.out.println("�����ٸ���֪��");
		printChars(20 , '*');
		System.out.println("������װ�ϴ�¥");
		printChars(40 , '+');
		System.out.println("����İͷ����ɫ");
		printChars(25 , '?');
		System.out.println("�ڽ̷����ٷ��");
		printChars(35 , '^');
		
		ma(10);
		
		System.out.println(add(10 , 20));
		
	}
	//��ӡ�ָ���
	static void printChars(int length , char c){
		if (length == 0) return;
		for(int i = 1 ; i <= length ; i++){
			System.out.print(c);
		}
		System.out.println();
	}
	
	static void ma(int x){
		System.out.println(x);
	}
	
	static int add(int a , int b){
		int c = a + b ; 
		if (c >= 0) return c;
		else return 0;
	}
}




