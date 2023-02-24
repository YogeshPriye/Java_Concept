
public class SynchronizationDemo {

	public static void main(String[] args) {
		DisplayMessage dm = new DisplayMessage();
		
		MyThreadSync t1 = new MyThreadSync(dm, "Steve");
		MyThreadSync t2 = new MyThreadSync(dm, "Mark");
		t1.start();
		t2.start();
	}

}
