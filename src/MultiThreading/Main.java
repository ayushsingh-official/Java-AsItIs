package MultiThreading;

public class Main extends Thread implements Runnable {

	public static void main(String[] args) {

		// Method 1
		Thread thread1 = new Thread(() -> {

			int count = 0;

			while (count++ < 10) {
				System.out.println("Thread1 : " + count);
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}

		});

		Runnable runnable = () -> {
			int count = 0;

			while (count++ < 10) {
				System.out.println("Thread2 : " + count);
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};

		// Method 2
		Thread thread2 = new Thread(runnable);

		// Method 3
		Thread thread3 = new Thread(new Main()); // Covers both extends Thread , Implements Runnable.

		thread3.start();
		thread1.start();
		thread2.start();

	}

	@Override
	public void run() {
		int count = 0;

		while (count++ < 10) {
			System.out.println("Thread3 : " + count);
			try {
				Thread.sleep(9000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}
