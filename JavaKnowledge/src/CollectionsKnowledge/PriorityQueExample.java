package CollectionsKnowledge;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;

class Customer {
	Integer id;
	String name;

	public Customer(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

}

public class PriorityQueExample {

	private void addData(Queue<Integer> prioQue) {
		for (Integer i = 0; i < 7; i++)
			prioQue.add(i);
	}

	private void pollingDemo(Queue<Integer> prioQue) {
		addData(prioQue);
		Integer value = new Integer(0);
		while (value != null) {
			value = prioQue.poll();
			if (value == null)
				break;
			System.out.println(value);

		}
	}
 
	private void usingComparator(Queue<Customer> prioQue) {
		Random rand = new Random();
		for (Integer i = 0; i < 7; i++) {
			prioQue.add(new Customer(rand.nextInt(100), "Suresh"+i));
		}
		
		// poll the values
		
		while(true){
			Customer customerObj = prioQue.poll();
			if(customerObj==null)
				break;
			System.out.println(customerObj.getId()+" : "+customerObj.getName());
		}

	}

	Comparator<Customer> customerComparator = new Comparator<Customer>() {

		@Override
		public int compare(Customer o1, Customer o2) {
			return (int) o1.getId() - o2.getId();
		}
	};

	public static void main(String[] args) {
		Queue<Integer> prioQue = new PriorityQueue<Integer>();
		PriorityQueExample peExample1 = new PriorityQueExample();
		peExample1.pollingDemo(prioQue);

		/// using comparator
		System.out.println("---------using comparator-----------");
		
		Queue<Customer> comparoQue = new PriorityQueue<>(7, peExample1.customerComparator);
		peExample1.usingComparator(comparoQue);
	}

}

interface something{
	
	default void someMethod(){
		System.out.println("initializing......");
	}
}

abstract class abstractSomething{
	void normalMethod(){
		System.out.println("hii i am a normal method");
	}
	
	abstract void abstractMethod();
}

class iamBoss extends abstractSomething implements something{

	@Override
	void abstractMethod() {
		
	}
	
	public void someMethod(){
		
	}
	
}

