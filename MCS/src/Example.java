
import java.util.Scanner;
public class Example {

	
	public static void main(String[] args) {
		function1();	
	}
	//outside main
	public static void function1() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to function 1.");
		System.out.println("What is your name? : ");
		String x = scan.nextLine();
		System.out.println("Thank you. Your name is " + x);
		scan.close();
	}

}
