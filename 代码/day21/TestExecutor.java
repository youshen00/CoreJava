package day21;
import java.util.concurrent.*;
public class TestExecutor {

	public static void main(String[] args) {
		ExecutorService es = Executors.newFixedThreadPool(2);
		//ExecutorService es = Executors.newCachedThreadPool();
		
		
		Runnable task1 = new Runnable() {
			public void run() {
				for(int i = 1 ; i <= 100 ; i++) {
					System.out.println("AAA "+i);
				}
			}
		};
		es.submit(task1);

		es.submit(new Runnable() {
			public void run() {
				for(int i = 1 ; i <= 100 ; i++) {
					System.out.println("BBB "+i);
				}
			}
		});
		
		es.submit(()-> {
				for(int i = 1 ; i <= 100 ; i++) {
					System.out.println("CCC "+i);
				}
		});
	}

}

class TaskB implements Runnable{
	public void run() {
		for(int i = 1 ; i <= 100 ; i++) {
			System.out.println("BBB "+i);
		}
	}
}
class TaskC implements Runnable{
	public void run() {
		for(int i = 1 ; i <= 100 ; i++) {
			System.out.println("CCC "+i);
		}
	}
}