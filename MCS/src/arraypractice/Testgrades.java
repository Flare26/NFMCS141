//Nathan Frazier P514 #63
package arraypractice;

public class Testgrades {

	private int STUDENT_COUNT;
	private double AVG;
	public int [] storegrades;
	
	public static void main(String[] args) {
		//MAIN to test the class
		
		Testgrades testgrades = new Testgrades(4);
		System.out.println("STUDENTS : " + testgrades.STUDENT_COUNT);
		
		int [] test01 = { 100, 75, 55, 25 };
		
		for ( int i = 0 ; i < test01.length; i++)
		{
			System.out.println( test01[i] );
		}
		
		testgrades.gradeSort(test01);
		System.out.println();
		
		for ( int i = 0 ; i < test01.length; i++)
		{
			System.out.println( test01[i] );
		}
		
		System.out.println(testgrades.toString(test01));

		
		System.out.println();
		double a = testgrades.averageGrade(test01);
		System.out.println("AVG : " + a);
		
		System.out.println();
		System.out.println( "MAX : " + testgrades.highestGrade(test01) );
		System.out.println();
		System.out.println("MEDIAN : " + testgrades.calcMedian(test01));
		
		
	}
	
	public Testgrades(int students)
	{
		
		storegrades = new int [students];
		STUDENT_COUNT = students;
		
	}

	public int getStudentCount()
	{
		return STUDENT_COUNT;
	}
	
	public int [] returnGrades( int [] g)
	{
		Testgrades n = new Testgrades(0);
		n.gradeSort(g);
		return g;
	}
	
	public void gradeSort( int [] g) //sorts in ascending order
	 {
	    int temp;
	    int j;

	    for ( int i = 1; i < g.length; i++ )
	    {
	      j = i;
	    temp = g[i];

	      while ( j != 0 && g[j - 1] > temp )
	      {
	         g[j] = g[j - 1];
	         j--;
	      }

	    g[j] = temp;
	    }
	  }
	
	public int highestGrade( int [] g )
	{
		int max = 0;
		
		for ( int i = 0; i < g.length; i++ )
		{
			if ( g[i] > max )
				max = g[i];
		}
		
		return max;
	}
	
	public double averageGrade( int [] g )
	{
		int students = 0;
		double sum = 0;
		
		for ( int i = 0; i < g.length; i++ )
		{
			sum = sum + g[i];
			students++;
		}
		System.out.println(sum);
		System.out.println(students);
		double avg = (float) sum / students;
		return avg;
	}
	
	//if the set is even, takes 1 up and down from half and converts it to index value
	public double calcMedian( int [] g )
	{
		if ( (g.length % 2 == 0) )
		{
			int upperindex = ( ( (g.length / 2) + 1 ) - 1); // - 1 at end because .length counts 0 as 1
			int lowerindex = ( ( (g.length / 2) - 1 ) - 1);
			
			double median = ( ( (float) g[upperindex] + g[lowerindex]) / 2 );
			return median;
		}
		else
		{
			double median = (double) g[g.length / 2];
			return median;
		}
	}
	
	public String toString( int [] g )
	{
		String s = "";
		for ( int i = 0; i < g.length; i++)
		{
			s = s + g[i] + " ";
		}
		return s;
	}
	
	 public boolean equals(Object o) { 
		  
	      
	        if (o == this) { 
	            return true; 
	        } 
	  
	    
	        if (!(o instanceof Testgrades)) { 
	            return false; 
	        } 
	          
	       
	        Testgrades c = (Testgrades) o; 
	        
	        return Double.compare( AVG, c.AVG) == 0
	                && Double.compare(STUDENT_COUNT, c.STUDENT_COUNT) == 0;
	} 
	  
}
