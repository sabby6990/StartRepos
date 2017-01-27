package CollectionsKnowledge;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

import model.Employee;

public class Collections1 {

	private static void arrayListDemo() {

		List list1 = new ArrayList<>();
		list1.add("value");
		list1.add(10);
		list1.add(true);
		list1.add(null);
		list1.forEach(e -> {
			System.out.println(e);

		});
		Employee emp = new Employee("abc", "def", 27);

		try {
			Employee emp1 = (Employee) emp.clone();
			emp.setName("wakaoo");
			System.out.println(emp1.getName());
		} catch (CloneNotSupportedException ce) {
			ce.printStackTrace();
		}

	}
	
	private static void hashMapDemo(){
		HashMap<String,String> map = new HashMap<String,String>();
		map.put("A", "value 1");
		map.put("B", "value 2");
		
		String value =map.get("B");
		System.out.println("value for key is "+value);
		
		TreeMap<String,String> treeMap = new TreeMap<>();
		treeMap.put("zero", "something");
		treeMap.put("first", null);
		
		Map<String,String> hashMap = new HashMap<>(2);
		hashMap.put("1", "one");
		hashMap.put("2", "two");
		hashMap.put("3", "three");
		
		hashMap.forEach((k,v)->{
			System.out.println(" key--> "+k+" : value --> "+v);
		});
		
	}
	
	
	private static void setDemo(){
		HashSet sets = new HashSet<>();
		sets.add(null);
		sets.add("set value1");
		sets.add(null);
		sets.add("set value2");
		
		sets.forEach(e->{System.out.println(e);});
	}

	private static void linkedListDemo() {
		List linkedList = new LinkedList<>();
		linkedList.add(11);
		linkedList.add("String");
		linkedList.forEach(e -> {
			System.out.println(e);
		});
	}

	public static void main(String[] args) {
		Collections1.arrayListDemo();
		System.out.println("-----------");
		Collections1.linkedListDemo();
		
		Collections1.hashMapDemo();
		
		Collections1.setDemo();
	}
}
