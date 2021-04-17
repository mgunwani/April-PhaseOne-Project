package BigONotations;

public class QuizTime {

	public static void display(int[] items) {
		
		// O(1 + n/2 + 100)
		// O(101 + n)
		// O(n)
		
		// O(1)
		System.out.println(items[0]);
		
		// O(n/2)
		int middleIndex = items.length/2;
		int index = 0;
		while(index < middleIndex) { 
			System.out.println(items[index]);
			index++;
		}
		
		// O(100)
		for (int i = 0; i < 100; i++) {
			System.out.println("Hi");
		}
		
	}
	
	public static void main(String[] args) {
		
		display(new int[] {10,20,30,40,50});
	}
	
}
