package Algos;

/**
 * @author saurabh
 *
 */
public class QuickSort {
	int[] array;
	
	private void quicklySort(int [] array){
		this.array =array;
		int lowIdx = 0;
		int highIdx = array.length-1;
		sortIt(lowIdx, highIdx);
	}
	
	private void sortIt(int lowIdx,int highIdx){
		int i=lowIdx;
		int j = highIdx;
		
		// get the pivot data
		int pivot = this.array[lowIdx+(highIdx-lowIdx)/2];
		
		while(i<=j){
			while(array[i]<pivot){
				i++;
			}
			while(array[j]>pivot){
				j--;
			}
			
			if(i<=j){
				swap(i, j);
				i++;
				j--;
			}
		}
		
		// recursive call for sorting left and right again and aagain
		if(j>lowIdx){
			sortIt(lowIdx, j);
		}
		if(i<highIdx){
			sortIt(i, highIdx);
		}
	}
	
	private void swap(int i,int j){
		int temp = array[i];
		array[i]=array[j];
		array[j]=temp;
	}
	
	public static void main(String[] args) {
		QuickSort sortObj=  new QuickSort();
		int [] inputArray ={32,45,2,4,76,10,15};
		
		 System.out.println("Before sorting");
	        for(int i:inputArray){
	            System.out.print(i);
	            System.out.print(" ");
	        }
	       
		sortObj.quicklySort(inputArray);
		
		 System.out.println("after sorting");
	        for(int i:inputArray){
	            System.out.print(i);
	            System.out.print(" ");
	        }
	}
}
