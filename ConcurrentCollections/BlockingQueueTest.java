import java.util.concurrent.ArrayBlockingQueue;

public class BlockingQueueTest {

	public static void main(String[] args) {
		ArrayBlockingQueue<String> arrayBlockingQueue = new ArrayBlockingQueue<String>(1024);
		OrderProducer orderProducer = new OrderProducer(arrayBlockingQueue);
		OrderConsumer orderConsumer = new OrderConsumer(arrayBlockingQueue);
		
		new Thread(orderProducer).start();
		new Thread(orderConsumer).start();
	}

}
