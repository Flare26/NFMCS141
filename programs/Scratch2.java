package programs;

public class Scratch2 {
private enum Seasons { Winter, Spring, Summer, Fall } ;
	private char letterGrade;
	public void Grade( char lg )
	{
		letterGrade = lg;
	}
	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub


		
		
		
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
