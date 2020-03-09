package day22;

public class TestSynchronized {

	public static void main(String[] args) throws Exception{
		MyList list = new MyList();
		Thread t1 = new Thread() {
			public void run() {
				list.add('C');
			}
		};
		Thread t2 = new Thread() {
			public void run() {
				list.add('D');
			}
		};
		t1.start();
		t2.start();
		
		t1.join();//main线程等待t1结束
		t2.join();//main线程等待t2结束
		list.print();
	}

}
class MyList{
	private char[] data = {'A','B',' ',' ',' '};
	private int index  = 2;
	public synchronized void add(char c) {
		data[index] = c;
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		index++;
	}
	
	public void print() {
		for(int i = 0 ; i < data.length ; i++) {
			System.out.print(i+":"+data[i]+"\t");
		}
	}
}

/*
int count = 1;
void sale() {
	if (count > 0) {
		卖一张票
		count--
	}
}
*/



















