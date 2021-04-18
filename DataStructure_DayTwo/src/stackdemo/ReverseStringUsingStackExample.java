package stackdemo;

import java.util.Stack;

public class ReverseStringUsingStackExample {

	public static String reverse(String input) {
		
		String reversed = "";
		Stack<Character> stack = new Stack<Character>();
		for (char ch : input.toCharArray()) {
			stack.push(ch);
		}
		while(!stack.isEmpty()) {
			reversed += stack.pop();
		}
		return reversed;
	}
	
	public static void main(String[] args) {
		
		String originalString = "aba";
		String reversedString = reverse(originalString);
		System.out.println("Original String : " + originalString);
		System.out.println("Reversed String : " + reversedString);
		if(originalString.equals(reversedString)) {
			System.out.println("Palindrome!!");
		} else {
			System.out.println("Not Palindrome!!");
		}
	}
}
