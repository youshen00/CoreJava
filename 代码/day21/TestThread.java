package day21;

public class TestThread {

	public static void main(String[] args) {
		Runnable task1 = new TaskA();
		Thread t1 = new Thread(task1);
		
		Thread t2 = new ThreadB();
		
//		Scanner s = new Scanner(System.in);
//		String str = s.next();
//		FileInputStream fis = new FileInputStream("A.TXT");
//		fis.read(); //Ïß³ÌµÈ´ý
		
		t1.start();
		t2.start();

	}

}

class TaskA implements Runnable{
	public void run() {
		for(int i = 1 ; i <= 100 ; i++) {
			System.out.println("AAA "+i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
class ThreadB extends Thread{
	@Override
	public void run() {
		for(int i = 1 ; i <= 100 ; i++) {
			System.out.println("BBB "+i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

