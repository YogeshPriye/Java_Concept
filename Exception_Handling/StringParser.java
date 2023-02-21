
public class StringParser {

	public static void main(String[] args) {
		String s = "abcd";
		try {
			int i = Integer.parseInt(s);
			System.out.println("Integer value : " + i);
		} catch (NumberFormatException e) {
			System.out.println("Please provide integer value only");
		}
		System.out.println("More Code can go here");
	}

}
