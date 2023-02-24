
public class MyThreadCumunication extends Thread {
	int total = 0;

	@Override
	public void run() {
		System.out.println("Child Thread is calculating sum : ");

		synchronized (this) {
			for (int i = 1; i <= 100; i++) {
				total += i;
			}
			this.notify();
		}
	}
}
