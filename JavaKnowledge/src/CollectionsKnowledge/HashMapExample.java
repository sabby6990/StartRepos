package CollectionsKnowledge;

import java.util.HashMap;
import java.util.Map;

import designpattern.builderPattern.TestModel;
import model.Employee;

public class HashMapExample {

	static void immutableKey() {
		TestModel model = new TestModel.TestModelBuilder().withFirstName("saurabh").withLastName("amin")
				.withSalary(50000).build();

		TestModel model1 = new TestModel.TestModelBuilder().withFirstName("sneha").withLastName("amin")
				.withSalary(100000).build();

		Map<TestModel, String> hashMap = new HashMap<TestModel, String>();
		hashMap.put(model1, "yeh hai model1");
		hashMap.put(model, "yeh hai model");

		System.out.println(hashMap.get(model1));
		System.out.println(hashMap.get(model));
	}
	
	static void mutableKey(){
		Employee emp = new Employee("elon", "musk", 45);
		Employee emp1 = new Employee("steve", "jobs", 55);
		Employee emp2=new Employee("a", "b", 12);
		HashMap<Employee, String> hMap = new HashMap<>();
		hMap.put(emp1, "employee1");
		hMap.put(emp, "employee");
		hMap.put(emp2, null);
		
		System.out.println(hMap.get(emp1)+"-----"+hMap.get(emp));
		
		emp1.setName("bill gates");
		System.out.println(hMap.get(emp1)+"-----"+hMap.get(emp));
		
		System.out.println(hMap.get(emp2));
	}

	public static void main(String[] args) {
		immutableKey();
		mutableKey();
		
	}
}
