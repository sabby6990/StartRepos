package challenge;

import java.util.Scanner;

public class OddEvenChallenge {
	
	private boolean isEven(int input){
		
		return true;
	}
public static void main(String[] args) {
	
	System.out.println("Please enter total numbers in the array");
	Scanner sc = new Scanner(System.in);
	int size =sc.nextInt();
	int [] inputArray = new int[size];
		
	System.out.println("Enter the array elements!");
	for(int i=0;i<inputArray.length;i++){
		inputArray[i] = sc.nextInt();
	}
	sc.close();
	int evenSum =0;
	int oddSum =0;
	for(int input : inputArray){
		
		if((input&1)==0){
			evenSum+=input;
		}else{
			oddSum+=input;
		}
	}
	System.out.println(evenSum-oddSum);
}
}
