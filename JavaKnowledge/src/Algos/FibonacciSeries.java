package Algos;

public class FibonacciSeries {
	static int sum1=0,num1=0,num2=1;
	
	private static void recursive(int count){
		
		if(count>0){
			sum1=num1+num2;
			System.out.println(sum1);
			//swap
			num1=num2;
			num2=sum1;
			recursive(count-1);
		}
	}
	
	
	public static void main(String[] args) {
		int count =10;
		int sum, n1=0,n2=1;
		for(int i=0;i<count;i++){
			sum=n1+n2;
			System.out.println(sum);
			// swap
			n1=n2;
			n2=sum;
		}
		System.out.println("using recursion");
		recursive(count);
		
	}
}
