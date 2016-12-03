package challenge;

import java.util.Scanner;

public class FactorialChallenge {
public static void main(String[] args) {
	

	Scanner inputScanner = new Scanner(System.in);
	int fact =1;
	int inputNumber = inputScanner.nextInt();
	for(int i=1 ; i <=inputNumber;i++){
		fact =fact *i;	
	}
	inputScanner.close();
	System.out.println("factorial is "+fact);
}
}
