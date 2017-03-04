package basicstuff;

public class Oops1 extends Parent1 {

	public Oops1(Oops1 oops) {

	}

	public Oops1() {

	}

	@Override
	protected void helloWord() {
		// super.init();
		// super.helloWord();
		System.out.println("child ka hello world");

	}

	// throw vs throw vs try catch vs finally
	private void exceptionWala() throws Exception {

		try {
			throw new Exception();
		} catch (Exception e) {

		} finally {

		}

	}

	// overloaded and custom annotations also used
	@MyCustomAnnotations(myAge = 20, myName = "Saurabh")
	protected void helloWorld(String name) {

	}
	
	private void method(Object o){
		System.out.println("object method");
	}
	
	private void method(String s){
		System.out.println("String ss "+s);
	}
	

	public static void main(String[] args) {
		
		Oops1 oops = new Oops1();
		Parent1 parent = new Oops1(oops);
		Parent1 parent1 = new Parent1();

		System.out.println("parent1 hashcode --> " + parent1.hashCode());
		System.out.println("parent hashcode --> " + parent.hashCode());

		oops.helloWord();
		parent.helloWord(); // pollymorphism
		parent1.helloWord();
		
		oops.method(null);
	}
}

class Parent1 {
	Parent1() {

	}

	protected void init() {
		System.out.println("initializing parent");
	}

	protected void helloWord() {
		System.out.println("parent ka hello world");
	}
}


/**
 * Abstract classes
 * 
 * 
 * */




abstract class AbstarctDemo{
	
	// this method is not a contract and acts as a simple method with some default implementation
	//you want 
	 protected void someMethod(){
		 System.out.println("This is a simple class");
	 };
	 
	 // this a contract defined and needs to be implemented in the child class
	 protected  abstract void method1();
}

class ChildAbstract extends AbstarctDemo{

	@Override
	protected void method1() {
		
	}
	
}