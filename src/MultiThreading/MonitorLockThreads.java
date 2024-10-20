package MultiThreading;

public class MonitorLockThreads {

	public static void main(String[] args) {

		Function function = new Function();

		// Thread 1
		Thread thread1 = new Thread(function::function1);

		Runnable runnable = function::function2;

		// Thread 2
		Thread thread2 = new Thread(runnable);

		// Thread 3
		Thread thread3 = new Thread(() -> {
			Function function3 = new Function();
			function3.function3();

		});

//		Thread 1 and 2 is on same object.
//		While thread 3 is on another object. , not on same monitor lock
		thread1.start();
		thread2.start();
//		thread3.start();

		// Thread 4
		Thread thread4 = new Thread(function::function3);

		thread4.setPriority(Thread.MIN_PRIORITY);
		thread4.start();

		System.out.println(thread1.getPriority());
		System.out.println(thread2.getPriority());
		System.out.println(thread4.getPriority());

		// Class Lock on Synch Static function
		Thread thread5 = new Thread(Function::staticFunction);

		thread5.start();

	}

}
