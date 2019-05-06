//Nathan Frazier | Integer input handler, returns as int
package shipgame;
import java.util.Scanner;
public class Inputhandler {
	
static Scanner seebot = new Scanner(System.in);

private static int loopoutput;

public int getInput()
{
	String input = seebot.next();

	int sentinel = 0;
	while ( ! (sentinel == 1) )
	{ do
		{
			if ( input.length() > 1 || !input.matches("[0-9]") )
			{
				System.out.println("Longer than 1 or not 0-9");
				input = seebot.next();
			}	
		} while ( input.length() > 1 || !input.matches("[0-9]") );
				System.out.println("input.length() is = 1 and also between 0-9!");
		if ( input.matches("[0-9]") ) 
		{
				System.out.println("The input " + input + " is valid."
				+ "\nChar @ index (0) of input is : " + input.charAt(0) );
				loopoutput = (int) input.charAt(0) - '0'; 
				sentinel = 1;
		}	
	}
	seebot.close();
	return loopoutput ;
}
//dont use (int) input.charAt(0) it just gives ascii of '3'. (int) '3' = 51 & (int) '0' = 48 so ...
// (int) '3' - '0' = 3
//casting char to int gives ascii, but all we need to do is subtract 0 since the ascii is in order
}
