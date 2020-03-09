package day6;
public class Exc6_12{
	public static void main(String[] args){
		int[][] a = {{3,6,4},{5,8,2}};
		int max = -2147483648; 
		for(int i = 0 ; i < a.length ; i++){
			for(int j = 0 ; j< a[i].length ; j++){
				if (a[i][j] > max) max = a[i][j];
			}
		}
		System.out.println(max);
	}
}