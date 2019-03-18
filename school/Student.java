package school;
import java.util.Scanner;
public class Student {
	static String name;
	static String gpa;
	static String addy;
	static String phonenum;
	
	String stu1;
	String stu2;
	String stu3;
	
	private static Scanner scan = new Scanner(System.in);
	//put out here so you dont open multiple instances. Make private static so this class can access 
 
	public static String getName(String name) 
	{//so the constructor creates a String called name, and puts "unknown" into it because of the client
		
		System.out.println("Enter student name: ");
		name = scan.nextLine();
	
		return name;
		
	}
	
	public static String getGpa(String gpa)
	{
	
		System.out.println("Enter student GPA: ");
		gpa = scan.nextLine();
		
		return gpa;
		
	}
	
	public static String getAddy( String addy )
	{
	
		System.out.println("Enter student address: ");
		addy = scan.nextLine();
		
		return addy;
		
	}
	
	public static String getPhone( String phone ) //phone gets replace by phonenum from client class
	{
	
		System.out.println("Enter student phone #: ");
		phone = scan.nextLine(); // then replaced again with user input
		
		return phone;
		
	}
	
	
	public String getStuA(String name, String GPA, String stustats)
	{
		name = "Alexander The Great";
		GPA = "5.0";
		stustats = (name + "\n GPA: " + GPA);
		this.stu1 = stustats;
		return stustats;
	}
	
	public String getStuB(String name, String GPA, String stustats)
	{
		name = "Ivan The Terrible";
		GPA = "1.0";
		stustats = (name + "\n GPA: " + GPA);
		this.stu2 = stustats;
		return stustats;
	}
	
	public String getStuC(String name, String GPA, String stustats)
	{
		name = "Literally Ghandi";
		GPA = "\u221E";
		stustats = (name + "\n GPA: " + GPA);
		this.stu3 = stustats;
		return stustats;
	}
	
/* 	public static String utoString( String urinfo )
	{
		urinfo = ( "Name: " + name + " Address: " + addy + " Phone #: " + phonenum + " GPA: " + gpa );
		return urinfo;
	}
	This did not work at all just returned nulls */

}
