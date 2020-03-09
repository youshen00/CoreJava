package day3;
public class TestBreakContinue{
	public static void main(String[] args){
		for(int i = 1 ; i <= 10 ; i++){
			if (i == 4) continue;
			System.out.println("HelloWorld "+i);
			if (i == 8) break;
		}
		
		outer:for(int i = 1;  i <= 3 ; i++){
			for(int j = 1; j <= 4 ; j++){
				System.out.print("i="+i+" j="+j+"\t\t");
				if (i == 2 && j == 3) break outer;
			}
			System.out.println();
		}
	}
}
