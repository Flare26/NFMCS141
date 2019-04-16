//Nathan Frazier P597 #85
package arraypractice;
import java.util.ArrayList;
import java.util.Scanner;
public class ArrayListGrades {
	
	private static Scanner input = new Scanner(System.in);
	private static ArrayList<Integer> alist = new ArrayList<Integer>();

	public static void main(String[] args) {
	
		System.out.println("Please enter scores 0-100 , type -1 when finished");
		int in = input.nextInt();
		
		while (in != -1)
		{
			alist.add(in);
			in = input.nextInt();
		}
		
		System.out.println("Converting array list...");
		System.out.println( convertGrades(alist) );


	}
	
	private static ArrayList<Character> convertGrades( ArrayList<Integer> inlist )
	{
		ArrayList<Character> gradeslist = new ArrayList<Character>( inlist.size() );
		
			for ( Integer currentelement : inlist )
		{
				System.out.println("Converting element : " + currentelement);
		
			if ( inlist.get(currentelement) >= 90 )
				gradeslist.add('A');
			
			if ( inlist.get(currentelement) < 90 && inlist.get(currentelement) >= 80 )
				gradeslist.add('B');
			
			if ( inlist.get(currentelement) < 80 && inlist.get(currentelement) >= 70 )
				gradeslist.add('C');
			
			if ( inlist.get(currentelement) < 70 && inlist.get(currentelement) >= 60 )
				gradeslist.add('D');
			
			if ( inlist.get(currentelement) < 60 )
				gradeslist.add('F');
			
		}
		
		return gradeslist;
	}

}
