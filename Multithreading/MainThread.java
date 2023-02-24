
public class MainThread {

	public static void main(String[] args) throws InterruptedException {
		
		MyThreadCumunication t = new MyThreadCumunication();
		t.start();
		
		synchronized(t) {
			System.out.println("Main Thread is going to wait");
			t.wait();
			System.out.println("Main Thread Notified");
			System.out.println(t.total);
		}
	}

}
