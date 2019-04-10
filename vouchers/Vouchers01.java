package vouchers;
import java.util.Scanner;
public class Vouchers01 {
	public static int S = 0;
	private static Scanner seebot = new Scanner(System.in);
	public static String name;
	
	public void introVouchers( )
	{
		System.out.println( "Welcome to Vouchers, Please." );
		System.out.println( "Please enter your name :" );
		
		name = seebot.nextLine();
		
		System.out.println("Welcome to your first day in rentals, " + name + ".");
		
		vSession();
		
	}
	
	
	public void vSession( )
	{
		StartRun running = new StartRun();
		running.runDay();		
	}

}
