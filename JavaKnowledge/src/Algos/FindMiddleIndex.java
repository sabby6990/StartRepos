package Algos;

/**
 * @author saurabh
 * this program will give the middle index of the array where sum of left == sum of right of index
 */
public class FindMiddleIndex {
	
	/**
	 * @param array
	 * @return
	 * @throws Exception
	 */
	private static int middleNum(Integer[] array) throws Exception{
		int startIndex=0;
		int endIndex=array.length-1;
		int leftSum=0;
		int rightSum=0;
		
		
		while(true){
			if(leftSum>rightSum){
				rightSum+=array[endIndex--];
			}else{
				leftSum+=array[startIndex++];
			}
			
			if(startIndex>endIndex){
				if(leftSum==rightSum){
					break;
				}else{
					throw new Exception("arrays doesnt satisfy the condition");
				}
			}
		}
		
		return endIndex;
	}
	
	public static void main(String[] args) {
		Integer array[] = {2,7,2,1,9,1};
		try {
			System.out.println(middleNum(array));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
	}
}
