//Nathan Frazier P595 #71
package arraypractice;
import java.util.ArrayList;
public class Nelements {

	public static void main(String[] args) {
		char [] [] array = {
				{'a','b','c','d',},
				{'e','f','g','z','v'},
				{'h','i','8'},
				{'k'},
				{'l'}
		};
		System.out.println("Returned value ==> " + columns(2, array) );
		
	}
//find a way to return column lengths 
// add 1 to an array that keeps track of column length then search the array for how many = n
//So store the lengths in an array list. The number of columns must be how many rows >= n.
	public static int columns(int n, char [] [] array)
	{ 
		ArrayList<Integer> rl = new ArrayList<Integer>();
		System.out.println("Looking for # of columns with 'n' elements where n = " + n);
		
		for ( char [] row : array )
		{
			System.out.println(row);
			rl.add(row.length);
		}
		
		int c = 0;
		
		for ( int i = 0; i < rl.size(); i++)
		{
			if ( (rl.get(i) - n) >= 0)
				c++;	
		}
		System.out.println("Array List with row lengths : " + rl.toString());
		System.out.println("Columns with " + n + " elements = " + c);
		return c;
	}
}
	

