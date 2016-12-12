package threading;

class Counter {
	 int  count =0;

	public synchronized void add(String threadName) {
		//int count = 0;
		for (Long i = 1L; i < 10; i++) {
			count += i;
		}
		System.out.println(threadName + " : " + count);
	}

}

class CounterThread extends Thread {
	Counter counter = null;
	String threadName;

	public CounterThread(Counter counter, String threadName) {
		this.counter = counter;
		this.threadName = threadName;
	}

	public void run() {
		synchronized (this) {
			counter.add(threadName);	
		}
		

	}

}
// wow simple class
class SimpleClass {
	Counter counter = null;

	public SimpleClass(Counter counter) {
		this.counter = counter;
	}

	public void simpleAdd() {
		counter.add("Simple Thread");
	}

}

public class SynchronizedExample {

	public static void main(String[] args) {
		Counter counter = new Counter();
		Thread thread1 = new CounterThread(counter, "Thread 1");
		Thread thread2 = new CounterThread(counter, "Thread 2");
		Thread thread3 = new CounterThread(counter, "Thread 3");
		Thread thread4 = new CounterThread(counter, "Thread 4");
		Thread thread5 = new CounterThread(counter, "Thread 5");
		Thread thread6 = new CounterThread(counter, "Thread 6");
		Thread thread7 = new CounterThread(counter, "Thread 7");
		Thread thread8 = new CounterThread(counter, "Thread 8");
		Thread thread9 = new CounterThread(counter, "Thread 9");
		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
		thread5.start();
		thread6.start();
		thread7.start();
		thread8.start();
		thread9.start();

		try {
			// this will ensure that thread 1 and 2 will execute first and
			// sequentially
			thread1.join();
			thread2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Counter simpleCounter = new Counter();
		SimpleClass simpleClass = new SimpleClass(simpleCounter);
		simpleClass.simpleAdd();

	}
}
