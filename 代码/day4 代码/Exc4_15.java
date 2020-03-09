package day4;
public class Exc4_15{
	public static void main(String[] args){
		int n = 10;
		for(int i = 0 ; i < n ; i++){
			//打印一行
			//先打印 i个1
			for(int j = 1 ; j <= i ; j++){
				System.out.print(1+"\t");
			}
			//循环打印序列
			for(int j = 1 ; j <= n-i ; j++){
				System.out.print(j+"\t");
			}
			//换行
			System.out.println();
		}
	}
}