package Algos;

import java.util.ArrayList;

public class ReverseNumber {
public static void main(String[] args) {
	int num=1768;
	int rev=0;
	while(num!=0){
		// good logic
		rev = (rev*10)+(num%10);
		num = num/10;
		
	}
	System.out.println(rev);
}
}
