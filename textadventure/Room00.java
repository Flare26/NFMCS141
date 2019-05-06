package textadventure;

public class Room00 extends Room {

	// [0] enterance [1] hallway [2] attic
	
	public Room00(int locations)
	{
		super(locations);
		
	}
	
	public int isAt()
	{
		return super.getCurrentLocation();
	}
	public String currentLString()
	{
		int l = getCurrentLocation();
		switch (l)
		{
		case 0 :
			return "Front Door";
		case 1 :
			return "Upstairs Hallway";
		case 2 :
			return "Attic";
		default : 
			return "NULL";
		}
	}
}
