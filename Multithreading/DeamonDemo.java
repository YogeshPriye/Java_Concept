
public class DeamonDemo {

	public static void main(String[] args) {

		System.out.println(Thread.currentThread().isDaemon());
		MyThreadDemon myThread = new MyThreadDemon();
		myThread.setDaemon(true);
		System.out.println(myThread.isDaemon());
		myThread.start();
	}

}
