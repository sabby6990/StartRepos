package basicstuff;

class Father {
	String fatherName;

	public String getChild(beechka middleman) {
		return middleman.whichChild();
	}
}

interface beechka {
	String whichChild();
}

class child1 implements beechka {
	String child1name = "i am child 1";

	@Override
	public String whichChild() {
		return child1name;
	}

}

class child2 implements beechka {
	String child2name = "i am child 2";

	public String whichChild() {
		return child2name;
	}
}

public class Pollymorphism1 {

	public static void main(String[] args) {
		Father father = new Father();
		System.out.println(father.getChild(new child1()));
		System.out.println(father.getChild(new child2()));
	}

}
