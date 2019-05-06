package shipgame;
//hull lvl wep shield exp
public class Playership extends Player {
	
		
	
	public Playership(int hull, int lvl, int weapon, double shield, double exp)
	{
		super(hull, lvl, weapon, shield, exp);
		System.out.println("Creating Playership with custom parameters...");
	}

	

}
