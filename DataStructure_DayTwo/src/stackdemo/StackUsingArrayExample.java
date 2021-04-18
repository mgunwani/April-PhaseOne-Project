package stackdemo;

import java.util.Arrays;

class Stack {
	private int[] items = new int[5];
	private int count;
	
	public void push(int item) {
		if(count == items.length) {
			throw new StackOverflowError();
		}
		items[count++] = item;
	}
	
	public int pop() {
		if(count ==0) {
			throw new IllegalStateException();
		}
		return items[--count];
	}
	
	public int peek() {
		return items[count - 1];
	}

	@Override
	public String toString() {
		return Arrays.toString(Arrays.copyOfRange(items, 0, count));
	}
	
}

public class StackUsingArrayExample {

	public static void main(String[] args) {
		
		Stack stack = new Stack();
		stack.push(100);
		stack.push(200);
		stack.push(300);
		// stack.push(400);
		// stack.push(500);
		System.out.println(stack);
		System.out.println("Element Popped Out is : " + stack.pop());
		System.out.println("Element ready to Pop : " + stack.peek());
		System.out.println(stack);
	}
	
}
