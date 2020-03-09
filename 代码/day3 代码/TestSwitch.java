package day3;
public class TestSwitch{
	public static void main(String[] args){
		java.util.Scanner s  = new java.util.Scanner(System.in);
		int score = s.nextInt();
		
		switch(score){
			case 0: System.out.println("弱智"); break;
			case 1:
			case 2: System.out.println("差"); break;
			case 3:
			case 4: System.out.println("良好");break;
			case 5: System.out.println("优秀");break;
			default: System.out.println("数据有误");
		}

	}
}