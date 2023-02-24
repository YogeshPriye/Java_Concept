
public class ThreadIdentity extends Thread {

	public static void main(String[] args) throws InterruptedException {
		
		ThreadIdentity mt = new ThreadIdentity();
		mt.start();
		
		Thread currentThread = Thread.currentThread();
		System.out.println("Thread Name is " + currentThread.getName());
		
	}
	
	public void run() {
		Thread currentThread = Thread.currentThread();
		currentThread.setName("Print 200 numbers");
		System.out.println("Thread Name is " + currentThread.getName());
	}

}
