//Nathan Frazier program 50 page 259
package programs;
import java.util.Scanner;
public class ProbableSeason {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("What is the temperature? [Enter a whole number]");
		int temp = scan.nextInt();
		System.out.println(temp + "F");
		String season = "Unknown";
		
		if (temp >= 90)
		{
			season = "Summer";
		}
		
		if ( (temp<=90) && (temp>=70) )
		{
			season = "Spring";
		}
			
		if ( (temp<70) && (temp>=50) )
		{
			season = "Fall";
		}
		
		if ( temp < 50 )
		{
			season = "Winter";
		}
		
		if ( (temp > 110) || (temp < -5) )
		{
			season = "Invalid temp range!";
		}
		
			
		switch (season)
		{
		case "Summer":
			System.out.println("Probably Summer");
			break;
			
		case "Spring":
			System.out.println("Probably Spring");
			break;
			
		case "Fall":
			System.out.println("Probably Fall");
			break;
			
		case "Winter":
			System.out.println("Probably Winter");
			break;
			
		default:
			System.out.println(season);
			break;
		
		}
		scan.close();
	}

}
