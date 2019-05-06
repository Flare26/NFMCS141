//Nathan Frazier P595 #69
//Nathan Frazier P596 #72
package arraypractice;

public class FloatSum {

	public static void main(String[] args) {
		float [] [] array = { { (float) 3.6, (float) 3.3, (float) 2.2}, 
				{(float) 4.4, (float) 1.2} };
		System.out.println("Sum of floats : " + elementSum(array));
		System.out.println("# of elements : " + elementCount(array));
		}
	
	//This method counts the number of elements only (P595 #69)
	public static int elementCount(float [] [] array)
	{
		int count = 0;
		for (float [] row : array)
		{
			System.out.println(); //Separates each row with a blank line
			for (float i : row)
			{
				System.out.println(i);
				count++;
			}
		}
		System.out.println();
		return count;
	}

	//This method finds the sum of floats (P596 #72)s
	public static float elementSum(float [] [] array)
	{	
		float sum = 0;
		for (float [] row : array)
		{
			for (float j : row )
			{
				sum += j;
			}
		}
		return sum;
	}
}
