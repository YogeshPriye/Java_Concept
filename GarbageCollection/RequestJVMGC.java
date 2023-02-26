
public class RequestJVMGC {

	int objId;
	RequestJVMGC(int objId) {
		this.objId = objId;
		System.out.println("Created : " + this.objId);
	}
	public static void main(String[] args) {
		for (int i = 1; i <= 5000000; i++) {
			new RequestJVMGC(i);
		}
	}
	@Override
	protected void finalize() {
		System.out.println("Finalized : " + objId);
	}

}
