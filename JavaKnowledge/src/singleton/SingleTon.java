package singleton;

// eager singleton
public class SingleTon {
	static SingleTon singleTon = new SingleTon();

	private SingleTon() {

	}
	
	public SingleTon getInstance(){
		return singleTon;
	}

}
