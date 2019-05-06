//Nathan Frazier pp 596 # 74
package arraypractice;
// array.length returns number of rows, array[i].length returns number of elements in row
public class Sumlastcolumn {
	

	public static void main(String[] args) {
		
		int [] [] array1 = {
				{8, 8, 8, 16},
				{2, 4, 8, 16},
				{16, 16},
				{0, 0, 0, 0, 0, 16}
		};
		
		for ( int i = 0; i < array1.length; i++ )
		{
			System.out.println();
			for ( int j = 0; j < array1[i].length; j++ )
			{
				System.out.println(array1[i][j] + "\t" );
			}
		}
		
		int arraysum = lastSum( array1 );
		System.out.println();
		System.out.println("Sum of elements in last column of each row : " + arraysum );

	}

	public static int lastSum( int [] [] arrayin )
	{
		int total = 0;
		int last;
		
		for ( int i = 0; i < arrayin.length; i++ )
		{
			
			last = arrayin[ i ] [ arrayin[ i ].length - 1];
		//( arrayin [ arrayin[i].length - 1 ] ) += sum;
		
			total += last; // total = total + last
		
		}
		
		return total;
	}
	
}
