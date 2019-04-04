package programs;
import java.util.Scanner;
public class Scratch {
static Scanner scan = new Scanner(System.in);
public static void main(String[] args)
{
/* System.out.println("Enter an int value,"
		+ " enter -1 to stop");
int value = scan.nextInt();
int total = 0;
while ( ! (value == -1) ) //CAN read outside of loop
{

	total = value + total;
	System.out.println(total);
	value = scan.nextInt();
	
}

	
	String sentence = "";
	String word;
	word = scan.nextLine();
	
	while (! word.equals("end") )
	{
		sentence = sentence + " " + word;
		System.out.println(sentence);
		word = scan.nextLine();
	}
	*/
	
String word = "Java dot exe";
	  System.out.println ( word.length( ));
	  
int num = 0x3e80;
	System.out.println (num);
	
// int number = 6;
//	  double d = number;
//	  number = 19.0;
	
	String s = "The three deer.";
			System.out.println(s.substring(4, 9));
			
	for (int y = 0; y < 3; y++)
	{
		System.out.println("Henlo");
	}
	
	String q = "The three deer.";
	System.out.println(q.indexOf("tree"));
	
	String line = "Some more silly stuff on strings!";
	   // the words are separated by a single space

	   int i = line.indexOf( "m" );
	   String str = line.substring(10,15) + line.substring(25, 25 + i );
	   System.out.println(str);
	   
	   double result = (double) 9 / 2;
	   System.out.println(result);
	   
	/*   int v = 6;
	   int product = 1;
	   do
	   {
		   System.out.println( "oo ");
	         product *= v;
	         i++;
	   } while (v < 9);
	   System.out.println(product + "oo " + v);
	*/
	   double [] a = { 12.5, 48.3, 65.0 } ; 
	   System.out.println( a[1] );
	   
	   int bucky [] = new int  [20];
}
}
