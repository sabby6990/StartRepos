package designpattern.startegy;

public interface Flys {
	String flys();
}

class ItFlys implements Flys {

	public String flys() {
		return "flying high :)";
	}

}

class CantFly implements Flys {

	public String flys() {
		return "cant Fly :(";
	}

}
