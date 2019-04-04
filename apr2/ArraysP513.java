//Nathan Frazier page 513 programs 49 50 51 52
package apr2;

import java.util.Random;
public class ArraysP513 {
//Main to test all methods
	public static void main(String [] args)
	{
		ArraysP513 p = new ArraysP513();
		Random r = new Random();
		
		float random = 1 + r.nextFloat() * (100 - 1);
		float random2 = 1 + r.nextFloat() * (100 - 1);
		
		int a[] = {5, 4, 3, 2, 1};
		float f[] = {random, random2};
		
		for (int i = 0; i < a.length; i++)
			System.out.println( a[i] );
		
		System.out.println( "Elements: " +  p.countElements( a ) );
		System.out.println( "Product of elements: " +  p.productElements( a ) );
		
		p.emptyArray( a );
		
		for (int i = 0; i < a.length; i++)
			System.out.println( a[i] );
		
		for (int i = 0; i < f.length; i++)
			System.out.println( f[i] );
		
		p.multBy2( f );
		
		for (int i = 0; i < f.length; i++)
			System.out.println( "x2 : " + f[i] );
		
	}
	//49
	public int countElements( int x[] )
	{
		int elements = 0;
		for ( int i = 0; i < x.length; i++)
		{
			elements += 1;
		}
		
			return elements;
	}
	//50
	public int productElements( int x[] )
	{
		int product = 1;
		for ( int i = 0; i < x.length; i++)
		{
			int temp = x[i];
			product = product * temp;
		}
		return product;
	}
	//51
	public void emptyArray( int x[] )
	{
		for ( int i = 0; i < x.length; i++)
		x[i] = 0;
	}
	//52
	public void multBy2 ( float f[] )
	{
		for (int i = 0; i < f.length; i++)
		{
			f[i] = f[i] * 2;
		}
	}
}
