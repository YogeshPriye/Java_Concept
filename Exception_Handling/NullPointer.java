
public class NullPointer {
	
	static ArrayIndexOOBDemo a;
	
	public static void main(String[] args) {
		try {
		NullPointer.a.medthod1();
		}catch(NullPointerException e) {
			System.out.println("Object Not Initialized");
		}
		System.out.println("More Code can go here");
	}

}
