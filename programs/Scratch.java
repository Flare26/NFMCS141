package programs;
import java.util.Scanner;
public class Scratch {
	static String name = "Discovery" ;
	static int number = 100;
	static boolean cable = false;
	
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
	
	/* String sentence = "";
	String word;
	word = scan.nextLine();
	
	while (! word.equals("end") )
	{
		sentence = sentence + " " + word;
		System.out.println(sentence);
		word = scan.nextLine();
	}
	*/
	
	String channelname =  Scratch.setName();
	System.out.println(channelname);
	Scratch.hasCable();
	Scratch.cableCheck();



}

//outside of main


public static void setName()
{
	name = "Food Network";
}

public static void setNumber()
{
	number = 101;
}

public static void hasCable()
{
	cable = true;
}

public static void cableCheck()
{
	if (cable)
	{
		System.out.println("Cable");
	} else
		System.out.println("Network");
}


}
