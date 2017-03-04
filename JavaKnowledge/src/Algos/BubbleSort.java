package Algos;

public class BubbleSort {
	
	static void bubbleSort(int[] array){
		int n=array.length;
		int temp=0;
		for(int i=0;i<n;i++){
			for(int j=1;j<=n-1;j++){
				if(array[j-1]>array[j]){
					//swap
					temp=array[j-1];
					array[j-1]=array[j];
					array[j]=temp;
				}
			}
		}
		
		for(int i=0;i<n;i++){
			System.out.println(array[i]);
		}
	}
	
	public static void main(String[] args) {

		int[] array = {4, 2, 9, 6, 23, 12, 34, 0, 1};
		bubbleSort(array);
		
	}
}
