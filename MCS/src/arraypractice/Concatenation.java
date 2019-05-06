//Nathan Frazier P596 #80
package arraypractice;

public class Concatenation {
	
	public static void main(String [] args)
	{
		String [] [] ar = { {"Please", "Excuse", "My"},
				{"Dear", "Aunt Sally"} } ;
		
		System.out.println("Concatenation : " + concat(ar));
	}
	
	//This method takes a 2D string array and, yeah
	public static String concat(String [] [] array)
	{
		String c = "";
		for ( String [] row : array)
		{
			for ( String i : row )
			{
				c += i;
			}
		}
		return c;
	}
}
