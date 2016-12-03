package CollectionsKnowledge;

import java.util.HashMap;
import java.util.Map;

public class ArrayListCollection {

	 public static void main(String args[]){  
		   
		  HashMap<Integer,String> hm=new HashMap<Integer,String>();  
		  
		  hm.put(100,"Amit");  
		  hm.put(101,"Vijay");  
		  hm.put(102,"Rahul");  
		  hm.put(103,"Rahul1");  
		  
		  for(Map.Entry m:hm.entrySet()){  
		   System.out.println(m.getKey()+" "+m.getValue());  
		  }  
		 }  
}
