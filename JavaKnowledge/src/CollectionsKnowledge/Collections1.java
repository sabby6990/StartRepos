package CollectionsKnowledge;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import model.Employee;

public class Collections1 {

	private static void arrayListDemo() {

		List list1 = new ArrayList<>();
		list1.add("value");
		list1.add(10);
		list1.add(true);
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
	}
}
