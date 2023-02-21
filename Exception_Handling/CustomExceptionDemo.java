
public class CustomExceptionDemo {
	public static void main(String[] args) throws CheckedCustomException {
		//throw new UncheckedCustomException("Runtime Exception Occured");
		throw new CheckedCustomException("Business Exception needs to be handled");
	}
}
