package Algos;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author saurabh
 *
 */
public class FirstNonRepeat {

	private Character findFirst(String str){
		Map<Character,Integer> countMap = new 	LinkedHashMap<>();
		char [] charArray = str.toCharArray();
		int length = str.length();
		
		for(int i=0 ; i<charArray.length;i++){
			
			if(countMap.containsKey(charArray[i])){
				countMap.put(charArray[i], countMap.get(charArray[i])+1);
			}else{
				countMap.put(charArray[i], 1);
			}
		}
		  for(Map.Entry m:countMap.entrySet()){  
			   if((Integer)m.getValue()==1){
				return (Character)m.getKey(); 
			   }
			   
			  } 
		return new Character('a');
	}
	
	
	
	public static void main(String[] args) {
		String str = "ssshhhgjddd";
		FirstNonRepeat obj = new FirstNonRepeat();
		System.out.println(obj.findFirst(str));		
	}

}
