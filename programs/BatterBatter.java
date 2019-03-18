//Nathan Frazier program 42 pg 257
package programs;
import java.util.Scanner;
import java.text.DecimalFormat;
public class BatterBatter {

	public static void main(String[] args) {
		Scanner seebot = new Scanner (System.in);
		System.out.println("I am B-Bot,"
				+ "\nI'll detemine all-stars eligibility!");
		System.out.println("Enter # of at-bats.");
			double s1 = seebot.nextInt();
			
		System.out.println("Enter # of hits.");
			double s2 = seebot.nextInt();
			
		System.out.println("Thank you! Calculating...");
		DecimalFormat percent = new DecimalFormat("#.##%");
		double result = s2 / s1 ;
		System.out.println("Hit accuracy:  " + percent.format(result));
		//use the format I made (percent) and apply double result to that using .format() method of DecimalFormat class
		if (result > 0.3 )
		{
			System.out.println("You made it into the all-stars game!");
		} else {
			System.out.println("Sorry, you are not eligible.");
		}
		seebot.close();
		
			
			

	}

}
