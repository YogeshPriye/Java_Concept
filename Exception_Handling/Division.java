import java.util.Scanner;

public class Division {

	public static void main(String[] args) {
		int a,b,c;
		
		System.out.println("Enter two integer");
		Scanner scan = new Scanner(System.in);
		a = scan.nextInt();
		b = scan.nextInt();
		try {
			c = a / b;
			System.out.println("Result" + c);
		} catch(ArithmeticException e) {
			System.out.println("Please do not enter 0");
		} finally {
			System.out.println("Finally");
		}
		System.out.println("More Code can go here");
	}

}
