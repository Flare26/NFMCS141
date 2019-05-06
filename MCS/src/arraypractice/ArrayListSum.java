//Nathan Frazier P597 #83
package arraypractice;

import java.util.ArrayList;
import java.util.Scanner;
public class ArrayListSum {

	static ArrayList<Integer> alist = new ArrayList<Integer>();
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("Please enter an array of numbers, type 0 when finished");
		int in = input.nextInt();
		
		while (in != 0)
		{
			alist.add(in);
			in = input.nextInt();
		}
		
		System.out.println("Calculating sum of array list...");
		
		
		
		System.out.println("Done! Sum : " + sumArrayList(alist) );		

	}
	
	private static int sumArrayList( ArrayList<Integer> incoming )
	{
		int sum = 0;
		for ( Integer currentint : incoming ) //enhanced for loop,  ( Classname reference : arraylistname ) 
		{
			System.out.println("Adding : " + currentint );
		 sum = sum + currentint;	
		}
		
		return sum;
		
	}
	
	

}
