package day6;
public class Exc6_$3{
	
	// a[i]  第i行的皇后, 放在第a[i]列   	
	static int[] a = new int[8];
	
	public static void main(String[] args){
		place(0);
	}
	
	// 放置第n行的皇后  为a[n]赋值 
	static void place(int n){
		//打印结果, 返回
		if (n == 8) {
			for(int i = 0 ; i < a.length ; i++){
				System.out.print(a[i]+"\t");
			}
			System.out.println();
			return;
		}
		
		//尝试 第0列-第7列
		outer:for(a[n] = 0 ; a[n] <= 7 ; a[n]++){
			//如果和前面的某个皇后有冲突, 就尝试下一列
			for(int j = 0 ; j < n ; j++){
				//判断 a[j]和a[n]是否冲突
				if (a[j] == a[n] || a[j]-a[n]==j-n || a[j]-a[n] == n-j) 
					continue outer;
			}
			//如果和前面的所有皇后都没冲突, 放置第n+1行的皇后
			place(n+1);
		}
	}
}








