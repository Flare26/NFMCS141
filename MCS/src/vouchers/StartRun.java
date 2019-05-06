package vouchers;
import java.util.Scanner;
public class StartRun {
	
	private static Scanner seebot = new Scanner(System.in);
	private final String NAME = Vouchers01.name;
	private final int DAY= Menu02.gameday + 1;
	public final int customercount = DAY * DAY + DAY;
	
	public void runDay()
	{
		int customersleft = customercount;
		double KEY = 12.34;
		
		System.out.println("Difficulty : Day " + DAY);
		Customer troy = new Customer("Troy Leonard", 37, 80, 242, 'm' );
		System.out.println( troy.toString() );
		
		while ( customersleft > 0 )
		{
			System.out.println("Calculate DIN : ");
			double ANSWER = seebot.nextDouble();
			
			while ( ANSWER != KEY )
			{
				System.out.println("NOT KEY");
			}
		}
		
		
	}

}
