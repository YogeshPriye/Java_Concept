
public class GCDemo {

	GCDemo() {
		System.out.println(this + " : Created");
	}
	public static void main(String[] args) {
		new GCDemo();
		new GCDemo();
	}
	@Override
	protected void finalize() {
		System.out.println(this + " : Finalized");
	}

}
