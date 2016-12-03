package Algos;

/**
 * @author saurabh
 * code for prime numbers
 */
public class PrimeNos {
	
	// preventing extra loops
	private static void efficientWay(){
		
		for(int i=2;i<10;i++){
			int count =0;
			for(int j=2;j<=i/2;j++){
				if(i%j==0){
					count++;
					break;
				}
			}
			if(count ==0){
				System.out.print(i+",");
			}
		}
	}
	
	// forward looping
	private static void simpleWay(){

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
	
	// using reverse looping 
	private static void otherWay(){
		for (int i = 1; i < 100; i++) {
			int counter =0;
			for(int j=i;j>=1;j--){
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
	
	public static void main(String[] args) {
		
		PrimeNos.efficientWay();
		System.out.println("\n----------------------");
		PrimeNos.simpleWay();
		System.out.println("\n----------------------");
		PrimeNos.otherWay();
	}
}
