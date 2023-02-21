
public class ArrayIndexOOBDemo {

	public static void main(String[] args) {
		int arr[] = {10, 20, 30};
		System.out.println("Element of array are: ");
		try {
			for (int i = 0; i <= arr.length; i++) {
				System.out.println(arr[i]);
			}
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Index Beyond Array length");
		}
		
		System.out.println("After array output");
	}
	
	void medthod1() {
		System.out.println("medthod1");
	}

}
