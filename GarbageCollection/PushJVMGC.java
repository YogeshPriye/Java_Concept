
public class PushJVMGC {

	int objId;
	PushJVMGC(int objId) {
		this.objId = objId;
		System.out.println("Created : " + this.objId);
	}
	public static void main(String[] args) {
		new PushJVMGC(1);
		new PushJVMGC(2);
		for (int i = 1; i <= 100; i++) {
			System.gc();
		}
	}
	@Override
	protected void finalize() {
		System.out.println("Finalized : " + objId);
	}

}
