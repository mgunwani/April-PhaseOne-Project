package queuedemo;

import java.util.*;

public class QueueExample {

	public static void main(String[] args) {
	
		Queue<Integer> queue = new ArrayDeque<Integer>();
		queue.add(100);
		queue.add(200);
		queue.add(300);
		System.out.println(queue);
		System.out.println("Element Dequeued : " + queue.remove());
		System.out.println("Element Ready to Dequeue : " + queue.element());
		System.out.println(queue);
		
	}
	
	
}
