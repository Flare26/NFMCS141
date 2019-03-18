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
*/
	
	String sentence = "";
	String word;
	word = scan.nextLine();
	
	while (! word.equals("end") )
	{
		sentence = sentence + " " + word;
		System.out.println(sentence);
		word = scan.nextLine();
	}
}
}
