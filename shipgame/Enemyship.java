package shipgame;

public class Enemyship extends Enemy {
	
	public int enemyhull;
	public double enemyshields;
	
	public Enemyship(int inlevel, int intype)
	{
		super(inlevel, intype);
		System.out.println("^ Creating object : [Enemyship = ^]");
		enemyhull = getMaxhull(inlevel);
		//enemyshields = this.calcShields();
	}
	
	public void takeDamage(int indmg)
	{
		if ( indmg >= enemyhull)
		enemyhull -= indmg;
		else
		enemyhull = 0;
	}
	
	public int getEnemyhull()
	{
		//System.out.println("\nGetting current enemy hull...");
		return enemyhull;
	}
	
	public double getEnemyshields()
	{
		System.out.println("\nGetting current enemy shields...");
		return enemyshields;
	}

	
	public String toString()
	{
		System.out.println("^ Calling toString()" );
		return super.toString() + " ^ Enemy Hull = " + this.getEnemyhull();
	}
}
