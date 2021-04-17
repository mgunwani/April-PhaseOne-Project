package BigONotations;

public class NotationExampleTwo {

	public static void display(int[] numbers, String[] names) {
		
		// O(n) + O(n) + O(m)
		// O(n)
		
		// O(n) 
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		
		// O(n)
		for (int number : numbers) {
			System.out.println(number);
		}
		
		// O(m)
		for (String name : names) {
			System.out.println(name);
		}
		
	}
	
	public static void main(String[] args) {
		int[] numbers = {10,20,30,40,50,60};
		String[] names = {"King", "Kochhar", "John", "Smith"};
		display(numbers, names);
	}
	
}
