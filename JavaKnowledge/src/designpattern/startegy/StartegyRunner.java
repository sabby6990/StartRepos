package designpattern.startegy;



public class StartegyRunner {
	public static void main(String[] args) {
		//its all about polymorphism
		
		Animal sparky = new Dog();
		Animal tweety = new Bird();
		System.out.println("Dog: "+sparky.tryToFly());
		System.out.println("Bird: "+tweety.tryToFly());
		
		// now you can change the behaviour also
		sparky.setFlyingAbility(new ItFlys());
		System.out.println("Dog: "+sparky.tryToFly());
	}
}
