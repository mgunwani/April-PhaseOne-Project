package BigONotations;


class Array {
	
	int[] items;
	int count;
	
	public Array(int length) {
		items = new int[length];
	}
	
	public void insert(int item) {
		// If the array is full, resize it
		if(items.length == count) {
			// Create a new array (Twice the Size)
			int[] newItems = new int[count * 2];
			// Copy all the existing items into new array
			for (int i = 0; i < count; i++) {
				newItems[i] = items[i];
			}
			// set "items" array to this new array
			items = newItems;
		}
		// Add the new item at the end
		items[count++] = item;
	}
	
	public void removeAt(int index) {
		// Validate the index
		if(index <0 || index > count) {
			throw new IllegalArgumentException();
		}
		// Shift the items to the left to fill the hole
		for (int i = index; i < count; i++) {
			items[i] = items[i+1];
		}
		count--;
	}
	
	public void print() {
		System.out.println("Printing Elements: ");
		System.out.println("Array Length: " + items.length);
		for (int i = 0; i < count; i++) {
			System.out.println(items[i]);
		}
	}
	
}

public class ArraysExample {
	public static void main(String[] args) {
		Array array = new Array(3);
		array.insert(100);
		array.insert(200);
		array.insert(300);
		array.insert(400);
		array.insert(500);
		array.insert(600);
		array.insert(700);
		
		array.print();
		array.removeAt(1);
		System.out.println("--------------------------");
		array.print();
	}
}
