package BigONotations;

public class NotationExampleOne {
	
	public static void display(int[] numbers) {
		// O(1) + O(1)
		// O(2) 
		// O(1) - Constant Notation
		System.out.println(numbers[0]);
		System.out.println(numbers[0]);
	}
	
	public static void main(String[] args) {
		int[] numbers = {10,20,30,40,50,60};
		display(numbers);
	}

}
