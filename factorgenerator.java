//Factor Generator by Nathan Frazier
package programs;
import java.util.Scanner;
public class factorgenerator {

	public static void main(String[] args) {
		Scanner seebot = new Scanner(System.in);
		System.out.println("Enter an integer to find it's factors: ");
		while (! seebot.hasNextInt()) {
			String garbage = seebot.nextLine();
			System.out.println("Please re-enter an integer:");
		}
	
		int input = Math.abs(seebot.nextInt());
		int count = 1;
		int a = input;
		
		System.out.println("Calculating...");
		do {
	count += 1;
	if ((input % count) == 0)
	{
		int factor = (input/count);
		System.out.println(factor);
	} 
} while (count <= input);
		
		System.out.println("All done calculating factors!");
		System.exit(0);
	}

}
