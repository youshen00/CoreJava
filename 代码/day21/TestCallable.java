package day21;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class TestCallable {

	public static void main(String[] args) throws Exception {
		ExecutorService es = Executors.newFixedThreadPool(2);
		
		//线程启动时 拿到Future对象
		Future<Integer> f1 = es.submit(new Task1());
		Future<Integer> f2 = es.submit(new Task2());
		
		//主线程 执行自己的任务
		
		//从Future对象中取到线程的返回值  能取到就取到, 取不到就等待
		Integer result1 = f1.get();
		Integer result2 = f2.get();
		
		System.out.println(result1 + result2);
		es.shutdown();
	}

}

class Task1 implements Callable <Integer>{
	public Integer call () throws Exception{
		int result = 0 ; 
		for(int i =1 ; i <= 10000 ; i+=2)  {
			result += i;
		}
		return result;
	}
}
class Task2 implements Callable <Integer>{
	public Integer call () {
		int result = 0 ; 
		for(int i =2 ; i <= 10000 ; i+=2)  {
			result += i;
		}
		return result;
	}
}
