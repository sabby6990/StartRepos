package funstuff;

public class BinaryConvertor {
	
	private static int[] getBinary(int number){
		int binary[] = new int[25];
		int index=0;
		while(number >0){
			binary[index++] = number %2;
			number=number/2;
		}
		
		int returnArray[] = new int[index];
		for(int i=0;i<=index-1;i++){
			returnArray[i] = binary[i];
		}
		return returnArray;
	}
	
	private static void mySolutions(){
		// using my logic
		StringBuffer result = new StringBuffer();
		int number = 156;
		while (number > 0) {
			result.append("" + number % 2);
			number = number / 2;
		}
		System.out.println(result.reverse());
	}
	

	public static void main(String[] args) {
		// using the built in api for converting decimal to binary
		System.out.println(Integer.toBinaryString(156));
		System.out.println("-------------------");
		BinaryConvertor.mySolutions();
		
		System.out.println("-------------------");
		int binaryArray[] = BinaryConvertor.getBinary(156);
		
		for(int i=binaryArray.length-1;i>=0;i--){
			System.out.print(binaryArray[i]);
		}
	}

}
