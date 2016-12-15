package threading;

import java.util.concurrent.atomic.AtomicInteger;

class ResourceClass {
	
	AtomicInteger atomicInt = new AtomicInteger(0);

	public int next() {
		return atomicInt.incrementAndGet();

	}
}

class ThreadClasses implements Runnable {
	ResourceClass resource;
	String threadName;

	public ThreadClasses(String threadName, ResourceClass resource) {
		this.threadName = threadName;
		this.resource = resource;
	}

	@Override
	public void run() {
		System.out.println(this.threadName + " : " + resource.next());
	}

}

public class AtomicMultiThreading {

	public static void main(String[] args) {
		ResourceClass resource = new ResourceClass();
		Thread thread1 = new Thread(new ThreadClasses("Thread 1",resource));
		Thread thread2 = new Thread(new ThreadClasses("Thread 2",resource));
		Thread thread3 = new Thread(new ThreadClasses("Thread 3",resource));
		Thread thread4 = new Thread(new ThreadClasses("Thread 4",resource));
		Thread thread5 = new Thread(new ThreadClasses("Thread 5",resource));
		Thread thread6 = new Thread(new ThreadClasses("Thread 6",resource));

		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
		thread5.start();
		thread6.start();
	}

}
