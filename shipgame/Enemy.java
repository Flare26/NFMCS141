package shipgame;

public class Enemy {

	public int enemytype;
	public int enemylevel;
	double xpreward = 0;
	
	public Enemy(int level, int type)
	{
		System.out.println("$^ Parameters recieved");
		enemytype = type;
		enemylevel = level;
		
	}
	
	public int getMaxhull(int inlvl)
	{
		System.out.println("$^ Calculating hull...");
		int hull = 0;
		hull += (10 * inlvl );
		return hull;
	}
	
	public double calcShields()
	{
		System.out.println("$^ Calculating shields...");
		return 0.00;
	}
	
	public String toString()
	{
		return "$^ Type = " + enemytype + "\tLevel = " + enemylevel + "\tXP reward = " + xpreward + "\n";
	}
	
}
