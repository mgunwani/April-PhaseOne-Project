package searchingdemo;

public class LinearSearchExample {

	public static int linearSearch(int[] array, int target) {

		for (int i = 0; i < array.length; i++) {
			if (array[i] == target) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {

		int[] numbers = { 7, 1, 3, 6, 5 };
		var index = linearSearch(numbers, 60);
		System.out.println(index != -1 ? "Element Found": "Element Not Found");
	}

}
