//Nathan Frazier program 61 pg 160
package programs;
import java.util.Scanner;
import java.text.DecimalFormat;
public class Basketball {

	public static void main(String[] args) {
		Scanner seebot = new Scanner (System.in);
		System.out.println("I am B-Bot,"
				+ "\nI'll calculate b-ball shot accuracy %.");
		System.out.println("Enter # shots taken.");
			double s1 = seebot.nextInt();
			
		System.out.println("Enter # shots made.");
			double s2 = seebot.nextInt();
			
		System.out.println("Thank you! Calculating...");
		DecimalFormat percent = new DecimalFormat("#.##%");
		double result = s2 / s1 ;
		System.out.println("Shot accuracy:  " + percent.format(result));
		//use the format I made (percent) and apply double result to that using .format() method of DecimalFormat class
		if (result == 1)
			System.out.println("You're an absolute legend!");
		
		if ( (0.75 <= result) && (result <= 0.99) )
			System.out.println("Outstanding work! Dinner is on me.");
		
		if (result <= .5)
			System.out.println("is < 51%"
					+ "\nKeep practicing! You got this.");
		seebot.close();
		
			
			

	}

}
