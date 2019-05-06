//program 43 on page 336 Nathan Frazier
package programs;
import java.util.Scanner;
public class AllSquares {
	static Scanner seebot = new Scanner(System.in);
	public static void main(String[] args)
	{
		double a = 0;
		int counter = 0;
		int SENT = 0;
		int SENTSQR = 0;
		double input = 0;
		while(SENT == 0)
		{
		
		
		System.out.println("Please enter an integer > 10") ;
		input = seebot.nextInt();
		if (input > 10)
		{
		SENT = SENT + 1;	//makes user put in numbers until > 10
		}
		} //end of SENT loop
		a = input; //initialize a before it changes in the loop
		while (SENTSQR == 0)
		{
			
			System.out.println("Calculating square root of input "+input+"...");
			a = Math.sqrt(input);
			input = a; //sets input = a so the loop takes the new square root value
			counter = counter + 1;
			System.out.println("Result: "+a);
			if (a <= 1.01)
			{
				SENTSQR = SENTSQR + 1; //Keeps track of square root ops
			}
			
		}
		System.out.println("Square root calculations complete, "+counter+" operations performed.");
		
		seebot.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
}
