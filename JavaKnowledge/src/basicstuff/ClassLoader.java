package basicstuff;

/**
 * this is an effort to learn how classes and interfaces are loaded into the 
 * class loader and initialization
 * */

class Parent {

	static String parentString = "parent string intilized through static variables";
	String nonStaticVariable = "non static variable in parent class";
	{
		System.out.println("-->" + parentString);
		System.out.println("-->" + nonStaticVariable);
	}
}

class Child extends Parent {

	{
		System.out.println("child class is initialized");
	}
}

public class ClassLoader {
	public static void main(String[] args) {
		// this simply intializes the super class and all its variables and the
		// along with the child classes
		Child childObj = new Child();
		System.out.println("------------------------------------");
		// doing this only intializes the super class
		System.out.println(Child.parentString);
	}
}
