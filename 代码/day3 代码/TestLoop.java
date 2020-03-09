package day3;
public class TestLoop{
	public static void main(String[] args){
		int result = 0 ; 
		
		/*
		int i = 1; 
		while(i <= 100){
			result += i;
			i++;
		}
		*/
		/*
		int i = 1 ; 
		do{
			result += i;
			i++;
		}
		while(i <= 100);
		*/
		
		for(int i = 1 ; i <= 100 ; i++){
			result += i;
		}
		System.out.println(result);
	}
}