package challenge;

/**
 * Motive: find two numbers in a array where sum of both the numbers is = 10
 */
public class GoogleQuestion1 {

	static void getNumber(Integer... arrays) {

		for(int i=1;i<=arrays.length-1;i++){
			for(int j=0;j<i;j++)
			{
				if(arrays[i]+arrays[j]==10){
					System.out.println(arrays[i]+"+"+arrays[j]+" = 10");
				}
			}
			
		}
	}

	public static void main(String[] args) {
		Integer arrayInt[] = { 4, 2, 8, 1, 3 ,6};

		getNumber(arrayInt);
	}
}
