//Nathan Frazier P779 #60
package iopractice;

import java.io.Serializable;

public class Home implements Serializable {
	
	public int rooms;
	public double footage;
	public boolean hasBasement;

	public Home(int r, double f, boolean b)
	{
		rooms = r;
		footage = f;
		hasBasement = b;
	}
	
	public String toString()
	{
		return ("Rooms = " + rooms + " | Footage^2 = " + footage + " | Has basement = " + hasBasement);
	}
	
}
