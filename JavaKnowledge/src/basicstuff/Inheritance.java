package basicstuff;

interface a{
	void disp();
}

interface b{
	void disp();
}


class a1{
	void display(){
		
	}
	
	static void staticDisp(){
		System.out.println("parent static");
	}
}

class b1{
	void display(){
		
	}
}

public class Inheritance extends a1 implements a,b{

	@Override
	public void disp() {
		// TODO Auto-generated method stub
		
	}
	
	static void staticDisp(){
		System.out.println("child static");
	}
	
	public static void main(String[] args) {
		staticDisp();
		System.out.println(1.0f/0.0f);
	}

}
