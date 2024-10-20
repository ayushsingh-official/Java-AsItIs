package MultiThreading;

public class Function {

	public static synchronized void staticFunction() {

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("static function running........");

	}

	public synchronized void function1() {

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("function 1 running........");

	}

	public void function2() {

		System.out.println("function 2  before sync block running........");

		synchronized (this) {

			System.out.println("function 2 sync block running........");
			try {
				Thread.sleep(4000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("function 2 after sync block running........");

	}

	public void function3() {

		System.out.println("function 3 unsync block running........");

	}

}
