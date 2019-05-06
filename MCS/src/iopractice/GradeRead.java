//Nathan Frazier P777 #47
package iopractice;
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class GradeRead {
	
	private String filename = "";
	private Scanner parse;
	private int count = 0;
	private int sum = 0;
	
	public GradeRead(String filename)
	{
		this.filename = filename;
	}
	
	public static void main(String [] args)
	{
		GradeRead graderead = new GradeRead("testgrades.txt"); //instance with testgrades.txt as target
		graderead.readFile(); //sets count and sum
		
		int avg = graderead.getAVG(graderead.count, graderead.sum);
		System.out.println("The average grade was = " + avg);
	}
	
	public void readFile()
	{
		try
		{
			File file = new File(this.filename);
			parse = new Scanner(file);
			while (parse.hasNext())
			{
				String token = parse.next();
				System.out.println("Token " + count + " : " + token);
				sum += Integer.parseInt(token);
				count++;
			}
			System.out.println("End of file detected");
		}
		
		catch (FileNotFoundException e)
		{
			System.out.println("File not found :( " + e.getMessage());
		}
	}

	public int getAVG(int count, int sum)
	{
		//System.out.println(count);
		//System.out.println(sum);
		System.out.println("Getting AVG...");
		float avg;
		if (sum != 0)
		{
			avg = (sum / count);
			return ((int) avg);
		}
		else
		{
			return -1;
		}
	}
}
