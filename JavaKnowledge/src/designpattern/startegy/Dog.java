package designpattern.startegy;

public class Dog extends Animal{

	public Dog(){
		super();
		//strategy is defined here
		flyType = new CantFly();
	}
}
