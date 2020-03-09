package day4;
public class Exc4_14{
	public static void main(String[] args){
		for(int a = 0 ; a <= 33 ; a++){
			int maxb = (100-3*a)/2;
			for(int b = 0 ; b <= maxb ; b++){
				int c = 100 -a -b;
				if (a*3+b*2+c/3 == 100 && c%3 ==0){
					System.out.println(a+"\t"+b+"\t"+c);
				}
			}
		}
	}
}