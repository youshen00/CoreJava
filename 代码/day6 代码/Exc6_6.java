package day6;
public class Exc6_6{
	public static void main(String[] args){
		char[] cs = {'A','0','a','c','d','F'};
		
		int result = 0 ; 
		for(int i = 0 ; i < cs.length ; i++){
			if (cs[i]>='a' && cs[i]<='z' ) result++;
		}
		System.out.println(result);
	}
}
