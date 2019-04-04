package vouchers;
import java.util.Scanner;
public class Menu {
boolean exit = false;
private Scanner seebot = new Scanner(System.in);
private String input;
private String username = "UNKNOWN";

public static void main( String [] args )
{
Menu m0 = new Menu();
m0.runMenu();
}

public void runMenu()
{
	while (!exit)
	{
		printMenu();
		int choice = getInput();
	}
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
			+ "\n{1} Play"
			+ "\n{2} Load"
			+ "\n{3} Quit");
}

	public static void quit(int z)
	{
		System.exit(z);
	}
	

	private int getInput()
	{
		int choice = -1;
		while (choice < 0 || choice > 2 )
		{
			
		}
	}
}
