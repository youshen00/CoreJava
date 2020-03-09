package day5;
public class TestArray{
	public static void main(String[] args){
		//int[] a ;  // 多个int类型变量 
		//a = new int[5] ; //为数组分配空间
		int[] a = {2,1,6,7,9};
		
		System.out.println(a.length);
		
		for(int i = 0 ; i < a.length ; i++){
			System.out.println(a[i]);
		}
		//数组的遍历  按顺序访问数组中的所有元素
		
	}
}