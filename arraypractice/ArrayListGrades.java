//Nathan Frazier P597 #85
package arraypractice;
import java.util.ArrayList;
import java.util.Scanner;
public class ArrayListGrades {
	
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		ArrayList<Integer> alist = new ArrayList<Integer>();
		System.out.println("Please enter scores 0-100 , type -1 when finished");
		int in = input.nextInt();
		
		while (in != -1)
		{
			
			alist.add(in);
			in = input.nextInt();

		}
		
		System.out.println("Converting array list... size = " + alist.size() );
	
		//Next line stores the new char list returned by method convertGrades()
		ArrayList<Character> done = convertGrades(alist, alist.size() );
		System.out.println("_________________________________\n");
		
		for (int i = 0; i < done.size(); i++)
		{
		System.out.println( "Char array index [" + i + "] = " + done.get(i) );
		}


	}
	
	private static ArrayList<Character> convertGrades( ArrayList<Integer> inlist, int size )
	{
		ArrayList<Character> gradeslist = new ArrayList<Character>( size );
		
			for ( int index = 0; index < size; index++ )
		{
				System.out.println("Converting inlist @ index [" + index + "] = " + inlist.get(index) );
				int currentelement = inlist.get(index);
		
			if ( currentelement >= 90 )
				gradeslist.add('A');
			
			if ( currentelement < 90 && currentelement >= 80 )
				gradeslist.add('B');
			
			if ( currentelement < 80 && currentelement >= 70 )
				gradeslist.add(index, 'C');
			
			if ( currentelement < 70 && currentelement >= 60 )
				gradeslist.add(index, 'D');
			
			if ( currentelement < 60 )
				gradeslist.add(index, 'F');
			
		}
		
		return gradeslist;
	}

}
