package textadventure;

public abstract class Room {

	int [] locations;
	int cl;
	boolean iscomplete;
	
	public Room(int locations)
	{
		this.locations = new int [locations];
		cl = this.locations[0]; //Sets default location at enterance
		iscomplete = false;
	}
	
	public String currentLString();
	
	public void setCurrentLocation(int L)
	{
		cl = locations[L];
	}
	
	public int getCurrentLocation()
	{
		return cl;
	}
	
	public boolean isComplete()
	{
		return iscomplete;
	}
	
	public void finishRoom()
	{
		iscomplete = true;
		System.out.println("[LEVEL CLEARED]");
	}
	
}
