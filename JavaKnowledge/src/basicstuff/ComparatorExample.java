package basicstuff;

import java.math.BigDecimal;
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
			 int nameComparo=o1.getName().compareTo(o2.getName());
			 if(nameComparo==0){
				 return o1.getLastName().compareTo(o2.getLastName());
			 }else{
				 return nameComparo;
			 }
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
		listArray.add(new Employee("ellon", "disco", 69));

		for (Employee emp : listArray) {
			System.out.println(emp.getName() + "-->"+emp.getLastName()+" : " + emp.getAge());
		}

		Collections.sort(listArray);
		System.out.println("bellow is sorting using comparable interface:");
		for (Employee emp : listArray) {
			System.out.println(emp.getName() + "-->"+emp.getLastName()+" : " + emp.getAge());
		}

		System.out.println("below is the sorting using comparator anonymous inner class");
		Collections.sort(listArray, ComparatorExample.EmployeeNameComparator);
		for (Employee emp : listArray) {
			System.out.println(emp.getName() + "-->"+emp.getLastName()+" : " + emp.getAge());
		}
		
		BigDecimal obj = new BigDecimal("10.00");
		BigDecimal obj1 = new BigDecimal("10.000");
		System.out.println(obj.compareTo(obj1));
		System.out.println(obj.equals(obj1));
	}

}
