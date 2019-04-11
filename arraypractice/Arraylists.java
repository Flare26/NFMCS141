package arraypractice;
import java.util.ArrayList;
import java.util.Scanner;
public class Arraylists {
	
	static Scanner seebot = new Scanner(System.in);
	static ArrayList<Integer> array = new ArrayList<Integer>(); 
	
	public static void main ( String [] args )
	{
		System.out.println("please enter an array of number, type 0 when finished");
		int in = seebot.nextInt();
		
		while (in != 0)
		{
			array.add(in);
			in = seebot.nextInt();
		}
		
		//user typed 0
		
		System.out.println("-------------------------");
		
		for ( int i : array ) //for each int i in array
		{
			System.out.println(i);
		}
	}

}
