//Nathan Frazier P590 #590
package arraypractice;

public class BooleanReturn {

	public static void main(String[] args) {
	
		int [] [] a = {
				{0,1,0,1,1},
				{1,0,0,1,1},
				{1,1,1,1,1}
		};
		
		boolean [] r = foo(a);
		for (int i = 0; i < r.length; i++)
		{
			System.out.println("Boolean [] Index : " + i);
			System.out.println("Value : " + r[i]);
		}
	}

	// = true if 0 false if other
	//length of returned should be = to input number of rows
	//every row same # of columns
	public static boolean [] foo(int [] [] a)
	{
	boolean [] rtn = new boolean [a.length];
	 for (int i = 0; i < a.length; i++)
	 {
		 rtn[i] = false;
		 
		 for (int j = 0; j < a[i].length; j++)
		 {
			 System.out.println("Element value = " + a[i][j] + " | row " + i + " index " + j);
			 if (a[i][j] == 0)
				 rtn[i] = true;
		 }
		 System.out.println();
	 }
	
		return rtn;
	}
}
