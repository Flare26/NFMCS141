//Nathan Frazier PP415 #58 client
package mar19;

public class Courseclient {
public static void main(String [] args)
{
	Course c0 = new Course( "MCS 141", "First course for computer science", 2);
	Course c1 = new Course( "MCS 942", "First course for computer science", 3.5);
	
	c0.setCredits(3.5);
	
	System.out.println(c0.toString());
	System.out.println(c0.equals(c0));
	System.out.println(c0.equals(c1));
}
	
}
