//Nathan Frazier P595 #69
package arraypractice;

public class ElementCount {

	public static void main(String[] args) {
		float [] [] array = { { (float) 3.6, (float) 3.3, (float) 2.2}, 
				{(float) 4.4, (float) 1.2} };
		
		int count = elementCount(array);
		System.out.println("Element count : " + count);
		
		
		}
	


	public static int elementCount(float [] [] array)
	{ int count = 0;
		for (float [] row : array)
		{
			for (float j : row )
			{
				count++;
			}
		}
		return count;
	}
}
