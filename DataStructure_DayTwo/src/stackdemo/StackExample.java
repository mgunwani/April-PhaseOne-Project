package stackdemo;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {

		Stack<Integer> stack = new Stack<Integer>();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		System.out.println(stack);
		System.out.println("Popped Out Element: " + stack.pop());
		System.out.println("Element ready to pop : " + stack.peek());
		System.out.println(stack.isEmpty() ? "Stack is Empty!!" : "Stack is not Empty");
		System.out.println(stack);

	}

}
