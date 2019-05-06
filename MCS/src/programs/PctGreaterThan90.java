//Nathan Frazier in class p 513 program 53
package programs;

public class PctGreaterThan90 {

	public static double getPctGEQ90(int [] scores)
	{
		int count = 0;
		
		for (int i = 0; i < scores.length; i++)
		{
			if ( scores[i] >= 90 )
				count++;
		}
		
		return ( ( (double) count / scores.length ) * 100 ); //length is absolute length including 0 as 1
		
		//System.out.println("Link.... START!");
		//return 0.0;
	}
	
	
	public static void main(String[] args)
	{
		int [] intArr = { 0, 16, 32, 90, 89, 98, 100, 1, 400 };
		
		double pct = getPctGEQ90(intArr); //passes intArr array into method getPctGT90
		System.out.println("Percent of data >= 90 is: " + pct );
	}
	
}
//return type for arrays are square brakcets