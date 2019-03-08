//Nathan Frazier Factorial Program
package programs;
import java.util.Scanner;
public class factorial {

	public static void main(String[] args) {
		
		Scanner seebot = new Scanner(System.in);
		System.out.println("Hello, please enter a +/- interger to find it's math.abs() factorial...");
	
		while (! seebot.hasNextInt() )
		{
	
			String garbage = seebot.nextLine(); //puts input to unused string so loop does not continue
			System.out.println("[Please re-enter a +/- integer]");
			
		} 
		//as soon as the input is an int, ! seebot.hasNextInt() returns false and the loop breaks 
	System.out.println("Thank you!");
	double counter = 1;
	double factorial = 1;
	double n = Math.abs((double)seebot.nextInt());
	do { //do while loops can use variables outside of loop. Cannot do this with standard while
		
		System.out.println(counter);
		factorial = factorial*counter;
		counter += 1;
		
	} while (counter <= n);
	System.out.println("Factorial output: "+factorial);
	
	/* Garbage while loop that did not work:
	 * 
	 * while (seebot.hasNextInt()) {
		
		n = (int) seebot.nextInt();
		int counter = 0;
		
		
		counter += 1;
		if (counter >= n)
			break;
	} */
		
	}

}
