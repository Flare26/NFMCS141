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
	
}
