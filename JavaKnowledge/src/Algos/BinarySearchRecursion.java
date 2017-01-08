package Algos;

/**
 * binary search using recursive method
 * 
 * */
public class BinarySearchRecursion {

	static int recursiveBinarySearch(int[] array, int startIndex, int endIndex, int key) {

		if (startIndex < endIndex) {
			int midIndex = startIndex + (endIndex - startIndex) / 2;

			if (key < array[midIndex]) {
				return recursiveBinarySearch(array, startIndex, midIndex, key);
			} else if (key > array[midIndex]) {
				return recursiveBinarySearch(array, midIndex + 1, endIndex, key);
			} else {
				return midIndex;
			}	

		}
		return -1;
	}

	public static void main(String[] args) {
		int[] arrayInt = { 2, 3, 4, 5, 6, 7, 8, 9 };
		int key = 7;
		System.out.println(key + " is at index = " + recursiveBinarySearch(arrayInt, 0, arrayInt.length - 1, key));
	}

}
