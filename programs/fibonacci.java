//Fibonacci calculator Nathan Frazier
package programs;
import java.util.Scanner;
public class fibonacci {

	public static void main(String[] args) {
	System.out.println("[Fibonacci calculator] How many values would you like to calculate? \n [any letter to exit]");
	Scanner seebot = new Scanner(System.in);
	 while (! seebot.hasNextInt())
	 {
		 String garbage = seebot.nextLine();
		 System.out.println("Goodbye.");
		 System.exit(0);
	 }
	 System.out.println("Calculating...");
	 int counter = 1;
	 int values = Math.abs(seebot.nextInt());
	 int num1 = 0;
	 int num2 = 1;
	 int SumOfPrevious2 = 0;
	 do {
		 System.out.println(SumOfPrevious2);
		 System.out.println("[^:"+counter+"]");
		 counter += 1;
		 values -= 1;
		 SumOfPrevious2 = (num1 + num2);
		 num1 = num2;
		 num2 = SumOfPrevious2;
	 } while (values >= 1);
	 seebot.close();
	}

}
