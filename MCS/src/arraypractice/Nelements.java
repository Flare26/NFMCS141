package arraypractice;

public class Nelements {

	public static void main(String[] args) {
		char [] [] array = {
				{'a','b','c','d',},
				{'e','f','g','z','v'},
				{'h','i','8'},
				{'k'},
				{'l'}
		};
		columns(2, array);
	}
//find a way to return column lengths 
// add 1 to an array that keeps track of column length then search the array for how many = n
	
/*
 * 
		int maxrowlength = 0;
		for (int i = 0; i < a.length; i++)
		{
			if (a[i].length > maxrowlength)
				maxrowlength = a[i].length;
 */
	public static int columns(int n, char [] [] a)
	{ 
		
		System.out.println("Looking for # of columns with 'n' elements where n = " + n);
		int [] columlengths = new int [a.length];
		int currentrow = 0;
		int elements = 0;
		do {
		for (int e = 0; e < a[currentrow].length; e++) //counts elements in current row
		{
			elements++;
		}
		System.out.println("Elements for row " + currentrow + " = " + elements);
		columlengths[currentrow] = elements; //store count of elements for that row in temp array
		elements = 0; //resets element count per row
		currentrow++; //move to next row 
		} while (currentrow < a.length); //while the current row is less than a.length
			
		return 0;
		}
		
	}
	

