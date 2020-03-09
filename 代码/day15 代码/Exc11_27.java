package day15;

public class Exc11_27 {

	public static void main(String[] args) {
		String str = "123098374350458946879457443290271411223495867707980";
		
		int[] c = new int[10]; // c[i] 表示 数字i的个数
		
		for(int i = 0 ; i < str.length() ; i++) {
			char ch = str.charAt(i);
			c[ ch - '0']++;
 		}
		
		for(int i = 0 ; i < c.length ; i++) {
			System.out.println(i+":"+c[i]);
		}
	}

}
