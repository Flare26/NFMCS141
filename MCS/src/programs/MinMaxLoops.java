package programs;
import java.util.Scanner;
public class MinMaxLoops {
private static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
	
		double min = 0;
		double max = 0;
		double sum;
		double g;
		System.out.println("Enter 10 exam grades. Outputs will be MIN, MAX, and AVG."
				+ "\nEnter first grade: ");
		
		g = scan.nextDouble();
		min = g;
		max = g;
		sum = g;
		
		if (min < 0 || max > 100)
		{
			System.out.println("ERROR: INVALID GRADE {goodbye} ");
			System.exit(0);
		}
		
;		for (int i = 9; i > 0; i--)
		{
			if (min < 0 || max > 100)
			{
				System.out.println("ERROR: INVALID GRADE {goodbye} ");
				System.exit(0);
			}
			//NOTE: Making a loop check for this^ outside the for wont work cuz itll get stuck inside here anyway
			
			System.out.println("Enter next grade | Grades left: " + i);
			
			g = scan.nextDouble();
			
			if ( g >= max)
				max = g;
			if ( g <= min )
				min = g;
			
			sum += g;
			
		}
float avg = (float) sum / 10;
	System.out.println("All grades entered. Calculating min/max/avg..."
			+ "\nMAX: " + max
			+ "\nMIN: " + min
			+ "\nAVG: " + avg);
		System.exit(0);
	
		
	
	}

}
