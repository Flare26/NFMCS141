package programs;

public class Scratch2 {
private enum Seasons { Winter, Spring, Summer, Fall } ;
	private char letterGrade;
	public void Grade( char lg )
	{
		letterGrade = lg;
	}
	

	
	public static void main(String[] args) { //Access each element in multidimensional
		int product=1;
	int [] [] array = { {5, 5}, {2, 1} };
	product = 1;
	for ( int[] item : array )
	{
		for ( int i : item )
		{
			//System.out.println(i);
			product *= i;
		}
	}
	System.out.println(product);

		
		
		
	}
	
	//This should return array of booleans 0 F 1 T
	public boolean [] foo( int [] a )
	{
		boolean [] temp = new boolean [a.length];
		
		for ( int i = 0; i < a.length; i++ )
		{
			if ( a[i] == 0 )
				temp[i] = false;
			if ( a[i] == 1 )
				temp[i] = true;
		}
		return temp;
	}

}
