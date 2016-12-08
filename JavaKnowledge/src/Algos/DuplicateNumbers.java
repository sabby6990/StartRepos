package Algos;

import java.util.ArrayList;
import java.util.List;

/**
 * @author saurabh
 *
 */
public class DuplicateNumbers {
	
	
	/**
	 * @param list
	 */
	private static int  findDuplicate(List<Integer> list){
		
		int highNum = list.size()-1;
		int total = getSum(list);
		
		// the magic formulae 
		// THIS will only find one duplicate value
		int duplicateNumber = total -(highNum * (highNum+1)/2);
		
		return duplicateNumber;
	}
	
	private static int getSum(List<Integer> num) {
			int sum =0;
			for(Integer number : num){
				sum += number;
			}
			return sum;
	} 
	
	
	private static void allDuplicates(List<Integer> list) {
		List<Integer> newList = new ArrayList<Integer>();

		for (int i = 0; i < list.size(); i++) {

			for (int j = i + 1; j < list.size(); j++) {

				if (list.get(i).equals(list.get(j))) {
					newList.add(list.get(i));
				}

			}
		}
		for (Integer in : newList) {

			System.out.print(in + ",");
		}
	}
	
	public static void main(String[] args) {
		List<Integer> numList = new ArrayList<>();
		for(Integer i=1;i<6;i++){
			numList.add(i);
		}
		numList.add(2);
		// this will only work when there is only one duplicate value
		// which is useless :p
		
		System.out.println(findDuplicate(numList));
		numList.add(4);
		
		
		System.out.println("----------------------------");
		allDuplicates(numList);
	}

}
