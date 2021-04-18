package queuedemo;

import java.util.Arrays;

class ArrayQueue {
	
	private int[] items;
	private int rear;
	private int front;
	private int count;
	
	public ArrayQueue(int capacity) {
		items = new int[capacity];
	}
	
	public void enqueue(int item) {
		if(count == items.length) {
			throw new IllegalStateException();
		} 
		items[rear++] = item;
		count++;
	}
	
	public int dequeue() {
		int item = items[front];
		items[front++] = 0;
		count--;
		return item;
	}

	@Override
	public String toString() {
		return Arrays.toString(Arrays.copyOfRange(items, front, rear));
	}
	
}

public class QueueUsingArrayExample {

	public static void main(String[] args) {
		
		ArrayQueue queue = new ArrayQueue(5);
		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(30);
		System.out.println(queue);
		System.out.println("Element Dequeued : " + queue.dequeue());
		System.out.println("Element Dequeued : " + queue.dequeue());
		System.out.println(queue);
	}
	
	
}
