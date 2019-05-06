//Nathan Frazier
package programs;
import java.util.Random;

public class SortClient
{

	
   public static void main( String [ ] args )
   {
	   long startTime, stopTime;
	   double duration;
	 
	
     
	  // instantiate an array and fill with random values
     int [ ] numbers = new int [6];
     Random rand = new Random( );
     for ( int i = 0; i < numbers.length; i++ )
     {
       numbers[i] = rand.nextInt( 5000 ) + 1;
     }
     
     System.out.println( "Before Selection Sort, the array is" );
     for ( int i = 0; i < numbers.length; i++ )
        System.out.print( numbers[i] + "\t" );
     System.out.println( );
     
     startTime = System.nanoTime();
     Sorter.selectionSort( numbers ); // sort the array
     stopTime = System.nanoTime();
     duration = (stopTime - startTime) / 1000000000.00;
     System.out.println(duration + " seconds");
     
     System.out.println( "\nAfter Selection Sort, the array is"  );
     for ( int i = 0; i < numbers.length; i++ )
          System.out.print( numbers[i] + "\t" );
     System.out.println( );
     
//Insertion Sort
     System.out.println( "\nBefore Insertion Sort, the array is" );
     for ( int i = 0; i < numbers.length; i++ ) 
     {   numbers[i] = rand.nextInt( 5000 ) + 1; 
        System.out.print( numbers[i] + "\t" );
     }
     System.out.println( );
 
     
     startTime = System.nanoTime();
     Sorter.insertionSort( numbers ); // sort the array
     stopTime = System.nanoTime();
     duration = (stopTime - startTime) / 1000000000;
     System.out.println(duration + " seconds");
     
     System.out.println( "\nAfter Insertion Sort, the array is"  );
     for ( int i = 0; i < numbers.length; i++ )
          System.out.print( numbers[i] + "\t" );
     System.out.println( );
     
     
     for ( int i = 0; i < numbers.length; i++ )
     {
       numbers[i] = rand.nextInt( 5000 ) + 1;
     }
//Bubble Sort
     System.out.println( "\nBefore Bubble Sort, the array is" );
     for ( int i = 0; i < numbers.length; i++ )
        System.out.print( numbers[i] + "\t" );
     System.out.println( );
     
     startTime = System.nanoTime();
     Sorter.bubbleSort( numbers ); // sort the array
     stopTime = System.nanoTime();
     duration = (stopTime - startTime) / 1000000000;
     System.out.println(duration + " seconds");
     
     System.out.println( "\nAfter Bubble Sort, the array is"  );
     for ( int i = 0; i < numbers.length; i++ )
          System.out.print( numbers[i] + "\t" );
     System.out.println( );
     
     
   }
}
