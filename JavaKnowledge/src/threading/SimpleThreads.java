package threading;

// this class provides a simple way of creating threads by extending thread class
public class SimpleThreads {

	static class Threading1 extends Thread {
		@Override
		public void run() {
			for (int i = 0; i < 20; i++)
				System.out.println("Thread1 executing : " + i);
		}
	}

	static class Threading2 extends Thread {
		@Override
		public void run() {
			for (int i = 0; i < 100; i++)
				System.out.println("Thread2 executing : " + i);
		}

	}

	static class RunnableThreading implements Runnable {
		@Override
		public void run() {
			System.out.println("Runable thread");
		}
	}

	public static void main(String[] args) {
		SimpleThreads.Threading1 thread1 = new Threading1();
		thread1.start();

		SimpleThreads.Threading2 thread2 = new Threading2();
		thread2.start();
		SimpleThreads.RunnableThreading runnableTask = new RunnableThreading();
		Thread wrapperThread = new Thread(runnableTask);
		wrapperThread.start();
	}
}
