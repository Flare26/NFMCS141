package vouchers;
import java.util.Scanner;
public class Menu02 {
	
private static Scanner seebot = new Scanner (System.in);
private char input;

	public static void main(String[] args) {
		Menu02 menu02 = new Menu02();
		char in = menu02.input;
		
		
		menu02.printHeader();
		menu02.printMenu();
		do {
			
			menu02.input = menu02.getInput();
			
			if ( in == 'q' )
				System.exit(0);
				
					
				
			} while ( in != 'q' );
		System.out.println("closing...");
	}

	public void printHeader()
	{
		System.out.println("__________________");
		System.out.println("\n| Nathan Frazier |");
		System.out.println("                  ");
		System.out.println("| Vouchers, Please |");
		System.out.println("____________________");
	}
	
	public void printMenu()
	{
		System.out.println("Please select:"
				+ "\n[1] Play"
				+ "\n[2] Load"
				+ "\n[3] OPTIONS"
				+ "\n'Q' Close");
	}
	
	public char getInput()
	{
	System.out.println(" Enter a symbol : ");
	
		String input = seebot.nextLine(); //converts input to lower case and includes _
		if ( ! (input.equals( 'q' ) ) )
		{
			char n = input.charAt(0);
			
			switch ( n )
			{
			
			case '1' :
			{
				System.out.println("in : 1");
				return '1' ;
			}
			
			case '2' :
			{
				System.out.println("in : 2");
				return '2';
			}
			
			case '3' :
			{
				System.out.println("in : 3");
				return '3';
			}
			
			default :
				System.out.println("Try again");
				return 'e' ;
			
		
		}
		
	} else 
	{
		return 'q';
	}
  }
}
