package day22;
import java.util.*;
public class TestQueue {

	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<>();
		queue.offer("Liucy");
		queue.offer("Lixx");
		queue.offer("Huxz");
		
		//System.out.println(queue.peek());
		
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());

	}

}
