package programs;
import java.util.Scanner;
public class SumLoop {

	public static void main(String[] args) {
		Scanner seebot = new Scanner(System.in);
		System.out.println("How many seperate integers would you like to sum up? \n[Input must be between 2-10]");
		//Put outer loop to determine how many numbers to sum up
		while (! seebot.hasNextInt()) {
			System.out.println("please enter a valid input");
			String garbage = seebot.nextLine();
		}
		int input = seebot.nextInt();
		while (2 > input && input > 10) {
			System.out.println("please enter a valid input");
			String garbage = seebot.nextLine();
		}
			
		if (2 <= input && input <= 10)
		{
			input = seebot.nextInt();
			System.out.println("You chose: "+input+" numbers.");
		} else {
			System.out.println("please enter a valid input");
			String garbage = seebot.nextLine();
		}
		
	}

}
