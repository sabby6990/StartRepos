package delloit;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;

import model.Employee;

public class CollectionsUtilFeatures {

	static ArrayList<Employee> empList = null;
	static ArrayList<String> list1 = new ArrayList<String>();

	
	static void dequeExample(){
		System.out.println("dequee ------------------");
		Deque<String> deque = new ArrayDeque<>();
		deque.push("a");
		deque.push("d");
		deque.push("5");
		deque.push("2");
		deque.push("a");
		// provides the LIFO order of the queue
		System.out.println(Collections.asLifoQueue(deque));
	}
	
	static void addAllCollections() {
		empList = new ArrayList<>();

		String[] str = { "2000", "5500", "1400", "6000", "7000" };
		Collections.addAll(list1, str);

		// with customObjects

		Employee emp = new Employee("Saurabh", "Amin", 26);
		Employee emp1 = new Employee("Elon", "Musk", 26);
		Collections.addAll(empList, emp, emp1);

		empList.forEach(employee -> System.out.println(employee.getName()));

	}

	static void binarySearchList(){
		System.out.println("---- binary search ----");
		int binarySearch = Collections.binarySearch(list1, "1400");
		System.out.println("Binary search found 1400 at index "+binarySearch);
	}
	static void maxMinFunctions() {

		System.out.println(Collections.max(list1));
		System.out.println(Collections.min(list1));
	}

	public static void main(String[] args) {
		addAllCollections();
		maxMinFunctions();
		dequeExample();
		binarySearchList();
	}
}
