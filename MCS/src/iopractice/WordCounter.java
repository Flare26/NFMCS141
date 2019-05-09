//Nathan Frazier P778 #53
package iopractice;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordCounter {
	
	static String key = "secret";
	static String filename = "Secret.txt";
	static Scanner parse;
	
	public static void main(String [] args)
	{
		String filestring = "";
		int tokens = 0;
		
		try {
			
			System.out.println("Reading new file.. " + filename);
			File secret = new File(filename);
			parse = new Scanner(secret);
			
			while (parse.hasNext())
			{
				System.out.println("Token detected!");
				filestring += " [TOKEN]: "; //could use this as a delimiter for scanner later
				filestring += parse.next().toLowerCase();
				tokens ++;
			}
			
			System.out.println(tokens + " Total tokens scanned! " + filestring);
			int keycount = searchWord(key, filestring);
			System.out.println("searchWord method returned a count of " + keycount + " from " + filename);
	    	}
		catch (FileNotFoundException e)
		{
		e.getMessage();
		}
		finally
		{
			System.out.println("Finished.");
		}
	}
	
	public static int searchWord(String key, String filestring)
	{
		System.out.println("Detected key = " + key);
		int index = filestring.indexOf(key);
		int count = 0;
		
		while (index != -1)
		{
			filestring = filestring.substring(index + 1); //goes to beginning of key then up one to cut it out
	        index = filestring.indexOf(key);
	        count++;
		}
	
		return count;
	}
	
}
