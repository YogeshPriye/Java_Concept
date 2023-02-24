
public class InterruptDemo {

	public static void main(String[] args) {
		MyThreadInterupt t = new MyThreadInterupt();
		t.start();
		t.interrupt();
		System.out.println("End of main thread");
	}

}
