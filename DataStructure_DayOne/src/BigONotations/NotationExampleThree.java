package BigONotations;

public class NotationExampleThree {

	public static void display(int[] numbers) {
		
		// Quadratic Notation
		// O(n^2 + n)
		// O(n^2)
		
		// O(n * n)
		// O(n^2)
		
		for (int first : numbers) {	// O(n)
			for (int second : numbers) {	// O(n)
				System.out.println(first + " : " + second);
			}	
		}
		
		// O(n)
		for (int number : numbers) {
			System.out.println(number);
		}
	}

	public static void main(String[] args) {
		int[] numbers = { 10, 20, 30, 40, 50, 60 };
		display(numbers);
	}

}
