//Nathan Frazier p156 #33
//Side comments are so I know what I was doing when I look back on this later
package programs;
import java.util.Scanner;
public class HasLetter {
	
	public static void main(String[] args)
	{
		
		Scanner seebot = new Scanner(System.in);
		System.out.println("Enter a character to test T/F");
		String input = seebot.nextLine();
		input = input.toLowerCase();
		char c = input.charAt(0);
		//System.out.println("Char is " + c); THIS WAS FOR DEBUGGING
		
		if ( (input.length() == 1) && (input.contains("[0-9]") == false) )
			//Eclipse taught me about .contains()
		{
			
			//Ghetto-rigged boolean, I'll have to rework it in free time using the actual isLetter()
			//For the life of me I couldn't figure out how to handle boolean values properly
			char isLetter;
			if ((c >= 'a') && (c <= 'z'))
			{
				isLetter = 'T';
			} else
			{
				isLetter = 'F';
			}
			
			
	switch (isLetter) 
	//Testing my switch understanding
	{
	case 'T':
		System.out.println("True!");
		break;
	case 'F':
		System.out.println("False!");
		break;
	default:
		System.out.println("Logic Error: isLetter != 'T'/'F' ");
	}
		} else
		{
			System.out.println("Restart and enter a single character."
					+ "\nDid you accidentally include a number?");
			 seebot.close();
		}
 seebot.close();
	}
	
	}