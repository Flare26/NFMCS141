package shipgame;

public class Player {

	private int Hull;
	private int LVL;
	private int Weapon;
	private double Shields;
	private double XP;

	
	public Player(int hull, int lvl, int weapon, double shields, double exp )
	{
		System.out.println("$ Creating object : [Player = *]");
		
		Hull = hull;
		LVL = lvl;
		Weapon = weapon;
		Shields = shields;
		XP = exp;
		
	}
	
	//hull lvl wep shield exp
	
	public int getHull()
	{
		System.out.println("$* Retrieving player hull...");
		return Hull;
	}
	
	public int getLVL()
	{
		System.out.println("$* Retrieving player LVL...");
		return LVL;
	}
	
	public int getWeapon()
	{
		System.out.println("$* Retrieving loadout...");
		return Weapon;
	}
	
	public void setWeapon(int wep)
	{
		System.out.println("$* Setting loadout...");
		Weapon = wep;
	}
	
	public int dealDMG(int wep)
	{
		int dmg = -10;
		switch (wep)
		{
		case 1 :
			dmg = 3;
			return dmg;
		default :
			System.err.println("[WEAPON INPUT NOT VALID]");
			return -15;
			
		
		}
	}
	
	public double getXP()
	{
		System.out.println("$* Retrieving player XP...");
		return XP;
	}
	
	public void setXP(double exp)
	{
		System.out.println("$* Setting player XP...");
		XP = exp;
	}
	
	public double getShields()
	{
		System.out.println("$* Retrieving player hull...");
		return Shields;
	}
	
	public void setShields(double shield)
	{
		System.out.println("$* Setting player shields...");
		Shields = shield;
	}
	
	public String toString()
	{
		return "\n" + "*Hull : " + Hull + "\n*Level : " + LVL + "\n*Weapon : " + Weapon + "\n*Shields : " 
				+ Shields + "\n*XP : " + XP;
	}

}
