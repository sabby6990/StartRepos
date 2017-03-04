package Algos;

public class InsertionSort {

	static void insertion(int[] array) {
		int n = array.length;

		for (int j = 1; j < n; j++) {
			int key= array[j];
			int i= j-1;
			while(i>-1 && array[i]>key){
				array[i+1]=array[i];
				i--;
			}
			array[i+1]=key;
		}
		for (int i = 0; i < n; i++) {
			System.out.print(array[i]+",");
		}

	}

	public static void main(String[] args) {

		int[] array = { 4, 2, 9, 6, 23, 12, 34, 0, 1 };
		insertion(array);

	}
}
