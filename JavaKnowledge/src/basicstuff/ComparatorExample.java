package basicstuff;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import model.Employee;

public class ComparatorExample {

	private static Comparator<Employee> EmployeeNameComparator = new Comparator<Employee>() {

		@Override
		public int compare(Employee o1, Employee o2) {
			// this is ascending order
			return o1.getName().compareTo(o2.getName());

			// descending order will be the reverse
			// return o2.getName().compareTo(o1.getName());
		}
	};

	public static void main(String[] args) {

		List<Employee> listArray = new ArrayList<>();
		listArray.add(new Employee("saurabh", "amin", 25));
		listArray.add(new Employee("steve", "jobs", 55));
		listArray.add(new Employee("bill", "gates", 52));
		listArray.add(new Employee("ellon", "musk", 39));

		for (Employee emp : listArray) {
			System.out.println(emp.getName() + " : " + emp.getAge());
		}

		Collections.sort(listArray);
		System.out.println("bellow is sorting using comparable interface:");
		for (Employee emp : listArray) {
			System.out.println(emp.getName() + " : " + emp.getAge());
		}

		System.out.println("below is the sorting using comparator anonymous inner class");
		Collections.sort(listArray, ComparatorExample.EmployeeNameComparator);
		for (Employee emp : listArray) {
			System.out.println(emp.getName() + " : " + emp.getAge());
		}
	}

}
