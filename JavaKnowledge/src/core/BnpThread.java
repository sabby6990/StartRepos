package core;

class Tasks implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		method1();
		method2();
	}

	public synchronized void method1() {
		System.out.println("method 1");
	}

	public synchronized void method2() {
		System.out.println("method 2");
	}
}

public class BnpThread {

	public static void main(String[] args) {
		Thread thread1 = new Thread(new Tasks());
		Thread thread2 = new Thread(new Tasks());

		thread1.start();
		try {
			thread1.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		thread2.start();

	}

}
