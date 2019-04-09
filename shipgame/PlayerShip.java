package shipgame;
import java.lang.Math.*;
public class PlayerShip {

	public String PLAYERNAME;
	public double shields;
	public double hull;
	public int weaponselect; // 1 cannon 2 EMP
	
	
	public static void main ( String [] args )
	{
		PlayerShip p1 = new PlayerShip("TL-38", 1 );
		System.out.println( p1.toString() );
		
	}
	
	public PlayerShip(String name, int level)
	{
		if ( level < 1 )
		{
			System.out.println("level < 1 set to 1 //15");
			level = 1;
		}
	
		
		PLAYERNAME = name;
		hull = Math.log(level) + 10;
		
	}
	
	public String toString()
	{
		String S = Double.toString(shields);
		String H = Double.toString(hull);
		return PLAYERNAME + S + H ;
		
	}
	
}
