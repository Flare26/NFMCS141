//Nathan Frazier Final Exam
package finalexam;
import java.util.ArrayList;
import java.util.Scanner;
public class Final {
	
	private static Scanner input = new Scanner(System.in);
	
	public static void main(String [] args)
	{
		int in = 0;
		System.out.println("Welcome to the final exam! Programming is not a spectator sport.");
		System.out.println("Please enter a positive integer,"
				+ "\nThis int will represent the number of strings you wish to enter.");
		
		in = input.nextInt();
		
		System.out.println("a) User entered ["+in+"]");
		
		//Method call
		ArrayList<String> mainlist = makeList(in);
		System.out.println("Operation completed!");
		
		int e = 0;
		for (String str : mainlist)
		{
			e++;
			System.out.println("[" + e + "] " + str);
		}
		
		System.out.println("\ne) Read from ehnanced for( : ) = " + e );
		System.out.println("f) Removing first Object... " + mainlist.get(0));
		
		mainlist.remove(0);
		
		
		System.out.println("g) Finding longest String in ArrayList...");
		String longest = "";
		int max = 0;
		
		for (String str : mainlist)
		{
			String temp = "";
			temp = str;
			
			if (temp.length() > max)
			{
				max = temp.length();
				longest = temp;
			}
		}
		
		System.out.println("Longest string found : " + longest);
		System.out.println("h) " + mainlist.toString());
		System.out.println("\nThank you! I now know how to code!");
		System.exit(0);
	}
	

	
	
	public static ArrayList<String> makeList(int n)
	{
		System.out.println("b) Creating ArrayList object...");
		System.out.println("--You can type multiple strings at once by seperating them with a space--");
		
		int count = 0;
		ArrayList<String> list = new ArrayList<String>(n);
		
		for (int i = 0; i < n; i++)
		{
			System.out.println("c) Enter string #"+(i+1));
			String str = input.next();
			list.add(str);
			count++;
		}
		
		System.out.println("d) ArrayList entries created : " + count);
		return list;
	}
}
