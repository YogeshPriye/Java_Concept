
public class AssignmentClass {
	public static void main(String[] args) throws InterruptedException {
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			throw new MyThreadException("Runtime Exception");
		}
	}
}
