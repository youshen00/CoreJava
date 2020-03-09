package day10;
abstract class Shape{
	public abstract double girth();
	public abstract double area();
}
class Circle extends Shape{
	private double r;
	public Circle(double r){
		this.r = r;
	}
	public double girth(){
		return Math.PI * 2 * r;
	}
	public double area(){
		return Math.PI * r * r;
	}
}
class Rect extends Shape{
	private double x, y;
	public Rect(double x , double y){
		this.x = x ; 
		this.y = y ;
	}
	public double girth(){
		return (x+y)*2;
	}
	public double area(){
		return x*y;
	}
}
public class TestShape{
	public static void main(String[] agwdkjfgzdkhfsdklchchfsdkhfdks){
		Shape[] s = new Shape[3];
		s[0] = new Rect(4,2);
		s[1] = new Rect(6,4);
		s[2] = new Circle(10);
		for(int i = 0 ; i < s.length ; i++){
			System.out.println(s[i].girth());
			System.out.println(s[i].area());
		}
	}
	
}




