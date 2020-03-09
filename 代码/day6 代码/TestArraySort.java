package day6;
public class TestArraySort{
	public static void main(String[] args){
		int[] a = {3,2,7,9,6,1};
		
		/*
		// √∞≈›≈≈–Ú
		for(int i = 0 ; i < a.length-1 ; i++){
			for(int j = 0 ; j < a.length-1-i; j++){
				if (a[j] > a[j+1]){
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
		*/
		/*
		//—°‘Ò≈≈–Ú
		for(int i = 0 ; i < a.length-1 ; i++){
			for(int j = i+1 ; j < a.length ; j++){
				if (a[i] > a[j]){
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		*/
		java.util.Arrays.sort(a);		
		
		for(int i = 0 ; i < a.length ; i++){
			System.out.print(a[i]+"  ");
		}
		
	}
}
