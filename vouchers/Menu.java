package vouchers;
import java.util.Scanner;
public class Menu {

private Scanner seebot = new Scanner(System.in);

/*
public static void main( String [] args )
{
Menu m0 = new Menu();
m0.runMenu();
}
*/
public void runMenu()
{
		printMenu();
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

	public static void quit(char x)
	{
		boolean t = (x == 'y');
		
		if (t)
		System.exit(0);
	}
	

	public int getInput()
	{
		System.out.println("Enter Selection : ");
		char in = seebot.next().charAt(0);
		
		while ( in != 'q')
		{
		
		if ( in == '1' || in == '2' || in == '3' )
		{
		switch ( in )
		{
		
		case '1' :
			return 1;
			
		case '2' :
		return 2;
		
		case '3' :
		return 3;
		
		default:
			System.out.println("Try again");
			return -1;
		}
		} else
		{
			System.out.println("Try again");
			return -1;
		}
		
		}
		
		//if in == 'q'
		
		System.out.println("Quit? y/n");
		in = seebot.next().toLowerCase().charAt(0);
		
		if ( in == 'y' )
			Menu.quit(in);
		return -1;
			
	}
	

}
