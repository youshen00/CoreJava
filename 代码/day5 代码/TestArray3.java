package day5;
public class TestArray3{
	public static void main(String[] args){
		//int[][] a ; 
		//a = new int[3][4];
		
		int[][] a = {{1,2,3,4},{5,6,7,8,9},{0,0,0}};
		
		/*
		int[][] a = new int[3][];
		a[0] = new int[5];
		a[1] = new int[3];
		a[2] = new int[4];
		*/
		
		/*
		a[0][0] a[0][1] a[0][2] a[0][3]
		a[1][0] a[1][1] a[1][2] a[1][3]
		a[2][0] a[2][1] a[2][2] a[2][3]
		*/
		
		
		
		//遍历a数组
		for(int i = 0 ; i < a.length ; i++){
			// 遍历 a[i] 数组
			for(int j = 0 ; j < a[i].length ; j++){
				System.out.print(a[i][j]+"\t");
			}
			
			System.out.println();
		}
	}
}