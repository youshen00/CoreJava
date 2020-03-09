package day18;

public class TestFinally {
	public static void main(String[] args) {
		System.out.println(fn(2));
		System.out.println(fn(0));
	}
	static int fn(int n) {
		try{
			int a = 6/n;
			return a;
		}
		catch(Exception e) {
			return 0;
		}
		finally {
			return 2;
		}
	}
}
