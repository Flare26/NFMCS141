//Nathan Frazier program 43 page 257
package programs;
import java.util.Scanner;
public class Identifier {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a single char.");
		String input = scan.next();
		char c = input.charAt(0);
		
		boolean b;
		
		b = Character.isJavaIdentifierStart(c);
		if (b)
		{
		System.out.println(c + " May be a Java identifier start.");
		} else {
			System.out.println(c + " May be a Java identifier start.");
		}
	
	scan.close();
		
	}
}


