package day6;
public class Exc4_$4{
	public static void main(String[] args){
		int[] a = {2,5,4,8,7,5,8,4,7};
		int result = 0;
		for(int i = 0 ; i < a.length ; i++){
			result = result ^ a[i] ;
		}
		System.out.println(result);
	}
}