package concurrent;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWrite {
	public static void main(String[] args) {
		boolean [] check = new boolean[4];
		
		CopyOnWriteArrayList<String> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
		check[0]=copyOnWriteArrayList.add("value1");
		check[1]=copyOnWriteArrayList.add("value2");
		check[2] =copyOnWriteArrayList.addIfAbsent("value3");
		check[3] =copyOnWriteArrayList.addIfAbsent("value2");
		for(boolean checking : check){
			System.out.println(checking);
		}
		System.out.println(copyOnWriteArrayList.size());
		
		Iterator<String> itr = copyOnWriteArrayList.iterator();
		
		while(itr.hasNext()){
			if(itr.next().equals("value2")){
				// wont throw a concurrent modification exception
				copyOnWriteArrayList.remove("value2");
			}
		}
		
		System.out.println(copyOnWriteArrayList.size());
		
	}
}
