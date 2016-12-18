package Algos;

/**
 * compare the search key with mid index value
 * if equal --> found
 * if not check greater or less and divide into left sub array or right sub array
 * then just modify
 * */
public class BinarySearch {

	static int binarySearch(int[] intArray, int searchKey) {

		int startIndex = 0;
		int endIndex = intArray.length - 1;

		while (startIndex <= endIndex) {
			int mid = (startIndex + endIndex) / 2;
			if (intArray[mid] == searchKey) {
				return mid;
			}
			if (searchKey > intArray[mid]) {
				startIndex = mid + 1;
			} else {
				endIndex = mid - 1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int sortedArray[] = { 2, 3, 4, 5, 6, 7 };
		int searchKey = 7;
		System.out.println(searchKey + " found at index = " + binarySearch(sortedArray, searchKey));
	}

}
