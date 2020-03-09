package day12;
public class TestInner{
	public static void main(String[] args){
		Outer out = new Outer();
		out.method(30);
	}
}

class Outer{
	private int a = 10;
	private static int b = 20;
	//成员内部类
	class MemberInner{
		private int a = 30;
		public void print(){
			int a = 50;
			System.out.println(a);//50
			System.out.println(this.a);//30
			System.out.println(Outer.this.a); // 10
			System.out.println(b); //20
		}
	} 
	//静态内部类
	static class StaticInner{
		public void print(){
			//System.out.println(a); error!
			System.out.println(b);
		}
	}
	public void method(int x){
		int y = 40;
		//局部内部类
		class LocalInner{
			public void print(){
				System.out.println(a);
				System.out.println(b);
				System.out.println(x);
				System.out.println(y);
			}
		}
		
		LocalInner in =new LocalInner();
		in.print();
	}
}

/*
public void method(int x){
		int y = 40;
		//局部内部类
		class LocalInner{
			int x;
			int y;
			public LocalInner(int x,int y){
				this.x = x;
				this.y = y;
			}
			public void print(){
				System.out.println(a);
				System.out.println(b);
				System.out.println(x);// x属性
				System.out.println(y);// y属性
			}
		}
		
		LocalInner in =new LocalInner(x,y);
		y++; // 局部变量y改成41   LocalInner中的y属性 还是40
		in.print();
	}

*/







