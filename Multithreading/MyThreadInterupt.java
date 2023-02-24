
public class MyThreadInterupt extends Thread{
	@Override
	public void run() {
		for (int i = 0; i <= 10; i++) {
			try {
				System.out.println(" I am a lazy thread");
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				System.out.println("Got Inturepted");
			}
		}
	}
}
