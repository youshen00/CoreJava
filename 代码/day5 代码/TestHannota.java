package day5;
public class TestHannota{
	public static void main(String[] args){
		
		/*
		移动n个盘子  从A到B 借助C  - 大问题
		  --->  移动 n-1 个盘子  从A到C 借助B   - 小问题
		  --->  将大盘子 从A到B                 - 不是问题
		  --->  移动 n-1 个盘子  从C到B 借助A   - 小问题
		*/
		
		transfer(4,'A','B','C');
	}
	
	//把n个盘子, 从from移到to,借助temp
	static void transfer(int n , char from , char to , char temp){
		//返回条件
		if (n == 0 ) return ;
		
		//把 n-1个盘子 从from 移到 temp 借助to
		transfer(n-1, from , temp , to);
		
		// 将大盘子从from移到to
		System.out.println(from + "----->" + to);
		
		//把 n-1个盘子, 从temp移到 to 借助 from
		transfer(n-1 , temp , to , from);
	}
}
