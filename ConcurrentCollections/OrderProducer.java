import java.util.concurrent.BlockingQueue;

public class OrderProducer implements Runnable {

	private BlockingQueue<String> queue;
	
	public OrderProducer(BlockingQueue<String> queue) {
		this.queue = queue;
	}
	public void run() {
		try {
			queue.put("Mac Book Pro");
			queue.put("Dell");
			queue.put("HP");
			queue.put("Acer");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
