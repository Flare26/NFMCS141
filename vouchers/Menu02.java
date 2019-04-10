package vouchers;
import java.util.Scanner;
public class Menu02 {
	
private static Scanner seebot = new Scanner (System.in);
private static char input;
public static int gameday;
	public static void main(String[] args) {
		Menu02 menu02 = new Menu02();

		menu02.printHeader();
		menu02.startScreen();
		
		String choice = seebot.next().toLowerCase(); //Takes input and stores first as char
		input = choice.charAt(0);
		
		if ( input != 'q') {
					menu02.printMenu();
					choice = seebot.next().toLowerCase();
					input = choice.charAt(0);
					
				switch ( input )
				{
				case '1' :
					menu02.startGame();
					break;
				case '2' :
					menu02.loadGame();
					break;
				case '3' :
					menu02.optionStart();
					break;
				case 'q' :
					System.out.println("Breaking...");
					break;
					
				default :
					System.out.println( "Try again..." );
				}
			} else
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
	
	public void startScreen()
	{
		System.out.println("Please select:"
				+ "\n[1] START"
				+ "\n'Q' QUIT"
				+ "\n________" );
	}
	
	public void startGame()
	{
		System.out.println("Starting...");
		Vouchers01 game = new Vouchers01();
		game.introVouchers();
	}
	
	public void loadGame()
	{
		System.out.println("Loading...");
	}
	
	public void optionStart()
	{
		System.out.println("Options...");
	}
	
	public void printMenu()
	{
		System.out.println("Please select:"
				+ "\n[1] Play"
				+ "\n[2] Load"
				+ "\n[3] OPTIONS"
				+ "\n'Q' Quit");
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
