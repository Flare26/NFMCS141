//Natahn Frazier pp 596 # 73
package arraypractice;

public class Reset {

	public static void resetElements( int [] [] array )
	{
		for ( int i = 0; i < array.length; i++ )
		{
			for ( int j = 0; j < array[i].length; j++ )
			{
				if ( i % 2 == 0 ) //even row
					array[i][j] = 0;
				else
				{
					array[i][j] = 1;
				}
			}
		}
	}
	
	public static void main ( String [] args )
	{
		int [] [] arr = {
				
				{12, 13, 14, 15, 16, 17},
				{1, 2, 3, 4, 5, 6},
				{0, 1 ,2 , 3, 4, 5, 6 }
				
		};
		
		resetElements( arr );
		for ( int i = 0; i < arr.length; i++ )
		{
			System.out.println();
			for ( int j = 0; j < arr[i].length; j++ )
			{
				System.out.println(arr[i][j] + "\t" );
			}
				
		}
	}
}
