package designpattern.startegy;

public class Bird extends Animal {

	public Bird() {
		super();
		flyType = new ItFlys();
	}

}
