package searchingdemo;

public class BinarySearchExample {

	public static int binarySearch(int[] array, int target) {
		var left = 0;
		var right = array.length - 1;
		while (left <= right) {
			int middle = (left + right) / 2;
			if (array[middle] == target) {
				return middle;
			}
			if (target < array[middle]) {
				right = middle - 1;
			}
			if (target > array[middle]) {
				left = middle + 1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {

		int[] numbers = { 5, 10, 12, 15, 20 };
		var index = binarySearch(numbers, 120);
		System.out.println(index != -1 ? "Element Found at " + index : "Element Not Found");

	}

}
