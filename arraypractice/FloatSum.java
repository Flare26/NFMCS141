//Nathan Frazier P595 #69
//Nathan Frazier P596 #72
package arraypractice;

public class FloatSum {

	public static void main(String[] args) {
		float [] [] array = { { (float) 3.6, (float) 3.3, (float) 2.2}, 
				{(float) 4.4, (float) 1.2} };
		
		float sum = elementSum(array);
		System.out.println("Sum of floats : " + sum);
		
		
		}
	


	public static float elementSum(float [] [] array)
	{ float sum = 0;
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
