package day5;
public class TestArray2{
	public static void main(String[] args){
		int[] a = {1,2,3,4,5};
		change(a);
		System.out.println(a[0]);
	}
	static void change(int[] a){
		a[0] = 10 ;
	}
}

