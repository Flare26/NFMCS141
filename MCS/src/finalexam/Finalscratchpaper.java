package finalexam;
import java.util.Scanner;
public class Finalscratchpaper {

	public static void main(String [] args)
	{
	Scanner scan = new Scanner( System.in );

	int number = 0;

	try

	{

	  number = scan.nextInt( );     // User enters 12, hits ENTER

	  System.out.println( "1: " + number );

	  number = scan.nextInt( );     // User enters 56, hits ENTER

	  System.out.println( "2: " +  number );

	  number = scan.nextInt( );     // User enters 99ABC, hits ENTER

	  System.out.println( "3: " +  number );

	}

	catch( Exception e)

	{

	  String s = scan.nextLine( );

	  System.out.println( "4: " + number );

	}

	finally

	{

	  number = scan.nextInt( ); // User enters 100, hits ENTER

	  System.out.println( "5: " + number );

	}
	
	
}
}