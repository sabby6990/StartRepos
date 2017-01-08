package basicstuff;

public class Oops1 extends Parent1 {

	public Oops1(Oops1 oops){
		
	}
	public Oops1(){
		
	}
	
	@Override
	protected void helloWord()  {
//		super.init();
//		super.helloWord();
		System.out.println("child ka hello world");
		
	}

	// throw vs throw vs try catch vs finally
	private void exceptionWala() throws Exception{
		
		try{
			throw new Exception();
		}catch(Exception e){
			
		}finally{
			
		}
		
	}
	
	//overloaded and custom annotations also used
	@MyCustomAnnotations(myAge=20,myName = "Saurabh")
	protected void helloWorld(String name){
		
	}

	public static void main(String[] args) {
		Oops1 oops = new Oops1();
		Parent1 parent = new Oops1(oops);
		Parent1 parent1 = new Parent1();
		oops.helloWord();
		parent.helloWord(); // pollymorphism
		parent1.helloWord();
	}
}

class Parent1 {
	Parent1() {

	}
	protected void init(){
		System.out.println("initializing parent");
	}

	protected void helloWord() {
		System.out.println("parent ka hello world");
	}
}
