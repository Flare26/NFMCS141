package programs;
import java.io.*;
import java.util.*;

public class FourtyFive {
	public Scanner z;
	public void openFile () {
		try {
			z = new Scanner(new File("info.txt"));
		}
		catch (Exception e) {
			System.out.println("Does not exist");
		}
	}
	public void readFile()
	{
		int counter = 0;
		double a; //initialize doubles
		double b = 0;
		double c = 0;
		double d = 0;
		double e = 0;
		
		while (z.hasNextDouble())
		{
			//System.out.println("Entered loop"); 
			counter = counter+1;
			
			a = z.nextDouble(); //set a = next double in info.txt
			//System.out.println("just ran z.nextDouble()");
			System.out.println(a+" [VALUE "+counter+"]");
		
			
			
			switch (counter)	{ //only works for 4 text file values, there is probably a better way
			
			/*
			double b;
			double c;
			double d;
			double e;
			*/
		
			case 1:
				b = a;  //for some reason, had to change from 'b' to 'b1' ect...
						//erase the double constructor now that I int. them at the beginning of the loop
			case 2:
				c = a;
			case 3:
				d = a;
			case 4:
				e = a;
			default:
				break;
			
			}
			
		} //end of while nextDouble()
		
		System.out.println("All done!");
		double AVG = ((b+c+d+e)/counter);
		System.out.println("The average of these values is... " + AVG+"!"); //had to move this out of the while(z.nextDouble())
		
	}
	
	public void closeFile() {
		z.close();
		}

}
//Nathan frazier fourtyfive, pointed to by mainfourtyfive.java and reads info.txt