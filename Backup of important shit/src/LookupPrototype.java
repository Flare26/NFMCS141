

import java.util.Scanner;

public class LookupPrototype {
	
	public static void main(String [] args) throws Exception
	{
		char sentinel = '*';
		Inputhandler getinput = new Inputhandler();
		Auth auth = new Auth();
		//Create instances 
		Scanner seebot = new Scanner(System.in);
		String input = "";
		
		System.out.println("\nFinished initializing.\n");
		System.out.println("//Welcome to Asset Lookup//");
		input = getinput.prompt("[1] - Query Asset \n[2] - Quit", seebot);
		
		while ( !input.startsWith("1") && !input.startsWith("2")  )
		{
			System.out.println("INVALID INPUT");
			String garbage = input;
			input = getinput.prompt("Please re-enter selection.", seebot);
		}//Exits if user enters 1 or 2
		
		if (input.charAt(0) == '2')
		{	
			close();
		}
		
		if (input.charAt(0) == '1')
		{
			do
			{
			System.out.println("Querying...");
			input = getinput.prompt("Please enter a valid asset tag >", seebot);
			String aTag = input;
			System.out.println("--Sending API request for : " + aTag + "--");
			String apiresponse = auth.assetRequest(aTag);
			System.out.println("Returning data assigned_on, name, and agent id...");
			//It doesnt do all 3 yet
			String data = (String) JSONNY.sift(apiresponse, "name");
			System.out.println("\n ...done!\n" + aTag + ":"+data);
			sentinel = ( getinput.prompt( "Query again? (y/n)", seebot ) ).charAt(0);
			} while ( sentinel != 'n');
		} //end of option 1
		close();
	}
	
	private static void close()
	{
		System.out.println("Thank you for using my first program!");
		System.out.println("-Nathan Frazier");
		
		System.exit(0);
	}
	
}
//By Nathan Frazier
//This program creates an instance of my inputhandler object and uses that object to grab data from the user
//API requests come an instance of my Auth class. It takes a String parameter in .assetRequest(String)