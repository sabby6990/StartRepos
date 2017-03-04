package CollectionsKnowledge;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListCollection {

	public static void main(String args[]) {
		ArrayList<String> arryList = new ArrayList<>();
		arryList.add("value1");
		arryList.add("value2");
		arryList.add("value3");
		arryList.add("value4");
		arryList.add("value5");

		System.out.println(arryList.size());
		
		Iterator<String> iterator = arryList.iterator();

		while (iterator.hasNext()) {
			String next = iterator.next();
			if (next.equals("value3")) {
				// this operation will throw a concurrent modification exception
				// arryList.remove("value3");
				iterator.remove();
			}
		}
		System.out.println(arryList.size());
	}
}
