//Nathan Frazier
package programs;
import java.util.Random;

public class SortClient
{
   public static void main( String [ ] args )
   {
     // instantiate an array and fill with random values
     int [ ] numbers = new int [6];
     Random rand = new Random( );
     for ( int i = 0; i < numbers.length; i++ )
     {
       numbers[i] = rand.nextInt( 5000 ) + 1;
     }

     System.out.println( "Before Insertion Sort, the array is" );
     for ( int i = 0; i < numbers.length; i++ )
        System.out.print( numbers[i] + "\t" );
     System.out.println( );

     Sorter.insertionSort( numbers ); // sort the array

     System.out.println( "\nAfter Insertion Sort, the array is"  );
     for ( int i = 0; i < numbers.length; i++ )
          System.out.print( numbers[i] + "\t" );
     System.out.println( );
     
     
     for ( int i = 0; i < numbers.length; i++ )
     {
       numbers[i] = rand.nextInt( 5000 ) + 1;
     }

     System.out.println( "\nBefore Bubble Sort, the array is" );
     for ( int i = 0; i < numbers.length; i++ )
        System.out.print( numbers[i] + "\t" );
     System.out.println( );

     Sorter.bubbleSort( numbers ); // sort the array

     System.out.println( "\nAfter Bubble Sort, the array is"  );
     for ( int i = 0; i < numbers.length; i++ )
          System.out.print( numbers[i] + "\t" );
     System.out.println( );
     
     
   }
}
