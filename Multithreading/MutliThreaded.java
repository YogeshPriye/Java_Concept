
public class MutliThreaded extends Thread {

	public static void main(String[] args) throws InterruptedException {
		
		MutliThreaded mt = new MutliThreaded();
		mt.start();
		
		for (int j = 1; j <= 200; j++) {
			System.out.print("j : " + j + "\t");
			Thread.sleep(1000);
		}
	}
	
	public void run() {
		for (int i = 1; i <= 200; i++) {
			System.out.print("i : " + i + "\t");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
