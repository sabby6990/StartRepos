package Algos;

public class PrimeNos {
	public static void main(String[] args) {
		for (int i = 1; i < 100; i++) {
			int counter =0;
			for(int j=1;j<=i;j++){
				if(i==1){
					counter=2;
					break;
				}
				if(i%j==0){
					counter++;
				}
			}
			if(counter ==2){
				// divisible by 1 and itself so two !!
				System.out.print(i+",");
			}
		}
	}
}
