package day5;
public class TestArrayExpand{
	public static void main(String[] args){
		int[] a = {1,2,3,4,5};
		
		/*
		int[] b = new int[a.length*2];
		for(int i = 0 ; i < a.length ; i++){
			b[i] = a[i] ;
		}
		*/
		int[] b = java.util.Arrays.copyOf(a,a.length*2);
		
		System.out.println(a.length);//5
		a = b ; 
		System.out.println(a.length);//10
		
		for(int i = 0 ; i < a.length ; i++){
			System.out.println(a[i]);
		}
	}
}























